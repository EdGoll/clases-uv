import java.util.Random;

public class ThreadRetailIngreso extends Thread {

    private final SimulacionCliente simulacionCliente;

    public ThreadRetailIngreso(SimulacionCliente simulacionCliente) {
        this.simulacionCliente = simulacionCliente;
    }
    
    @Override
    public void run() {
        while (true) {
            try {
                ThreadRetailIngreso.sleep((long) ((new Random()).nextInt(4) + 1));
                simulacionCliente.ingresar((new Random()).nextInt(8) + 1);
            } catch (InterruptedException ex) {
            }
        }
    }
}
