package newThread;

public class ThreadCuentaCorrienteGirar extends Thread {

    private final CuentaCorriente cuentaCorriente;

    public ThreadCuentaCorrienteGirar(CuentaCorriente cuentaCorriente1) {
        this.cuentaCorriente = cuentaCorriente1;
    }

    @Override
    public void run() {
        while (true) {
            try {
                ThreadCuentaCorrienteGirar.sleep((long) (1 + (int) (Math.random() * 5)) * 1000);
                cuentaCorriente.girar((int) (10000 * Math.random()));
            } catch (InterruptedException ex) {
            }
        }
    }
}
