import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.StringTokenizer;

public class ViverosImp {
    private List <String> lineas;
    private List <Persona>personas;
    private List <Inscripciones>inscripcion;

    public ViverosImp() {
        obtenerInformacion();
    }            
    private void obtenerInformacion(){
        FuenteDeDatos fdt =new FuenteDeDatos();
        lineas=new ArrayList<String>();
        lineas = fdt.leerArchivo("C:\\Users\\Dani\\Documents\\ViverosNomina.csv");
        lineas.remove(0);
        personas=new ArrayList<Persona>();
        inscripcion=new ArrayList<Inscripciones>();
        StringTokenizer zer ;
        for(String linea:lineas){
            zer =new StringTokenizer(linea,";");
            Persona p1=new Persona();
            Inscripciones ins1 = new Inscripciones();
            ins1.setNombreRegion(zer.nextToken());
            ins1.setTipoFT(zer.nextToken());
            ins1.setTipoFO(zer.nextToken());
            ins1.setTipoO(zer.nextToken());
            ins1.setTipoV(zer.nextToken());
            ins1.setCodigoInscripcion(zer.nextToken());
            ins1.setFechaInscripcion(zer.nextToken());
            ins1.setNombreVivero(zer.nextToken());
            p1.setNombre(zer.nextToken());
            p1.setApellidoP(zer.nextToken());
            p1.setApellidoM(zer.nextToken());
            p1.setSexo(zer.nextToken());
            ins1.setEspecieProducion1(zer.nextToken());
            ins1.setEspecieProducion2(zer.nextToken());   
            ins1.setEspecieProducion3(zer.nextToken()); 
            ins1.setActividad(zer.nextToken());
            ins1.setDireccion(zer.nextToken());
            ins1.setComuna(zer.nextToken());
            ins1.setUrbano(zer.nextToken());           
            personas.add(p1);
            inscripcion.add(ins1);
        }
    }
    public  void contarPropFemenina(){
        int contador=0;
        for(Persona sujeto : personas){
            if(sujeto.getSexo().equals("F")){
            contador++;
            }  
        }
        System.out.println("Total de Propietaria Femeninas son :" + contador);
    }
    public void  obtenerFecha(){   // obtener la cantidad total de inscripciones del año 2009      
        int contador=0;
        for(Inscripciones ins : inscripcion){
            if((obtenerAño(ins.getFechaInscripcion().toString())).equals("2009")){
                contador++;
            }    
        }       
      System.out.println("Cantidad de Inscripciones del año 2009 :" + contador);   
    }    
    private String obtenerAño(String fecha){
        return  fecha.substring(6,fecha.length());
    }
    public void mostrarListado(){
 
     String especie=" "; 
       for(int i=0;i<inscripcion.size();i++) {
            if(inscripcion.get(i).getNombreRegion().equals("VALPARAISO")){
                if(!inscripcion.get(i).getEspecieProducion1().equals(especie)){
                    especie =  inscripcion.get(i).getEspecieProducion1();
                
                    System.out.println("Tipo de Especies que produce valparaiso :"+ especie);
                 }
            }
       } 
    }         
    public void buscador (){
        Scanner sc = new Scanner(System.in);
        String tipo=" ";
        System.out.println("Ingrese el tipo de vivero que desea buscar: Ft:frutales ,Fo: forestales ,O: Ornamentales,V: Vides");
        tipo= sc.nextLine();
        for(int i=1;i<inscripcion.size();i++){
            if(inscripcion.get(i).getTipoFT().equals(tipo)||inscripcion.get(i).getTipoFO().equals(tipo)||inscripcion.get(i).getTipoO().equals(tipo)||inscripcion.get(i).getTipoV().equals(tipo)){
                    System.out.println("region: "+inscripcion.get(i).getNombreRegion()+"  "  + "Direccion:  "+inscripcion.get(i).getDireccion());  
                }             
             }   
        }
    public void obtenerPropietarios (){
         Scanner sc = new Scanner(System.in);
        int tipo=0;
        System.out.println("Ingrese desde que año desea buscar a los propietarios" );
        tipo= sc.nextInt();
        for(int i=1;i<inscripcion.size();i++){
            int v1= Integer.parseInt(inscripcion.get(i).getFechaInscripcion().substring(6,inscripcion.get(i).getFechaInscripcion().length()));
            if(v1>=tipo){
                    System.out.println("Propietario:"+ personas.get(i).getNombre()+"  "  + "Nombre del vivero:  "+inscripcion.get(i).getNombreVivero()); 
                }             
             }   
      
    }

}
    