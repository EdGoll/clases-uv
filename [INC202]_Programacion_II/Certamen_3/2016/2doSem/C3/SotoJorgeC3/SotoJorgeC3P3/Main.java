/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


/**
 *
 * @author JOJE
 */
public class Main {
    public static void main(String[] args) {
        //Partiremos con el bus vacio
        System.out.println("Pasajeros: 0\n");
       
        Autobus A = new Autobus();
        //Hebras
        ThreadAS TAS = new ThreadAS(A);
        ThreadAB TAB = new ThreadAB(A);
        TAS.start();
        TAB.start();
        try {
            TAS.join();
            TAB.join();
        } catch (InterruptedException ex) {
        }
    }
}
