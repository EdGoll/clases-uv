import java.util.ArrayList;
import java.util.Scanner;

public class ListaPeliculas {

    private ArrayList<Pelicula> lp = new ArrayList<>();

    private void agregar(String nombre, String duracion, String taquilla) {
        Pelicula p = new Pelicula();
        p.setNombre(nombre);
        p.setDuracion(duracion);
        p.setTaquilla(taquilla);
        lp.add(p);
    }

    public void agregarManual() {
        agregar("Batman v/s Superman", "02:25", "Ciencia ficcion");
        agregar("Otra pelicula", "03:30", "Drama");
    }

    public void agregarTeclado() {
        Scanner sc = new Scanner(System.in);
        String respuesta = "";
        do {
            try {
                System.out.print("Ingrese el nombre de una pelicula: ");
                String nombre = sc.nextLine();
                System.out.print("Ingrese la duracion de una pelicula: ");
                String duracion = sc.nextLine();
                System.out.print("Ingrese la taquilla de una pelicula: ");
                String taquilla = sc.nextLine();
                agregar(nombre, duracion, taquilla);
                do {
                    System.out.print("\nDesea ingresar una nueva pelicula [s/n]: ");
                    respuesta = sc.nextLine();
                    if (!respuesta.equalsIgnoreCase("s") && !respuesta.equalsIgnoreCase("n")) {
                        System.out.println("\nError: Opcion invalida");
                    }
                } while (!respuesta.equalsIgnoreCase("s") && !respuesta.equalsIgnoreCase("n"));
            } catch (Exception ex) {
                System.out.println("Error");
            }
        } while (respuesta.equalsIgnoreCase("s"));
    }

    public void mostrar() {
        for (Pelicula p : lp) {
            System.out.println(p);
        }
    }
}
