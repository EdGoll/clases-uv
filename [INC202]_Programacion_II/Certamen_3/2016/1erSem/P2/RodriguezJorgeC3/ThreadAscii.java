

public class ThreadAscii implements  Runnable{
    
    private final Imp imp;

    public ThreadAscii(Imp imp) {
        this.imp = imp;
    }
    
    @Override
    public void run() {
        while(true){
            ThreadAscii.sleep((long) (1 + (int) (Math.random() * 5)) * 1000);
        }
    }
    
}
