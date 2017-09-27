
package films;

import java.util.List;
import java.util.ArrayList;


public class Lineas {
    
    ArrayList<String> ArregloPeliculasPorAnio = new ArrayList();
    ArrayList<String> ArregloRankingPeliculas = new ArrayList();
    ArrayList<String> ArregloMinDuracionPeliculas = new ArrayList();
    ArrayList<String> ArregloMejoresPeliculas = new ArrayList();
    ArrayList<String> ArregloPeoresPeliculas = new ArrayList();
    
    public int opcion;

    public float mejor = -1;
    public float peor = 999;
    public float varf;
    
    public String str;
    public String anio;
    public String ranking;
    public String duracion;
    public String lineaLista;
    public String id;
    public String var;
    public String calutron; 
    
    public void setOpcion(int opcion){
        this.opcion = opcion;
    }
    public void setAnnio(String anio){
        this.anio = anio;
    }
    public void setRanking(String ranking){
        this.ranking = ranking;
    }
    public void setDuracion(String duracion){
        this.duracion = duracion;
    }
    
    public void lector(List<String> lineas){
        for (int i = 0; i < lineas.size(); i++) {
            lineaLista = lineas.get(i);
            parser(lineaLista,opcion);
        }
        if(opcion==1){
            for (int i = 0; i < lineas.size(); i++) {
                 lineaLista = lineas.get(i);
                 var = lineaLista.substring(56,66);
                 if(String.valueOf(mejor).equals(var.trim())){
                    str = lineaLista.substring(0,34);
                    ArregloMejoresPeliculas.add(str.trim());
                 }
            }
            for(int i=0;i<ArregloMejoresPeliculas.size();i++){
                System.out.println(ArregloMejoresPeliculas.get(i));
            }    
        }
        if(opcion==2){
            for (int i = 0; i < lineas.size(); i++) {
                 lineaLista = lineas.get(i);
                 var = lineaLista.substring(56,66);
                 if(String.valueOf(peor).equals(var.trim())){
                    str = lineaLista.substring(0,34);
                    ArregloPeoresPeliculas.add(str.trim());
                 }
            }
            for(int i=0;i<ArregloPeoresPeliculas.size();i++){
                System.out.println(ArregloPeoresPeliculas.get(i));
            }  
            
        }
        if (opcion== 3){
            for(int i=0;i<ArregloPeliculasPorAnio.size();i++){
                System.out.println(ArregloPeliculasPorAnio.get(i));
            }
        }
        if (opcion== 4){
            for(int i=0;i<ArregloMinDuracionPeliculas.size();i++){
                System.out.println(ArregloMinDuracionPeliculas.get(i));
            }
        }
        if (opcion== 5){
            for(int i=0;i<ArregloRankingPeliculas.size();i++){
                System.out.println(ArregloRankingPeliculas.get(i));
            }
        }
    }
    
    public void parser(String lineaLista,int opcion){
        
         films pel = new films();
         var = lineaLista.substring(0,34);
         pel.setTitulo(var.trim());
         var = lineaLista.substring(36,40);
         pel.setAnio(var.trim());
         var = lineaLista.substring(42,49);
         pel.setDuracion(var.trim());
         var = lineaLista.substring(50,56);
         pel.setActores(var.trim());
         var = lineaLista.substring(56,66);
         pel.setRating(var.trim());
         var = lineaLista.substring(68,70);
         pel.setDescripcion(var.trim());
         
         if(opcion==1){
             if(!"Rating".equals(pel.getRating())){
                varf = Float.parseFloat(pel.getRating());
                if (mejor <= varf){
                  mejor = varf;  
                 }
             }   
         }else if(opcion == 2) {
             if(!"Rating".equals(pel.getRating())){
                varf = Float.parseFloat(pel.getRating());
                if (peor >= varf){
                  peor = varf;  
                 }
             }  
         }else if (opcion==3){
             if (anio.equals(pel.getAnio())){
                 ArregloPeliculasPorAnio.add(pel.getTitulo());
             }
         }else if(opcion == 4){
             if(!"Length".equals(pel.getDuracion())){
                int numDuracion = Integer.parseInt(duracion);
                int numVar = Integer.parseInt(pel.getDuracion());
                if (numDuracion <= numVar){
                  ArregloMinDuracionPeliculas.add(pel.getTitulo());
                }
             }   
         }else if(opcion == 5){
             if(ranking.equals(pel.getRating())){
                 ArregloRankingPeliculas.add(pel.getTitulo());
             }
         }
    }
}  

