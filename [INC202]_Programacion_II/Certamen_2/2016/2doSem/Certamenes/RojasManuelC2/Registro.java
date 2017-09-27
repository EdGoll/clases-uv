import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Registro {

    private List<String> lineas;
    private List<Provincia> lProvincia;
    private List<Region> lRegion;
    private List<Comuna> lComuna;
    private List<Academico> lAcademico = new ArrayList<>();
    private List<Alumno> lAlumno = new ArrayList<>();
    private List<Funcionario> lFuncionario = new ArrayList<>();

    public Registro() {
        init();
    }

    private void init() {
        String s;
        Scanner sc;
        do {
            sc = new Scanner(System.in);
            leerComunas();
            leerProvincias();
            leerRegiones();
            interaccion();
            System.out.println("Para añadir a otra persona ingrese un 1");
            s = sc.nextLine();
        } while (s.equals("1"));
    }

    private void interaccion() {
        Persona p = new Persona();
//        String DNI, nombre, apellidos, edad;
        Direccion dPersonal = new Direccion(), dLaboral = new Direccion();
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingrese los datos de la persona\nDNI: ");
        p.setDni(sc.nextLine());
        System.out.print("\nNombre: ");
        p.setNombre(sc.nextLine());
        System.out.print("\nApellidos: ");
        p.setApellidos(sc.nextLine());
        System.out.print("\nEdad: ");
        p.setEdad(sc.nextLine());
        System.out.print("\nDireccion personal: ");
        dPersonal.setComuna(mostrarRegiones());
        System.out.println("\nCalle: ");
        dPersonal.setCalle(sc.nextLine());
        System.out.println("\nNumero: ");
        dPersonal.setNumero(sc.nextLine());
        p.setDireccionPersonal(dPersonal);
        System.out.print("\nDireccion laboral: ");
        dLaboral.setComuna(mostrarRegiones());
        System.out.println("\nCalle: ");
        dLaboral.setCalle(sc.nextLine());
        System.out.println("\nNumero: ");
        dLaboral.setNumero(sc.nextLine());
        p.setDireccionLaboral(dLaboral);
        interaccionTipoPersona(p, Integer.parseInt(tipoPersona()));
        cargarLineas();
        FuenteDatos.escribirArchivo("Registro.txt", lineas);
    }

    private Comuna mostrarRegiones() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Seleccione el id de una region mostrada");
        System.out.println("ID\tRomano\tNOMBRE\n");
        Collections.sort(lRegion, new Comparator<Region>() {
            @Override
            public int compare(Region r1, Region r2) {
                return new Integer(Integer.parseInt(r1.getOrdenGeografico())).compareTo(Integer.parseInt(r2.getOrdenGeografico()));
            }
        });
        for (int i = 0; i < lRegion.size(); i++) {
            System.out.println(lRegion.get(i).getIdRegion() + "\t" + lRegion.get(i).getNumeroRomano() + "\t" + lRegion.get(i).getNombre());
        }
        return mostrarProvincias(sc.nextLine());
    }

    private Comuna mostrarProvincias(String idRegionSelec) {
        if(idRegionSelec.equals("")){
            return noRegistraComuna();
        }
        Scanner sc = new Scanner(System.in);
        List<Provincia> provAux = new ArrayList<>();
        if (Integer.parseInt(idRegionSelec) < 1 || Integer.parseInt(idRegionSelec) > 15) {
            System.out.println("Region seleccionada no valida");
            mostrarRegiones();
        } else {
            System.out.println("Seleccione el id de una provincia mostrada");
            System.out.println("ID\tNOMBRE\n");
            for (int i = 0; i < lProvincia.size(); i++) {
                if (idRegionSelec.equals(lProvincia.get(i).getIdRegion())) {
                    provAux.add(lProvincia.get(i));
                    System.out.println(lProvincia.get(i).getIdProvincia() + "\t" + lProvincia.get(i).getNombre());
                }
            }
        }
        return mostrarComunas(provAux, sc.nextLine(), idRegionSelec);

    }

    private Comuna mostrarComunas(List<Provincia> lp, String idProvSel, String idRegionSelec) {
        int lastElem = lp.size() - 1;
        boolean cond = false;
        Comuna c = new Comuna();
        Scanner sc = new Scanner(System.in);
        if (Integer.parseInt(idProvSel) < Integer.parseInt(lp.get(0).getIdProvincia()) || Integer.parseInt(idProvSel) > Integer.parseInt(lp.get(lastElem).getIdProvincia())) {
            System.out.println("Provincia no valida");
            mostrarProvincias(idRegionSelec);
        } else {
            do {
                List<Comuna> comAux = new ArrayList<>();
                System.out.println("Seleccione el id de una comuna mostrada");
                
                System.out.println("ID\tNOMBRE\n");
                for (int i = 0; i < lComuna.size(); i++) {

                    if (idProvSel.equals(lComuna.get(i).getIdProvincia())) {
                        comAux.add(lComuna.get(i));
                        System.out.println(lComuna.get(i).getIdComuna() + "\t" + lComuna.get(i).getNombre());

                    } else if (idProvSel.equals("")) {
                        return noRegistraComuna();
                    }
                }
                if(comAux.isEmpty()){ //Modificar si se modifica dataset Comuna.csv
                    System.out.println("No hay comunas registradas todavía");
                    return mostrarProvincias(idRegionSelec);
                }
                String s = sc.nextLine();
                
                for (int j = 0; j < comAux.size(); j++) {
                    if (comAux.get(j).getIdComuna().equals(s)) {
                        cond = true;
                        c = comAux.get(j);
                        break;
                    }

                }
                if(!cond)
                System.out.println("Comuna no valida");
            } while (!cond);
        }
        return c;
    }

    private void interaccionTipoPersona(Persona p, int tipoPersona) {
        Scanner sc = new Scanner(System.in);
        switch (tipoPersona) {
            case 1:
                Academico ac = new Academico();
                ac.setDni(p.getDNI());
                ac.setNombre(p.getNombre());
                ac.setApellidos(p.getApellidos());
                ac.setEdad(p.getEdad());
                ac.setDireccionPersonal(p.getDireccionPersonal());
                ac.setDireccionLaboral(p.getDireccionLaboral());

                boolean a = false;
                if (!lAcademico.isEmpty()) {
                    int i = 0;
                    for (Academico acd : lAcademico) {
                        if (ac.getDNI().equals(acd.getDNI())) {
                            lAcademico.remove(i);
                            System.out.println("Ingrese horario de atencion: ");
                            ac.setHorario(sc.nextLine());
                            lAcademico.add(i, ac);
                            a = true;
                            break;
                        }
                        i++;
                    }
                }
                if (!a) {
                    System.out.println("Ingrese horario de atencion: ");
                    ac.setHorario(sc.nextLine());
                    lAcademico.add(ac);
                }
                break;
            case 2:
                Alumno al = new Alumno();
                al.setDni(p.getDNI());
                al.setNombre(p.getNombre());
                al.setApellidos(p.getApellidos());
                al.setEdad(p.getEdad());
                al.setDireccionPersonal(p.getDireccionPersonal());
                al.setDireccionLaboral(p.getDireccionLaboral());

                a = false;
                if (!lAlumno.isEmpty()) {
                    int i = 0;
                    for (Alumno alm : lAlumno) {
                        if (al.getDNI().equals(alm.getDNI())) {
                            lAlumno.remove(i);
                            System.out.println("Ingrese horario de atencion: ");
                            al.setHorario(sc.nextLine());
                            lAlumno.add(i, al);
                            a = true;
                            break;
                        }
                        i++;
                    }
                }
                if (!a) {

                    System.out.println("Ingrese asignaturas (Ej: Programacion, Calculo, Fisica): ");
                    al.setHorario(sc.nextLine());
                    lAlumno.add(al);
                }
                break;
            case 3:
                Funcionario fu = new Funcionario();
                fu.setDni(p.getDNI());
                fu.setNombre(p.getNombre());
                fu.setApellidos(p.getApellidos());
                fu.setEdad(p.getEdad());
                fu.setDireccionPersonal(p.getDireccionPersonal());
                fu.setDireccionLaboral(p.getDireccionLaboral());

                a = false;
                if (!lFuncionario.isEmpty()) {
                    int i = 0;
                    for (Funcionario fun : lFuncionario) {
                        if (fu.getDNI().equals(fun.getDNI())) {
                            lAcademico.remove(i);
                            System.out.println("Ingrese horario de atencion: ");
                            fu.setHorarioLaboral(sc.nextLine());
                            lFuncionario.add(i, fu);
                            a = true;
                            break;
                        }
                        i++;
                    }
                }
                if (!a) {

                    System.out.println("Ingrese horario laboral: ");
                    fu.setHorarioLaboral(sc.nextLine());
                    lFuncionario.add(fu);
                }
                break;
            default:
                System.out.println("Tipo de persona invalido");
                break;
        }
    }

    private String tipoPersona() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Tipo de persona:\n1) Academico\n2) Alumno\n3) Funcionario");
        return sc.nextLine();
    }

    private void leerProvincias() {
        StringTokenizer st;
        List<String> lineas;
        lProvincia = new ArrayList<>();
        Provincia p;
        lineas = FuenteDatos.leerArchivo("Provincia.csv");
        for (int i = 0; i < lineas.size(); i++) {
            st = new StringTokenizer(lineas.get(i), ";");
            p = new Provincia();
            while (st.hasMoreElements()) {

                p.setIdProvincia(st.nextToken());
                p.setNombre(st.nextToken());
                p.setIdRegion(st.nextToken());
                st.nextToken();
            }

            lProvincia.add(p);
        }
    }

    private void leerRegiones() {
        StringTokenizer st;
        List<String> lineas;
        lRegion = new ArrayList<>();
        Region r;
        lineas = FuenteDatos.leerArchivo("Region.csv");
        for (int i = 0; i < lineas.size(); i++) {
            st = new StringTokenizer(lineas.get(i), ";");
            r = new Region();
            while (st.hasMoreElements()) {

                r.setIdRegion(st.nextToken());
                r.setNombre(st.nextToken());
                r.setNumeroRomano(st.nextToken());
                r.setOrdenGeografico(st.nextToken());
            }

            lRegion.add(r);
        }
    }

    private void leerComunas() {
        StringTokenizer st;
        List<String> lineas;
        lComuna = new ArrayList<>();
        Comuna c;
        lineas = FuenteDatos.leerArchivo("Comuna.csv");
        for (int i = 0; i < lineas.size(); i++) {
            st = new StringTokenizer(lineas.get(i), ";");
            c = new Comuna();
            while (st.hasMoreElements()) {
                c.setIdComuna(st.nextToken());
                c.setNombre(st.nextToken());
                c.setIdProvincia(st.nextToken());
            }
            lComuna.add(c);
        }
    }

    private void cargarLineas() {
        lineas = new ArrayList<>();
        for (Academico ac : lAcademico) {
            lineas.add(ac.toString());
        }
        for (Alumno al : lAlumno) {
            lineas.add(al.toString());
        }
        for (Funcionario fu : lFuncionario) {
            lineas.add(fu.toString());
        }
    }

    private Comuna noRegistraComuna() {
        Comuna c = new Comuna();
        c.setIdComuna("No registrado");
        c.setIdProvincia("No registrado");
        c.setNombre("No registrado");
        return c;
    }
}
