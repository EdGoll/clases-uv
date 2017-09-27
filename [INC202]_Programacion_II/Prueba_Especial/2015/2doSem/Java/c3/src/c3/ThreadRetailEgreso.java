package c3;

import java.util.Random;

public class ThreadRetailEgreso extends Thread {

    private final SimulacionCliente simulacionCliente;

    public ThreadRetailEgreso(SimulacionCliente simulacionCliente) {
        this.simulacionCliente = simulacionCliente;
    }
    
    @Override
    public void run() {
        while (true) {
            try {
                ThreadRetailEgreso.sleep((long) ((new Random()).nextInt(4) + 1));
                simulacionCliente.egresar((new Random()).nextInt(8) + 1);
            } catch (InterruptedException ex) {
            }
        }
    }
}
