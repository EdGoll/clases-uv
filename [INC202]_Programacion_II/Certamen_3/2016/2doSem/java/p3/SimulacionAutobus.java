public class SimulacionAutobus {

    public static void main(String[] args) {
        
        Autobus autobus = new Autobus();
        
        ThreadSubida ts = new ThreadSubida(autobus);
        ThreadBajada tb = new ThreadBajada(autobus);
        
        ts.start();
        tb.start();
    }
}
