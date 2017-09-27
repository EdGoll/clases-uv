

public class ThreadBajan extends Thread {
    protected bus Bus;
    
    public ThreadBajan(bus Bus){
        this.Bus = Bus;
    }
    @Override
    public void run(){
        while(true){
            Bus.bajan();
        }
    }
}
