public class ThreadSubida extends Thread {
    
    private final Autobus autobus;
    
    public ThreadSubida(Autobus autobus) {
        this.autobus = autobus;
    }
    
    @Override
    public void run() {
        while (true) {
            autobus.subir();
        }
    }
}
