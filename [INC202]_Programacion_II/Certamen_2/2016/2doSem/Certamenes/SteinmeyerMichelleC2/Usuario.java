import java.util.ArrayList;
import java.util.StringTokenizer;
import java.util.Scanner;
import java.util.List;

public class Usuario {
    private List<String> l;
    private List<String> l2;
    private List<String> l3;
    /////
    private ArrayList<DatosPersona> DatPer = new ArrayList<>();
    private ArrayList<Region> Reg = new ArrayList<>();
    private ArrayList<Provincia> Prov = new ArrayList<>();
    private ArrayList<Comuna> Com = new ArrayList<>();
    private ArrayList<Funcionario> Fun = new ArrayList<>();
    private ArrayList<Alumno> Al = new ArrayList<>();
    private ArrayList<Academico> Ac = new ArrayList<>();
    /////
    private FuenteDatos fuda;
    /////
    Scanner a = new Scanner(System.in);
    /////
    private StringTokenizer sto;
    /////
    FuenteDatos fd = new FuenteDatos();
    
    public Usuario(){
            fuda = new FuenteDatos();
            cargarDatosPersonales();
    }

    /////////
    public void cargarDatosPersonales(){
        l = FuenteDatos.leerArchivo("Region.cvs");
        l2 = FuenteDatos.leerArchivo("Provincia.cvs");
        l3 = FuenteDatos.leerArchivo("Comuna.cvs");
        
        Region r = null;
        Provincia p = null;
        Comuna c = null;
        
        for(String l : l){
            sto = new StringTokenizer(l,";");
            if(sto.hasMoreElements()){
                r = new Region();
                r.setIdRegion(sto.nextToken());
                r.setNombreRegion(sto.nextToken());
                r.setNumeroRomano(sto.nextToken());
                r.setOrdenGeogrficoRegion(sto.nextToken());
                Reg.add(r);
            }
        }
        for(String l2 : l2){
            sto = new StringTokenizer(l2,";");
            if(sto.hasMoreElements()){
                p = new Provincia();
                p.setIdProvincia(sto.nextToken());
                p.setNombreProvincia(sto.nextToken());
                p.setIdRegion(sto.nextToken());
                Prov.add(p);
            }
        }
        
        for(String l3 : l3){
            sto = new StringTokenizer(l3 ,";");
            if(sto.hasMoreElements()){
                c = new Comuna();
                c.setIdComuna(sto.nextToken());
                c.setNombreComuna(sto.nextToken());
                c.setIdProvincia(sto.nextToken());
                Com.add(c);
            }
        }
    }
    
    /////////////
    public void AgregarDatos2(){
        int resp = 0;
        Funcionario f = new Funcionario();
        Alumno al = new Alumno();
        Academico ac = new Academico();
        
        DatosPersona d = new DatosPersona();
        Direccion dd = new Direccion();
        System.out.println("Ingrese DNI");
        d.setDNI(Integer.parseInt(a.nextLine()));
        System.out.println("Ingrese Nombre");
        d.setNombre(a.nextLine());
        System.out.println("Ingrese Apellidos");
        d.setApellidos(a.nextLine());
        System.out.println("Ingrese Edad");
        d.setEdad(Integer.parseInt(a.nextLine()));
        System.out.println("Ingrese su direccion personal"); 
        d.setDireccionPersonal(a.nextLine());
        System.out.println("Ingrese calle");
        dd.setCalle(a.nextLine());
        System.out.println("Ingrese numero casa/dep");
        dd.setNumero(a.nextLine());
        System.out.println("Ingrese Comuna");
        dd.setComuna(a.nextLine());
        System.out.println("(1) Ingresar direccion laboral (2) Omitir "); 
            if(resp == 1){ 
                System.out.println("Ingrese direccion laboral:");
                d.setDireccionLaboral(a.nextLine()); 
                System.out.println("Ingrese calle");
                dd.setCalle(a.nextLine());
                System.out.println("Ingrese numero casa/dep");
                dd.setNumero(a.nextLine());
                System.out.println("Ingrese Comuna");
                dd.setComuna(a.nextLine());
            } 
            if(resp == 2){ 
                d.setDireccionLaboral("");
            }
        System.out.println("(1)Funcionario (2) Alumno (3) Academico");
            if(resp == 1){
                System.out.println("Ingrese su horario laboral");
                f.setHorario(a.nextLine());
            }
            if(resp == 2){
                System.out.println("Ingrese asignaturas inscritar");
                al.setAsignaturas(a.nextLine());
                
            }
            if(resp == 3){
                System.out.println("Ingrese Horario de consulta");
                ac.setHorarioConsultas(a.nextLine());
            }    
            
        DatosPersona v = obtenerPersona(d.getDNI());
        if (v != null) {
            DatPer.remove(d);
        }    
        DatPer.add(d);
    }
    
    ////////
    public DatosPersona obtenerPersona(int DNI){
        DatosPersona persona = null;
        for (DatosPersona dPersona : DatPer) {
            if(dPersona.getDNI() == DNI){
                persona = dPersona;
            }
        }
        return persona;
    }
    
    ////////
    public void Comuna(){
        
        String Regi;
        String Provi;
        String Comu; 
        for(Region l1 : Reg) {
            System.out.println(l1);
        }
            
        System.out.println("Elija una región");
        Regi= a.nextLine();
        for (Region l1 : Reg) {
            if(l1.getIdRegion().equals(Regi)){
                for (Provincia l2 : Prov) {
                    if(l2.getIdRegion().equals(Regi)){
                        System.out.println(l2.toString());
                    }
                }
            }
        } 
            
        System.out.println("Elija una provincia");
        Provi = a.nextLine();
        for(Comuna l2 : Com){
            if(l2.getIdProvincia().equals(Provi)){
                System.out.println(l3.toString());
            }   
        }
        System.out.println("Elija una comuna");
        Comu = a.nextLine();
                    
        }   

    
    public void archivo(DatosPersona p){
    FuenteDatos fd = new FuenteDatos();
        fd.escribirArchivo("archivo.txt",DatPer);
    }
    
}

