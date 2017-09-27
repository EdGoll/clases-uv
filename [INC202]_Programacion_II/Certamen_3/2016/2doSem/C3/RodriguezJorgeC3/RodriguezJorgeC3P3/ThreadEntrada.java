import java.util.Random;


public class ThreadEntrada extends Thread {
    protected Autobus autobus;
    

    public ThreadEntrada(Autobus autobus) {
        this.autobus = autobus;
    }
    
    @Override
    public void run(){
        while(true){
            autobus.entra();
            
        }
    }
    
}
