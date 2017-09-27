package sismos;
//Ivan Paniagua Orellana
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.StringTokenizer;

public class SismosImp {

    private final FuenteDeDatos fu;
    List<String> lineas = null;
    List<Sismo> ls = new ArrayList<>();
    Random rnd = new Random();

    public SismosImp(String archivo) {    //Constructor
        fu = new FuenteDeDatos();
        lineas = fu.leerArchivo(archivo);
        leerSismos();
        sismosCalama();
        epicentroCercano();
        sismoLocalPerceptible();
        sismosAm();
        asignarId();
    }

    private void leerSismos() {     //Leer y extraer datos de los Sismos desde .txt
        Sismo s = null;
        for (String linea : lineas) {
            StringTokenizer st = new StringTokenizer(linea, ";");
            s = new Sismo();
            while (st.hasMoreTokens()) {
                s.setFecha(st.nextToken());
                s.setHora(st.nextToken());
                s.setLatitud(st.nextToken());
                s.setLongitud(st.nextToken());
                s.setProfundidad(st.nextToken());
                s.setMagnitud(st.nextToken());
                s.setRefGeografica(st.nextToken());
                String[] separador = s.getRefGeografica().split(" de ");
                s.setLugar(separador[separador.length - 1]);
                ls.add(s);
            }
        }

    }

    private void sismosCalama() {   //Ver los sismos que han sido cerca de Calama (P1)
        int g = 0;
        for (Sismo sismo : ls) {
            if (sismo.getRefGeografica().contains("Calama")) {
                System.out.println("[Temblores en Calama o cerca]");
                System.out.print("    Fecha: " + sismo.getFecha());
                System.out.print("   Hora: " + sismo.getHora());
                System.out.print("   Latitud: " + sismo.getLatitud());
                System.out.print("   Longitud: " + sismo.getLongitud());
                System.out.print("   Profundidad: " + sismo.getProfundidad());
                System.out.print("   Magnitud: " + sismo.getMagnitud());
                System.out.print("  Referencia Geografica: " + sismo.getRefGeografica());
                System.out.println("  Lugar: " + sismo.getLugar());
                g = 1;
            }
        }
        if (g == 0) {
            System.out.println("No ha temblado cerca de calama :)");
        }

    }

    private void epicentroCercano() {   //Epicentros que han sido cercanos a algun lugar habitado (P2)
        String epicentro = "";
        int epi, g = 0;
        System.out.println("[Sismos cercanos a lugares habitados]");
        for (Sismo sismo : ls) {
            for (int i = 0; i < sismo.getRefGeografica().length(); i++) {
                if (Character.isDigit(sismo.getRefGeografica().charAt(i))) {
                    epicentro = epicentro + sismo.getRefGeografica().charAt(i);
                }

            }
            epi = Integer.parseInt(epicentro);
            if (epi < 30) {
                System.out.println("    Epicentro: A " + epi + "km de " + sismo.getLugar());
                g=1;
            }
            epicentro = "";
        }
        if(g==0){
            System.out.println("    No han habido sismos cerca de lugares habitados");
        }
    }

    private void sismoLocalPerceptible() {      //Sismos que han sido perceptibles por la poblacion
        int g=0;
        System.out.println("[Sismos perceptibles por la poblacion]");
        for (Sismo sismo : ls) {
            if (Float.parseFloat(sismo.getMagnitud()) > 4 && Float.parseFloat(sismo.getProfundidad()) < 30) {
                System.out.println("    Lugar: " + sismo.getLugar() + "  Magnitud: " + sismo.getMagnitud() + " Profundidad: " + sismo.getProfundidad());
                g=1;
            }

        }
        if(g==0){
            System.out.println("    No han habido sismos perceptibles.");
        }
    }

    private void sismosAm() {   //Sismos de madruga  hasta el mediodia (P4)
        System.out.println("[Sismos ocurridos en horario a.m.]");
        int g=0;
        for (Sismo sismo : ls) {
            String[] hora = sismo.getHora().split(":");
            if (Integer.parseInt(hora[0]) > 0 && Integer.parseInt(hora[0]) < 12) {
                System.out.println("    Lugar: " + sismo.getLugar() + " Magnitud: " + sismo.getMagnitud() + " Hora: " + sismo.getHora());
                g=1;
            } 
        }
        if(g==0){
            System.out.println("    No han habido sismos en la madrugada.");
        }

    }

    private void asignarId() {  //Asignar  ID  unico que se pide (P5)
        
        System.out.println("[Ids Unicos]:");
        for (Sismo sismo : ls) {
            sismo.setId(sismo.getFecha().replace("-", ""));
            sismo.setId("1" + generadorIdUnico() + "-" + sismo.getId());
            System.out.println("    "+sismo.getId());
        }
    }

    private String generadorIdUnico() {
        String id;
        do {
            id = gId();
        } while (Integer.parseInt(id) < 0);

        return String.valueOf(id);
    }

    private String gId() {
        int id = rnd.nextInt(100) + 1;
        for (Sismo sismo : ls) {
            if (String.valueOf(id).equals(sismo.getId())) {
                id = -1;
                break;
            }
        }
        return String.valueOf(id);
    }

}
