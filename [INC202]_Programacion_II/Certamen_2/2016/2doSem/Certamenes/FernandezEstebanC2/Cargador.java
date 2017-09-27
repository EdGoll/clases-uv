import java.util.StringTokenizer;
import java.util.List;
import java.util.ArrayList;
import java.util.Scanner;


public class Cargador {
    
    private List<String> lineas;
    private List<Region> regiones;
    private List<Provincia> provincias; 
    private List<Comuna> comunas;
    
    public String Cargador(){
        loadRegiones();
        loadProvincias();
        loadComunas();
        return selectComuna();
    }
    
    private void loadRegiones(){
        lineas = FuenteDatos.leerArchivo("Region.csv");
        regiones = new ArrayList<Region>();
        Region R = null;
        
        for(String linea:lineas){
            StringTokenizer st = new StringTokenizer(linea,";");
            if(st.hasMoreElements()){
                R = new Region();
                R.setIdRegion(st.nextToken());
                R.setNombreRegion(st.nextToken());
                R.setNumeroRomano(st.nextToken());
                R.setOrdenGeograficoRegion(st.nextToken());
                regiones.add(R);
            }
        }
    }
    
    private void loadProvincias(){
        lineas = FuenteDatos.leerArchivo("Provincia.csv");
        provincias = new ArrayList<Provincia>();
        Provincia P = null;
        
        for(String linea:lineas){
            StringTokenizer st = new StringTokenizer(linea,";");
            if(st.hasMoreElements()){
                P = new Provincia();
                P.setIdProvincia(st.nextToken());
                P.setNombreProvincia(st.nextToken());
                P.setIdRegion(st.nextToken());
                P.setBasura(st.nextToken());//Guardo el numero restante del dataset para que no se desordene 
                provincias.add(P);
            }
        }
    }
    
    private void loadComunas(){
        lineas = FuenteDatos.leerArchivo("Comuna.csv");
        comunas = new ArrayList<Comuna>();
        Comuna C = null;
        
        for(String linea:lineas){
            StringTokenizer st = new StringTokenizer(linea,";");
            if(st.hasMoreElements()){
                C = new Comuna();
                C.setIdComuna(st.nextToken());
                C.setNombreComuna(st.nextToken());
                C.setIdProvincia(st.nextToken());
                comunas.add(C);
            }
        }
    }
    
    private String selectComuna(){
        String resp, comuna = null;
        Scanner sc = new Scanner(System.in);
        for(Region aux: regiones){
            System.out.print(aux.getIdRegion()+" ");
            System.out.println(aux.getNombreRegion());
            System.out.println("");
        }
        System.out.println("Seleccione una region: ");
        resp = sc.nextLine();
        System.out.println("/////////////////////////////////////////////////");
        for(Provincia aux: provincias){
            if(resp.equals(aux.getIdRegion())){
                System.out.print(aux.getIdProvincia()+" ");
                System.out.println(aux.getNombreProvincia());
                System.out.println("");
            }
        }
        System.out.println("Seleccione una provincia: ");
        resp = sc.nextLine();
        System.out.println("/////////////////////////////////////////////////");
        for(Comuna aux: comunas){
            if(resp.equals(aux.getIdProvincia())){
                System.out.print(aux.getIdComuna()+" ");
                System.out.println(aux.getNombreComuna());
                System.out.println("");
            }
        }
        System.out.println("Seleccione una comuna: ");
        resp = sc.nextLine();
        for(Comuna aux: comunas){
            if(resp.equals(aux.getIdComuna())){
                comuna = aux.getNombreComuna();
            }
        }
        return comuna;
    }
    
}
