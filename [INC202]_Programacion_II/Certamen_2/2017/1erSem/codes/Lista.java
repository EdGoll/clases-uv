import java.util.ArrayList;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Lista {

    private List<Movie> peliculas;
    private List<Rating> ratings;
    private List<String> lineasPelicula;
    private List<String> lineasRating;
    private List<String> busquedas;

    public Lista() {
        lineasPelicula = FuenteDatos.leerArchivo("/Users/rolivares/Desktop/movies.csv");
        lineasRating = FuenteDatos.leerArchivo("/Users/rolivares/Desktop/ratings.csv");
        busquedas = new ArrayList<>();
        cargarRating();
        cargarPeliculas();
    }

    private void cargarRating() {
        ratings = new ArrayList<>();
        Rating rating;
        StringTokenizer str;
        for (String linea : lineasRating) {
            str = new StringTokenizer(linea, ";");
            if (str.hasMoreTokens()) {
                rating = new Rating();
                rating.setUserId(str.nextToken());
                rating.setMovieId(str.nextToken());
                rating.setRating(str.nextToken());
                ratings.add(rating);
            }
        }
    }

    private void cargarPeliculas() {
        peliculas = new ArrayList<>();
        List<Rating> rts;
        List<String> generos;
        Movie pelicula;
        StringTokenizer stm, str;
        for (String linea : lineasPelicula) {
            stm = new StringTokenizer(linea, ";");
            if (stm.hasMoreTokens()) {
                try {
                    pelicula = new Movie();
                    pelicula.setMovieId(stm.nextToken());
                    pelicula.setTitle(stm.nextToken());
                    str = new StringTokenizer(stm.nextToken(), "|");
                    generos = new ArrayList<>();
                    while (str.hasMoreTokens()) {
                        generos.add(str.nextToken());
                    }
                    pelicula.setGenres(generos);
                    rts = new ArrayList<>();
                    for (Rating r : ratings) {
                        if (r.getMovieId().equals(pelicula.getMovieId())) {
                            rts.add(r);
                        }
                    }
                    pelicula.setRating(rts);
                    peliculas.add(pelicula);
                } catch (NoSuchElementException ex) {
                }
            }
        }
    }

    private void peliculasAdventure() {
        for (Movie pelicula : peliculas) {
            if (pelicula.getGenres().contains("Adventure")) {
                busquedas.add(pelicula.toString());
            }
        }
    }
    
    private void peliculasThrillerCrime() {
        for (Movie pelicula : peliculas) {
            if (pelicula.getGenres().contains("Thriller") &&
                pelicula.getGenres().contains("Crime") ) {
                busquedas.add(pelicula.toString());
            }
        }
    }
    
    private String leerDato(String texto) {
        Scanner sc;
        String dato = null;
        try {
            sc = new Scanner(System.in);
            System.out.print("Ingrese " + texto + ": ");
            dato = sc.nextLine();
        } catch (Exception e) {return "0";}
        return dato;
    }
    
    private void peliculaAnio() {
        String anio = leerDato("anio");
        for (Movie pelicula : peliculas) {
            if (pelicula.getTitle().contains(anio) ) {
                busquedas.add(pelicula.toString());
            }
        }
    }
    
    private void peliculaRatingPromedio() {
        double rp = Double.parseDouble(leerDato("rating pomedio"));
        for (Movie pelicula : peliculas) {
            if (pelicula.getRantingPromedio() >= rp) {
                busquedas.add(pelicula.toString());
            }
        }
    }
    
    private void peliculaRatingPromedioSoloComedy() {
        double rp = Double.parseDouble(leerDato("rating pomedio"));
        for (Movie pelicula : peliculas) {
            if (pelicula.getRantingPromedio() >= rp && 
                    pelicula.getGenres().size() == 1 &&
                    pelicula.getGenres().contains("Comedy")) {
                busquedas.add(pelicula.toString());
            }
        }
    }
    
    private void registrarBusqueda() {
        FuenteDatos.escribirArchivo("/Users/rolivares/Desktop/busqueda.txt", busquedas, true);
    }

    public void ejecutar() {
        peliculasAdventure();
        peliculasThrillerCrime();
        peliculaAnio();
        peliculaRatingPromedio();
        peliculaRatingPromedioSoloComedy();
        registrarBusqueda();
    }
}
