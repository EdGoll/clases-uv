public class Main {
public static void main(String[] args) throws IOException {
        
        Leer l = new Leer();
        Leer.promedios("/Users/Arieli/Desktop/Arele/alumnos.csv");
        Leer.promedios("/Users/Arieli/Desktop/Arele/asignatura1.csv");
        Leer.promedios("/Users/Arieli/Desktop/Arele/asignatura2.csv");


        l.pasar();
        
         for (int x = 0; x < l.consolidado.size();x++){
            
             System.out.println(l.consolidado.get(x) +";" +l.consolidado.get(x+1) );
             x++;
        }
      }
  }