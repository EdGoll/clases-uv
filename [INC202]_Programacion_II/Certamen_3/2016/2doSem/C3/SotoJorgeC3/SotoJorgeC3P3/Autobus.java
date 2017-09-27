/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


import java.security.Timestamp;

/**
 *
 * @author JOJE
 */

public class Autobus {
    private final int Capacidad=45;
    private int Pasajeros = 0;
    
    
    private int getPasajeros() {
        return Pasajeros;
    }
    
    public synchronized void Suben(int Peronas) {
        Peronas += 1;
        
        try {
            while (Pasajeros >= Capacidad) {
                wait();
            }
                 
            Pasajeros += (Peronas);
            //System.out.println("Tiempo:    " +(System.currentTimeMillis())/10000000);
            System.out.println("P. Suben:  " +Peronas);
            System.out.println("Pasajeros: " +getPasajeros()+"\n");
            
            
            notifyAll();
        } catch (InterruptedException ex) {
        }
    }
    public synchronized void Bajan(int Peronas) {
        Peronas += 1;
        int aux=0;
        aux = Pasajeros-Peronas;
        if(aux>0){//cuando se quieran bajar del bus mas personas de las que hay (por tema de la restriccion del problema randomica, simplemente no tomara el hilo)
            try {
                while (Pasajeros <= 0) {
                    wait();
                }
                Pasajeros -= (Peronas);
                System.out.println("P. Bajan:  " +Peronas);
                System.out.println("Pasajeros: " +getPasajeros()+"\n");
                notifyAll();
            } catch (InterruptedException ex) {
            }
        }    
    }
}


