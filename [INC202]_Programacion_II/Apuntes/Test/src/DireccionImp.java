
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class DireccionImp {

    private List<String> lineas;
    private List<Comuna> comunas;
    private List<Provincia> provincias;
    private List<Region> regiones;
    private SalidaIngreso si;
    private StringTokenizer st;

    public DireccionImp() {
        lineas = new ArrayList<String>();
        comunas = new ArrayList<Comuna>();
        provincias = new ArrayList<Provincia>();
        regiones = new ArrayList<Region>();
        si = new SalidaIngreso();
    }

    private void llenarRegiones() {
        Region r;
        lineas = si.leer("/home/rolivares/Escritorio/regiones.txt");

        for (String registro : lineas) {
            st = new StringTokenizer(registro, "\t");
            if (st.hasMoreTokens()) {
                r = new Region();
                r.setId(st.nextToken());
                r.setNombre(st.nextToken());
                regiones.add(r);
            }
        }
    }

    private void llenarProvincias() {
        Provincia p;
        lineas = si.leer("/home/rolivares/Escritorio/provincias.txt");

        for (String registro : lineas) {
            st = new StringTokenizer(registro, "\t");
            if (st.hasMoreTokens()) {
                p = new Provincia();
                p.setId(st.nextToken());
                p.setNombre(st.nextToken());
                p.setRegion(buscarRegion(st.nextToken()));
                provincias.add(p);
            }
        }
    }

    private void llenarComunas() {
        Comuna c;
        lineas = si.leer("/home/rolivares/Escritorio/comunas.txt");

        for (String registro : lineas) {
            st = new StringTokenizer(registro, "\t");
            if (st.hasMoreTokens()) {
                c = new Comuna();
                c.setId(st.nextToken());
                c.setNombre(st.nextToken());
                c.setProvincia(buscarProvincia(st.nextToken()));
                comunas.add(c);
            }
        }
    }

    private Region buscarRegion(String id) {
        for (Region region : regiones) {
            if (id.equals(region.getId())) {
                return region;
            }
        }
        return null;
    }

    private Provincia buscarProvincia(String id) {
        for (Provincia provincia : provincias) {
            if (id.equals(provincia.getId())) {
                return provincia;
            }
        }
        return null;
    }

    public void llenar() {
        llenarRegiones();
        llenarProvincias();
        llenarComunas();
    }

    public void mostrar() {
        for (Comuna comuna : comunas) {
            System.out.println(comuna.toString());
        }
    }
}
