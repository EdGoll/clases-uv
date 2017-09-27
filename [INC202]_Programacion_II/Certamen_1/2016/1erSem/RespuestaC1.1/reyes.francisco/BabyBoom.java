
package babyboom;

import java.util.Scanner;


public class BabyBoom {

//    private final String nombreArchivo = "C:\\Users\\casa\\Desktop\\babyboom.dat.txt";
 
    public static void main(String[] args) {
      PreguntasLista pl = new PreguntasLista();
      FuenteDeDatos fdd = new FuenteDeDatos();
      Scanner sc = new Scanner(System.in);
      int escoger,rangomenor,rangomayor,otro;
      String pesomenor,pesomayor;
      pl.lector(fdd.leerArchivo("C:\\Users\\casa\\Desktop\\babyboom.dat.txt"));
      do{
       //las preguntas son las siguientes
      System.out.println("ingrese la opcion que desea escoger");
      System.out.println("1) mostrar todas las horas de nacimiento de bebes hombres");
      System.out.println("2) mostrar cuantos son niños y cuantos niñas");
      System.out.println("3) mostrar la hora de nacimiento de las bebes mujeres despues de las 12");
      System.out.println("4) mostrar el peso de los ultimos 10 bebes ");
      System.out.println("5) mostrar todos los datos de cierto rango") ;
      escoger = sc.nextInt();
      switch(escoger){
          case 1 :  pl.mostrarhoranacido();
               break;
          case 2 : pl.contarmh();
              break;
          case 3: pl.mostrarhoradespues12();
              break;
          case 4: pl.mostrarpeso();
              break;
              
          case 5: 
              System.out.println("ingrese el rango menor(debe ser mayor a 0)");
                  rangomenor = sc.nextInt();
                  System.out.println("ingrese el rango menor(debe ser menor a 44)");
                  rangomayor = sc.nextInt();
              pl.mostrarEnRango(rangomenor,rangomayor);
              break;  
           default:
                 System.out.println("no existen mas preguntas");
             break;
      
      }

      System.out.println("¿desea repetir el programa? 1) si \\ 2) no");
      otro = sc.nextInt();
      }while(otro==1);
    }
    
    
}
