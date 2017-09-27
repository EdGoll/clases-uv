


import java.util.logging.Level;
import java.util.logging.Logger;

public class T_salida extends Thread {

    protected bus autobus;

    public T_salida(bus autobus) {
        this.autobus = autobus;
    }

    @Override
    public void run() {

        while (true) {

            
            try {
                autobus.sale();
                Thread.sleep((1 + (int) (Math.random() * 5)) * 1000);
               
            } catch (InterruptedException ex) {
                Logger.getLogger(T_salida.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
}
