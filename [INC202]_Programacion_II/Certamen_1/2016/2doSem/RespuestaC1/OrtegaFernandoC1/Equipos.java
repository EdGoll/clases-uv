/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


import java.util.ArrayList;

/**
 *
 * @author Fiov
 */
public class Equipos {
    private ArrayList<Object> equipo = new ArrayList<Object>();
    private int nombre;
    private int power;
    public Equipos(int b){
        nombre = b;
        for(int i=0; i<11;i++){
           jugador Top = new jugador(i);
            equipo.add(Top);
            power += Top.puntosJ();
        }
        
    }
    public int getpower(){
        return power;
    }

}
