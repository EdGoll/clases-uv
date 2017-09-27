
public class ThreadSuben extends Thread {
    protected bus Bus;    
    
    public ThreadSuben (bus Bus){
        this.Bus = Bus;
    }
    
    @Override
    public void run(){
        while(true){
            Bus.suben();
        }
    }

}
