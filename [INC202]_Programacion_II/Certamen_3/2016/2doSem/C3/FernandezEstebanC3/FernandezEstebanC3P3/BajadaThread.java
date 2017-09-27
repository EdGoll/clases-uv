public class BajadaThread extends Thread{
    private Autobus bus;
    
    public BajadaThread(Autobus bus){
        this.bus = bus;
    }
    
    @Override
    public void run(){
        while(true){
            bus.bajarPasajeros();
        }
    }
}
