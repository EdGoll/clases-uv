import java.util.Random;



public class ThreadSalida extends Thread {
    
    protected Autobus autobus;
    public ThreadSalida(Autobus autobus) {
        this.autobus = autobus;
    }
    @Override
    public void run(){
        
        while(true){
            
            autobus.sale();
            
        }
    }
}
