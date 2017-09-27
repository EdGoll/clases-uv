public class SubidaThread extends Thread{
    
    private Autobus bus;
    
    public SubidaThread(Autobus bus){
        this.bus = bus;
    }
    
    @Override
    public void run(){
        while(true){
            bus.subirPasajeros();
        }
    }
}
