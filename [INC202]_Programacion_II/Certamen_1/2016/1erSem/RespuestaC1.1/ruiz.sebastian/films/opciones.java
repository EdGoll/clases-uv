
package films;

import java.util.Scanner;

public class opciones {
    
    int opcion;
    
    String anio;
    String ranking;
    String duracion;
    
    private final String nombreArchivo = "films.dat.txt";

    public void consulta(){
        
        Scanner sc = new Scanner(System.in);
        
        do {            
                System.out.println("Ingrese su opcion:");
                System.out.println("(1) Las peliculas con mayor ranking");
                System.out.println("(2) Las peliculas con peor ranking");
                System.out.println("(3) Ingrese un año, y vea que peliculas se realizaron en este");
                System.out.println("(4) Ingrese un minimo de duracion y vea las peliculas que cumplen este");
                System.out.println("(5) Ingrese un ranking, y vea que peliculas tienen esta calificacion, el formato de ingreso es 1.0");
                opcion = sc.nextInt();
        }while((opcion != 1)&(opcion != 2)&(opcion != 3)&(opcion != 4)&(opcion != 5));  
        
        FuenteDeDatos  ft = new FuenteDeDatos();
        Lineas ln = new Lineas();
        ln.setOpcion(opcion);
        if (opcion == 3){
            System.out.println("ingrese el año que deasea buscar");
            anio = sc.next();
            ln.setAnnio(anio);
        }
        if (opcion == 4){
            System.out.println("ingrese el minimo de duracion que desea buscar");
            duracion = sc.next();
            ln.setDuracion(duracion);
        }
        if (opcion == 5){
            System.out.println("ingrese el ranking que deasea buscar");
            ranking = sc.next();
            ln.setRanking(ranking);
        }
        ln.lector(ft.leerArchivo(nombreArchivo));

    }
}
