/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Stackoverflow;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.StringTokenizer;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;


/**
 *
 * @author cl
 */
public class RespuestaImp {

    FuenteDeDatos fd = new FuenteDeDatos();
    List<String> lineas;
    List<Respuesta> lr = new ArrayList<Respuesta>();

    private void cargarRespuesta() {
        StringTokenizer st;
        Respuesta r;
        boolean firstLine = true;

        long longfecha;
        Date fechaPregunta;
        Date fechaRespuesta;

        lineas = fd.leerArchivo("./answers.csv");

        for (String linea : lineas) {

            if (firstLine) {
                firstLine = false;
                continue;
            }
            st = new StringTokenizer(linea, ",");
            if (st.hasMoreElements()) {
                r = new Respuesta();

                r.setIdQuestion(Integer.parseInt(st.nextToken()));
                r.setIdQuestioner(Integer.parseInt(st.nextToken()));

                r.setScoreQuestion(Integer.parseInt(st.nextToken()));

                longfecha = Long.parseLong(st.nextToken()) * 1000;
                fechaPregunta = new Date(longfecha);
                r.setTimeQuestion(fechaPregunta);

                r.setNumberViewsQuestion(Integer.parseInt(st.nextToken()));
                r.setNumberAnswers(Integer.parseInt(st.nextToken()));

                r.setIdAnswer(Integer.parseInt(st.nextToken()));
                r.setIdAnswerer(Integer.parseInt(st.nextToken()));

                r.setScoreAnswer(Integer.parseInt(st.nextToken()));
                fechaRespuesta = new Date(Long.parseLong(st.nextToken()) * 1000);
                r.setTimeAnswer(fechaRespuesta);
                lr.add(r);
            }

        }

    }

    public void buscarPregunta() {
        Scanner sc = new Scanner(System.in);
        int id;
        try {
            System.out.println("Ingrese un ID de pregunta (Ejemplos 564043, 564061, 563972) :");
            id = sc.nextInt();
            System.out.println("qid: Id de la pregunta.");
            System.out.println("  i: Id del usuario que preguntó.");
            System.out.println(" qs: Puntaje de la pregunta.");
            System.out.println(" qt: Fecha y Hora de la pregunta. ");
            System.out.println("qvc: Cantidad de vistas de la pregunta.");
            System.out.println("qac: Numero de respuestas para la pregunta.");
            System.out.println("aid: Id de la respuesta.");
            System.out.println("  j: Id del usuario que respondio");
            System.out.println(" as: Puntaje de la respuesta.");  
            System.out.println(" at: Fecha y Hora de la respuesta.");
            System.out.println("qid\ti\tqs\tqt\t\t\tqvc\tqac\taid\tj\tas\tat");
            for (Respuesta rb : lr) {

                if (rb.getIdQuestion() == id) {
                    System.out.println(rb.toString());
                }
            }

        } catch (Exception e) {

        }

    }

    public void respuestasMasRapidas() {
        long minimo = Long.MAX_VALUE;

        List<Respuesta> lrm = new ArrayList<Respuesta>();

        for (Respuesta rm : lr) {
            if (rm.tiempoRespuesta() < minimo) {
                minimo = rm.tiempoRespuesta();
                lrm.clear();
                lrm.add(rm);
            }
            else if (rm.tiempoRespuesta() == minimo){
                lrm.add(rm);            
            }
        }
        System.out.println("Respuesta mas rapida:");
        for (Respuesta rm : lrm){
            
            System.out.print("El usuario: " + rm.getIdAnswerer() + " se demoró ");
            System.out.print(rm.tiempoRespuesta()/1000 + " segundos, en responder");
            System.out.println(" la pregunta " + rm.getIdQuestion());
        }

    }

    public int totalRespuestas(){
        return lr.size(); 
   }
    
    public void usuarioMasPuntosPreguntas(){
        int llave;
        int valor;
        int idPregunta;
        List<Integer> preguntas = new ArrayList<Integer>();
        
        Map<Integer, Integer> dictionary  = new HashMap<Integer, Integer>();
        for (Respuesta r : lr){
            llave = r.getIdQuestioner();
            idPregunta = r.getIdQuestion();
            
            if(preguntas.contains(idPregunta)){                
                continue;            
            }else {
               preguntas.add(idPregunta);
            }
            
            if(!dictionary.containsKey(r.getIdQuestioner())){
                
                valor = r.getScoreQuestion();                 
                dictionary.put(llave,valor);
            }
            else {
                valor = (int) dictionary.get(llave) + r.getScoreQuestion();
                dictionary.put(llave,valor);                
            }
            
        }
        int maxValueInMap=(Collections.max(dictionary.values()));
        for (Map.Entry<Integer, Integer> entry : dictionary.entrySet()) {
            if (entry.getValue()==maxValueInMap) {
                System.out.println("IdUsuario : " + entry.getKey() + " Puntaje Acumulado por Preguntas : " + entry.getValue());     // Print the key with max value
            }
		
	}
    
    }
    
    public RespuestaImp() {
        this.cargarRespuesta();
    }

}
