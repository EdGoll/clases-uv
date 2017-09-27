


import java.util.logging.Level;
import java.util.logging.Logger;

public class T_entrada extends Thread {

    protected bus autobus;

    public T_entrada(bus autobus) {
        this.autobus = autobus;
    }

    @Override
    public void run() {
        while (true) {
            
            try {
             
                autobus.entra();
                Thread.sleep((1 + (int) (Math.random() * 5)) * 1000);
            } catch (InterruptedException ex) {
                Logger.getLogger(T_entrada.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }

}
