
//Clase que contiene los metodos para trabajar con archivos
public class FuenteDatos {
    //Metodo para trabar con archivo Region.csv
    public void LeerRegiones(){
        System.out.println("Trabajando con archivo Region.csv");
        Region R = new Region();
        R.setCSVRegion();
        R.PrintArrayRegion();
        
    }
    //Metodo para trabar con archivo Provincia.csv
    public void LeerProvincia(){
        System.out.println("Trabajando con Provincia.csv");
        Provincia P = new Provincia();
        P.setCSVProvincia();
        P.PrintArrayProvincia();
    }
    //Metodo para trabar con archivo Comuna.csv
    public void LeerComuna(){
        System.out.println("Trabajando con Comuna.csv");
        Comuna C = new Comuna();
        C.setCSVComuna();
        C.PrintArrayComuna();
    }
    //Metodo para trabar con archivo de texto plano
    public void EscribirArchivo(){
        System.out.println("Trabajando con archivo de texto plano");
        
    }
}
class Escribiendo{
    public void escribir(String ruta_archivo){
        
    }
    
} 
