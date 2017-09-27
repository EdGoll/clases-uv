import java.util.Scanner;


public class Impl {
    
    public void prueba(){
        int control=0;
        do{
        int resp;
        Direccion d = new Direccion();
        Scanner sc = new Scanner(System.in);
        FuenteDatos fdd = new FuenteDatos();
        Cargador charger = new Cargador();
        
        System.out.println("\nElija tipo de persona que desea ingresar: \n1.-Alumno\n2.-Academico\n3.-Funcionario\n4.-Salir");
        resp = Integer.parseInt(sc.nextLine());
        switch(resp){
            
            case 1: Alumno alum = new Alumno();
                System.out.println("Ingrese su DNI sin puntos ni digito verificador: ");
                alum.setDNI(Integer.parseInt(sc.nextLine()));
                System.out.println("Ingrese su nombre: ");
                alum.setNombre(sc.nextLine());
                System.out.println("Ingrese sus apellidos: ");
                alum.setApellidos(sc.nextLine());
                System.out.println("Ingrese su edad: ");
                alum.setEdad(Integer.parseInt(sc.nextLine()));
                System.out.println("Ingrese su direccion particular");
                System.out.println("Calle: ");
                d.setCalle(sc.nextLine());
                System.out.println("Numero: ");
                d.setNumero(Integer.parseInt(sc.nextLine()));
                System.out.println("Comuna: ");
                d.setComuna(charger.Cargador());
                alum.setDirPar(d);
                System.out.println("Ingrese su direccion laboral, para omitir pulse enter");
                System.out.println("Calle: ");
                d.setCalle(sc.nextLine());
                if(d.getCalle().equals("")){
                    d.setCalle("");
                    d.setNumero(0);
                    d.setComuna("");
                }
                else{
                    System.out.println("Numero: ");
                    d.setNumero(Integer.parseInt(sc.nextLine()));
                    System.out.println("Comuna: ");
                    d.setComuna(charger.Cargador());
                }
                alum.setDirLab(d);
                System.out.print("Ingrese sus asignaturas inscritas: ");
                alum.setRamos(sc.nextLine());
                escribir(alum);
                break;
                
                
            case 2: Academico prof = new Academico();
                System.out.println("Ingrese su DNI sin puntos ni digito verificador: ");
                prof.setDNI(Integer.parseInt(sc.nextLine()));
                System.out.println("Ingrese su nombre: ");
                prof.setNombre(sc.nextLine());
                System.out.println("Ingrese sus apellidos: ");
                prof.setApellidos(sc.nextLine());
                System.out.println("Ingrese su edad: ");
                prof.setEdad(Integer.parseInt(sc.nextLine()));
                System.out.println("Ingrese su direccion particular");
                System.out.println("Calle: ");
                d.setCalle(sc.nextLine());
                System.out.println("Numero: ");
                d.setNumero(Integer.parseInt(sc.nextLine()));
                System.out.println("Comuna: ");
                d.setComuna(charger.Cargador());
                prof.setDirPar(d);
                System.out.println("Ingrese su direccion laboral, para omitir pulse enter");
                System.out.println("Calle: ");
                d.setCalle(sc.nextLine());
                if(d.getCalle().equals("")){
                    d.setCalle("");
                    d.setNumero(0);
                    d.setComuna("");
                }
                else{
                    System.out.println("Numero: ");
                    d.setNumero(Integer.parseInt(sc.nextLine()));
                    System.out.println("Comuna: ");
                    d.setComuna(charger.Cargador());
                }
                prof.setDirLab(d);
                System.out.print("Ingrese su horario de atencion: ");
                prof.setHorarioAtencion(sc.nextLine());
                escribir(prof);
                break;
                
                
            case 3: Funcionario func = new Funcionario(); 
                System.out.println("Ingrese su DNI sin puntos ni digito verificador: ");
                func.setDNI(Integer.parseInt(sc.nextLine()));
                System.out.println("Ingrese su nombre: ");
                func.setNombre(sc.nextLine());
                System.out.println("Ingrese sus apellidos: ");
                func.setApellidos(sc.nextLine());
                System.out.println("Ingrese su edad: ");
                func.setEdad(Integer.parseInt(sc.nextLine()));
                System.out.println("Ingrese su direccion particular");
                System.out.println("Calle: ");
                d.setCalle(sc.nextLine());
                System.out.println("Numero: ");
                d.setNumero(Integer.parseInt(sc.nextLine()));
                System.out.println("Comuna: ");
                d.setComuna(charger.Cargador());
                func.setDirPar(d);
                System.out.println("Ingrese su direccion laboral, para omitir pulse enter");
                System.out.println("Calle: ");
                d.setCalle(sc.nextLine());
                if(d.getCalle().equals("")){
                    d.setCalle("");
                    d.setNumero(0);
                    d.setComuna("");
                }
                else{
                    System.out.println("Numero: ");
                    d.setNumero(Integer.parseInt(sc.nextLine()));
                    System.out.println("Comuna: ");
                    d.setComuna(charger.Cargador());
                }
                func.setDirLab(d);
                escribir(func);
                System.out.print("Ingrese su horario de trabajo: ");
                func.setHorarioTrabajo(sc.nextLine());
                fdd.escribirArchivo("Consolidado.txt", func.getHorarioTrabajo());
                break;
                
            case 4: control = 1; break;    
        }
        }while(control!=1);     
    }
        
    
    public void escribir(Persona pipul){
        FuenteDatos fdd = new FuenteDatos();
        fdd.escribirArchivo("Consolidado.txt", Integer.toString(pipul.getDNI()));
        fdd.escribirArchivo("Consolidado.txt", pipul.getNombre());
        fdd.escribirArchivo("Consolidado.txt", pipul.getApellidos());
        fdd.escribirArchivo("Consolidado.txt", Integer.toString(pipul.getEdad()));
        fdd.escribirArchivo("Consolidado.txt", pipul.toString());
    }
}
