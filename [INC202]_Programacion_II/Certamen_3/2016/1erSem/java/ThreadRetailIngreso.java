import java.util.Random;

public class ThreadRetailIngreso extends Thread {

    private final SimulacionCliente simulacionCliente;
    private final RetailView retailView;
    
    public ThreadRetailIngreso(SimulacionCliente simulacionCliente, 
            RetailView retailView) {
        this.simulacionCliente = simulacionCliente;
        this.retailView = retailView;
    }
    
    @Override
    public void run() {
        while (true) {
            try {
                ThreadRetailIngreso.sleep((long) ((new Random()).nextInt(4) + 1));
                simulacionCliente.ingresar((new Random()).nextInt(8) + 1, retailView);
            } catch (InterruptedException ex) {
            }
        }
    }
}
