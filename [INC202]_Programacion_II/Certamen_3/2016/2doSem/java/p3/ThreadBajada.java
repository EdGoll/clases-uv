public class ThreadBajada extends Thread {
        
    private final Autobus autobus;
    
    
    public ThreadBajada(Autobus autobus) {
        this.autobus = autobus;
    }
    
    @Override
    public void run() {
        while (true) {
            autobus.bajar();
        }
    }
}
