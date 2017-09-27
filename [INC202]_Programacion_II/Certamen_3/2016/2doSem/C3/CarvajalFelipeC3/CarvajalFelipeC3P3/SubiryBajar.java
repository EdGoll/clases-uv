

import java.util.Random;
import java.util.logging.Level;
import java.util.logging.Logger;


public class SubiryBajar implements Runnable{
    boolean SubiroBajar;
    Bus buses;
    Random rnd = new Random();
    
    public SubiryBajar(boolean sb, Bus bs){
        SubiroBajar = sb;
        buses = bs;
    }
    
    
    @Override
    public void run() {
        while(true){
        if(SubiroBajar){
           buses.Subir();
           try {
                Thread.sleep(rnd.nextInt(500)+1);
            } catch (InterruptedException ex) {
                Logger.getLogger(SubiryBajar.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        else{
            buses.Bajar();
            try {
                Thread.sleep(rnd.nextInt(500)+1);
            } catch (InterruptedException ex) {
                Logger.getLogger(SubiryBajar.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
            
        }
        
    }
}
