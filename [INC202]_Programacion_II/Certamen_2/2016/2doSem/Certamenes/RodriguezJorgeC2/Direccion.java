import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Direccion {

    private FuenteDatos fu;
    List<String> lineas = null;
    List<String> lineas2 = null;
    List<String> lineas3 = null;
    List<Region> rg = new ArrayList<Region>();
    List<Provincia> pv = new ArrayList<Provincia>();
    List<Comuna> cm = new ArrayList<Comuna>();

    public Direccion(){
        fu = new FuenteDatos();
        lineas = fu.leerArchivo("Region.csv");
        lineas2 = fu.leerArchivo("Provincia.csv");
        lineas3 = fu.leerArchivo("Comuna.csv");
        cargarRegion();
        cargarProvincia();
        cargarComuna();
    }

    private void cargarRegion(){
        Region r;
        StringTokenizer st;
        for (String linea : lineas) {
            st = new StringTokenizer(linea,";");
            if(st.hasMoreElements()){
                r = new Region();
                r.setIdRegion(st.nextToken());
                r.setNombreRegion(st.nextToken());
                r.setNumeroRomano(st.nextToken());
                r.setOrdenGeograficoRegion(st.nextToken());
                rg.add(r);
            }
        }
    }

    private void cargarProvincia(){
        Provincia p;
        StringTokenizer st;
        for (String linea : lineas2) {
            st = new StringTokenizer(linea,";");
            if(st.hasMoreElements()){
                p = new Provincia();
                p.setIdProvincia(st.nextToken());
                p.setNombreProvincia(st.nextToken());
                p.setIdRegion(st.nextToken());
                pv.add(p);
            }
        }
    }

    private void cargarComuna(){
        Comuna c;
        StringTokenizer st;
        for (String linea : lineas3) {
            st = new StringTokenizer(linea,";");
            if(st.hasMoreElements()){
                c = new Comuna();
                c.setIdComuna(st.nextToken());
                c.setNombreComuna(st.nextToken());
                c.setIdProvincia(st.nextToken());
                cm.add(c);
            }
        }
    }

    public String mostrar(){
        Scanner sc = new Scanner(System.in);
        String id,id1,id3 = null;
        for (Region linea : rg) {
            System.out.println(linea);
        }
            try{
            System.out.println("Seleccione la region: ");
            id= sc.nextLine();
            for (Region linea : rg) {
                if(linea.getIdRegion().equals(id)){
                    for (Provincia linea1 : pv) {
                        if(linea1.getIdRegion().equals(id)){
                            System.out.println(linea1.toString());
                        }
                    }
                }
            } 
            }catch(Exception e){
            }
            try{
                    System.out.println("Seleccione provincia: ");
                    id1 = sc.nextLine();
                    for(Comuna linea2 : cm){
                        if(linea2.getIdProvincia().equals(id1)){
                            System.out.println(linea2.toString());
                        }
                    }
            }catch(Exception e){
            }
            try{
                System.out.println("Seleccione comuna: ");
                id3 = sc.nextLine();
            }catch(Exception e){
                
            }
            return id3;
    }

}