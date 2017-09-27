/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


/**
 *
 * @author JOJE
 */
 
public class ThreadAS extends Thread {
    private final Autobus PersonasSuben;
    public ThreadAS(Autobus autobus) {
        this.PersonasSuben = autobus;
    }
    //long aux2;
    @Override
    public  void run() {
        while (true) {
            try {
                long aux2;
                aux2=((long) (1 + (int)(Math.random() * 5)) * 1000);
                ThreadAS.sleep(aux2+1); 
                //Marcare un tiempo global entre la gente que sube como referencia solamente, cada sleep es independiente entre 1 y 5
                System.out.println("tiempo: "+(aux2/1000)+"s\n");
                PersonasSuben.Suben((int)(10 * Math.random()));
            } catch (InterruptedException ex) {
            }
        }
    }
    
}
