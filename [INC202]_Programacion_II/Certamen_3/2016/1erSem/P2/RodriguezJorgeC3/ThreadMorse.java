


public class ThreadMorse implements Runnable{

    
    private final Imp imp;

    public ThreadMorse(Imp imp) {
        this.imp = imp;
    }
    
 
    
    @Override
    public void run() {
        while(true){
            ThreadMorse.sleep((long) (1 + (int) (Math.random() * 5)) * 1000);
        }
    }
    
    
}
