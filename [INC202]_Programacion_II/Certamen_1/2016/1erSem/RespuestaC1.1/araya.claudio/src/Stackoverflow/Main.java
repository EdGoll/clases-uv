/*
README
     
1° Busca las respuestas de una pregunta según el ID de esta.
2° Muestra la respuesta mas rapida de todo el dataset.
3° Muestra el total de respuestas del dataset.
4° Muestra al ID del usuario con el mayor puntaje acumulado de preguntas
junto con el puntaje  acumulado.

*/
package Stackoverflow;

public class Main {

    public static void main(String[] args) {
        // TODO code application logic here
        RespuestaImp r = new RespuestaImp();

        r.buscarPregunta();
        r.respuestasMasRapidas();
        System.out.println("Total de Respuestas: " + Integer.toString(r.totalRespuestas()));

        r.usuarioMasPuntosPreguntas();

    }

}
