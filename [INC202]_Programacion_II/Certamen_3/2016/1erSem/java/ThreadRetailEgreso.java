import java.util.Random;

public class ThreadRetailEgreso extends Thread {

    private final SimulacionCliente simulacionCliente;
    private final RetailView retailView;

    public ThreadRetailEgreso(SimulacionCliente simulacionCliente, 
            RetailView retailView) {
        this.simulacionCliente = simulacionCliente;
        this.retailView = retailView;
    }
    
    @Override
    public void run() {
        while (true) {
            try {
                ThreadRetailEgreso.sleep((long) ((new Random()).nextInt(4) + 1));
                simulacionCliente.egresar((new Random()).nextInt(8) + 1, retailView);
            } catch (InterruptedException ex) {
            }
        }
    }
}
