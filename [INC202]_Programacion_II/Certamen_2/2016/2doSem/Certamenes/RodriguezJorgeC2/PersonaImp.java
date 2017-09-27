import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.StringTokenizer;

public class PersonaImp {

    private FuenteDatos fu;
    List<String> lineas = null;
    
    List<Persona> pr = new ArrayList<Persona>();
    
    public PersonaImp(){
        fu = new FuenteDatos();
        lineas = fu.leerArchivo("DatosPersonales.txt");
        cargarDatosPersonales();
    }

    private void cargarDatosPersonales(){
        Persona p;
        StringTokenizer st;
        for (String linea : lineas) {
            st = new StringTokenizer(linea,";");
            if(st.hasMoreElements()){
                p = new Persona();
                p.setDni(st.nextToken());
                p.setNombre(st.nextToken());
                p.setApellidos(st.nextToken());
                p.setTipo(st.nextToken());
                p.setEdad(st.nextToken());
                p.setCalle(st.nextToken());
                p.setNumero(st.nextToken());
                p.setComuna(st.nextToken());
                pr.add(p);
            }
        }   
    } 
    
    public void agregarDatosPersonales(){
        Scanner sc = new Scanner(System.in);
        Direccion d = new Direccion();
        Academico a = new Academico();
        Alumno al = new Alumno();
        Funcionario f = new Funcionario();
        String tipo;
        for(Persona p: pr){
            System.out.println("Ingrese su dni: ");
            String dni = sc.nextLine();
            try{
                if(p.getDni().equals(dni)){
                    System.out.println("Ingrese nuevamente la dni: ");
                    p.setDni(sc.nextLine());
                    System.out.println("Ingrese nombre: ");
                    p.setNombre(sc.nextLine());
                    System.out.println("Ingrese Apellidos: ");
                    p.setApellidos(sc.nextLine());
                    System.out.println("Ingrese tipo de persona: ");
                    tipo=sc.nextLine();
                    if("academico".equals(tipo)){
                       p.setTipo(a.horarioConsulta());
                    }else if("alumno".equals(tipo)){
                        p.setTipo(a.horarioConsulta());
                    }else{
                        p.setTipo(f.horarioConsulta());
                    }
                    System.out.println("Ingrese edad: ");
                    p.setEdad(sc.nextLine());
                    System.out.println("Ingrese calle: ");
                    p.setCalle(sc.nextLine());
                    System.out.println("Ingrese numero: ");
                    p.setNumero(sc.nextLine());
                    p.setComuna(d.mostrar());
                    pr.add(p);
                }
                
                    
                    p.setDni(dni);
                    System.out.println("Ingrese nombre: ");
                    p.setNombre(sc.nextLine());
                    System.out.println("Ingrese Apellidos: ");
                    p.setApellidos(sc.nextLine());
                    System.out.println("Ingrese tipo de persona: ");
                    tipo=sc.nextLine();
                    if("academico".equals(tipo)){
                       p.setTipo(a.horarioConsulta());
                    }else if("alumno".equals(tipo)){
                        p.setTipo(a.horarioConsulta());
                    }else{
                        p.setTipo(f.horarioConsulta());
                    }
                    System.out.println("Ingrese edad: ");
                    p.setEdad(sc.nextLine());
                    System.out.println("Ingrese calle: ");
                    p.setCalle(sc.nextLine());
                    System.out.println("Ingrese numero: ");
                    p.setNumero(sc.nextLine());
                    p.setComuna(d.mostrar());
                    pr.add(p);
            }catch(Exception e){
                
            }
            
            fu.escribirArchivo("DatosPersonales.txt", lineas);
        }
    }
}