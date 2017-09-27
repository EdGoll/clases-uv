

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Implementacion {
   ArrayList<Region> Regiones = new ArrayList<>(); 
   ArrayList<Provincia> Provincias = new ArrayList<>();
   ArrayList<Comuna> Comunas = new ArrayList<>();
   TDAregistro lista = new TDAregistro();
   
   Scanner sc= new Scanner(System.in);
   FuenteDeDatos fd =new FuenteDeDatos();
   List<String> lineas;
   StringTokenizer tk;
   Region Region;
   Provincia Provincia;
   Comuna Comuna;
   Funcionario Funcionario;
   Alumno Alumno;
   Academico Academico;
   
    public void GuardarRegiones(){
        lineas=fd.leerArchivo("Region.csv");
        for(String l:lineas){
            tk=new StringTokenizer(l,";");
            Region=new Region();
            if(tk.hasMoreElements()){
                Region.setIdRegion(tk.nextToken());
                Region.setNombreRegion(tk.nextToken());
                Region.setNumeroRomano(tk.nextToken());
                Region.setOrdenGeograficoRegion(tk.nextToken());            
            }
            Regiones.add(Region);
        }
    }
   
    public void GuardarProvincias(){
        lineas=fd.leerArchivo("Provincia.csv");
        for(String l:lineas){
            tk=new StringTokenizer(l,";");
            Provincia =new Provincia();
            if(tk.hasMoreElements()){
                Provincia.setIdProvincia(tk.nextToken());
                Provincia.setNombreProvincia(tk.nextToken());
                Provincia.setIdRegion(tk.nextToken());
                Provincia.setNumeroDeComunas(tk.nextToken());
            }
            Provincias.add(Provincia);
        }
    }
    
    public void GuardarComunas(){
        lineas= fd.leerArchivo("Comuna.csv");
        for(String l :lineas){
            tk= new StringTokenizer(l,";");
            Comuna = new Comuna();
            if(tk.hasMoreElements()){
                Comuna.setIdComuna(tk.nextToken());
                Comuna.setNombreComuna(tk.nextToken());
                Comuna.setIdProvincia(tk.nextToken());
            }
            Comunas.add(Comuna);
        }
    }
    
    public void PedirUsuario(){
       
        int control=1;
        String dni,nombre,apellidos,edad,horario;
        Direccion direccionp,direccionl;
        while(control==1){
            System.out.println("Ingrese DNI");
            dni=sc.nextLine();
            System.out.println("Ingrese Nombre");
            nombre=sc.nextLine();
            System.out.println("Ingrese Apellidos");
            apellidos=sc.nextLine();
            System.out.println("Ingrese Edad");
            edad=sc.nextLine();
            direccionp=direccion();
            int n;
            do{
                direccionl=null;
                System.out.println("¿Posee Direccion Laboral? si(1) no(2)");                 
                n=sc.nextInt();
                if(n==1){
                    direccionl=direccion();
                }
                else if(n!=1 && n!=2){
                    System.out.println("Opcion no valida");
                }
            }while(n!=1 && n!=2);    
            int m;
            do{
                System.out.println("Ingrese tipo de persona Academico(1) Alumno(2) Funcionario(3)");
                m=sc.nextInt();
                if(m==1){
                    System.out.println("Ingrese Horario De Atencion");
                    horario=sc.nextLine();
                    Academico= new Academico(dni,nombre,apellidos,edad,direccionp,direccionl,horario);
                    lista.insertar(Academico);
                }
                else if(m==2){
                    System.out.println("Ingrese Asignaturas");
                    horario=sc.nextLine();
                    Alumno = new Alumno(dni,nombre,apellidos,edad,direccionp,direccionl,horario);
                    lista.insertar(Alumno);
                }
                else if(m==3){
                    System.out.println("Ingrese Horario Laboral");
                    horario=sc.nextLine();
                    Funcionario= new Funcionario(dni,nombre,apellidos,edad,direccionp,direccionl,horario);
                    lista.insertar(Funcionario);
                }
                else{
                    System.out.println("Opcion no valida");
                }
                
                System.out.println("Desea agregar otra Persona si(1) no(2)");
                control=sc.nextInt();

            }while(m!=1 && m!=2 && m!=3);            
        }            
    }
    
    
    private Direccion direccion(){
        String calle ,numero ,comuna="",idregion,idprovincia,idcomuna;
        System.out.println("Para la Direcccion");
        System.out.println("Ingrese calle");
        calle=sc.nextLine();
        System.out.println("Ingrese numero");
        numero=sc.nextLine();
        System.out.println("Ingrese Id de Region");
        System.out.println(Regiones.toString());
        idregion=sc.nextLine();
        for(Provincia p:Provincias){
            if(p.getIdRegion().equals(idregion)){
                System.out.println(p.toString());
            }
        }
        System.out.println("Ingrese Id de Provincia");
        idprovincia=sc.nextLine();
        for(Comuna c:Comunas){
            if(c.getIdProvincia().equals(idprovincia)){
                System.out.println(c.toString());
            }
        }
        System.out.println("Ingrese Id de Comuna");
        idcomuna=sc.nextLine();
        for(Comuna c :Comunas){
            if(c.getIdComuna().equals(idcomuna)){
                comuna=c.getNombreComuna();
            }
        }       
        Direccion dr= new Direccion();
        dr.setCalle(calle);
        dr.setNumero(numero);
        dr.setComuna(comuna);
        
    return dr;        
    }
    
    public void Mostrar(){
        lista.mostrar();
    }
}