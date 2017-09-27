/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


/**
 *
 * @author JOJE
 */
public class ThreadAB extends Thread {
    private final Autobus PersonasBajan;
    public ThreadAB(Autobus autobus) {
        this.PersonasBajan = autobus;
    }
    @Override
    public  void run() {
        while (true) {
            try {
                long aux;
                aux=((long) (1 + (int)(Math.random() * 5)) * 1000);
                ThreadAB.sleep(aux+1);
                //System.out.println("tiempo: "+(aux/1000)); //marcare un tiempo genreal por comodidad aunque de todas formas cada uno tiene su sleep
                PersonasBajan.Bajan((int) (10 * Math.random()));
            } catch (InterruptedException ex) {
            }
        }
    }
}
