package certamen;
import javax.swing.*;
import certamen.DataRead;
public class Main {
    
   

    
    public static void main(String[] args) {
      int a=1; 
      while (a!=0);  
        System.out.println("Bienvenido a mi programa");
        System.out.println("\ningrese 1 para cargar notas de los alumnos");
        System.out.println("ingrese 2 para calcular el promedio de cada alumno");
        System.out.println("ingrese 3 para guardar en un archivo los promedios de cada alumnos");
        a=JOption.Pane.showImputDialog("1, 2, 3");
        switch (a){
          case 1:{
              .DataRead1();
              DataRead2();
              DataRead3();
              break;
          }
          case 2:{
              calcular promedio();
              break;
          }
          case 3:{
              
              break;        
          }
          default: {
              System.out.println("\ningrese Una opcion correcta");
              break
          }
      }
    }
    
}
