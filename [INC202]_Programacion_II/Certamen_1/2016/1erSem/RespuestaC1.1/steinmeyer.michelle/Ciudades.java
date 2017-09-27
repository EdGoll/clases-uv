package ciudadesmasvisitadas;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class Ciudades {
    
    private FuenteDeDatos fdd;
    List<String> lineas = null;
    
    List<Ranking> civ = new Arraylist<Ranking>();
    
    StringTokenizer stz; 
    Ranking R;
    
    public void completar(){
        fdd = new FuenteDeDatos();
        lineas = fdd.leerarchivo("CiudadesMasVisitadas_dataset.txt");
        for (String l: lineas){
            stz = new StringTokenizer(l,",");
            R = new Ranking();
            
            if (stz.hasMoreElements()){
                    R.setPosicion(stz.nextToken());
                    R.setCiudad(stz.nextToken());
                    R.setPais(stz.nextToken());
                    R.setContinente(stz.nextToken());
                    R.setVisitas(stz.nextToken());
                    civ.add(R);
            }
        }
    }
    
    public Ciudades(){
        cargarCiudades();
    }
    
}
