
package films;

//Nombre: Sebastian Ruiz Soto   Rut:17559823-5
//El dataset es del link :http://www.amstat.org/publications/jse/datasets/films.dat.txt
//El dataset es una lista de 100 peliculas que tiene los siguientes campos:
// Titulo, año , duracion, elenco(cast) , calificacion(rating), descripcion
//
//Desarrolle una aplicacion en java que lea el dataset y responda las siguientes consultas.
//
//(1)Que pelicula(o peliculas) obtuvo el mejor ranking.
//(2)Que pelicula(o peliculas) obtuvo el peor ranking.
//(3)Dado un año ingresado por pantalla, imprima las peliculas realizadas en ese año.
//(4)Dado una duracion minima ingresada por pantalla, muestre las peliculas que tienen mayor duracion.
//(5)Dado un calificacion ingresado por pantalla, imprima las peliculas con esa calificacion.



public class FilmsMain {

    public static void main(String[] args) {
         opciones op = new opciones();
         op.consulta();
    }
    
}