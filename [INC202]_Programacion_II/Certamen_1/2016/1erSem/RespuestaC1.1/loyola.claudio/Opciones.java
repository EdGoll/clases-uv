package Porcentajes;
import java.util.Scanner;
public class Opciones {
    Respuestas p = new Respuestas();
    Scanner sc = new Scanner(System.in);
    boolean salir = true;
    public void elegir(){
        try{
        while(salir) {
            int opc = 0;
            do{
                System.out.println("\nIngrese Numero de opcion."
                        + "\n1) Mostrar paises con mayor cantidad de recien nacidos muertos."
                        + "\n2) Mostrar paises con menor cantidad de recien nacidos muertos."
                        + "\n3) Mostrar pais con mayor porcentaje de personas trabajando mayores de 15 anios."
                        + "\n4) Mostrar pais con menor porcentaje de personas trabajando mayores de 15 anios."
                        + "\n5) Mostrar total de niños recien nacidos muertos."
                        + "\n6) Mostrar todos los datos."
                        + "\n7) salir del programa.");
                opc = sc.nextInt();
            }
            while(opc < 1 && opc > 7 && salir != false);
            switch(opc){
                case 1:
                    p.paisMayorRNM();
                    break;
                case 2:
                    p.paisMenorRNM();
                    break;
                case 3:
                    p.paisMayorPE();
                    break;
                case 4:
                    p.paisMenorPE();
                    break;
                case 5:
                    p.TotalRNM();
                    break;
                case 6:
                    p.mostrarDatos();
                    break;
                case 7:
                    salir = false;
                    break;
            }
        }
        }
        catch(Exception ex){
            System.out.println("Error al ingresar dato.");
        }
    }
}
