package pe;

public class ThreadCuentaCorrienteGirar extends Thread {

    private final CuentaCorriente cuentaCorriente;
    private final CuentaCorrienteView cuentaCorrienteView;
    public boolean status = true;

    public ThreadCuentaCorrienteGirar(CuentaCorriente cuentaCorriente, CuentaCorrienteView cuentaCorrienteView) {
        this.cuentaCorriente = cuentaCorriente;
        this.cuentaCorrienteView = cuentaCorrienteView;
    }

    @Override
    public void run() {
        while (true) {
            while (status) {
                try {
                    ThreadCuentaCorrienteGirar.sleep((long) (1 + (int) (Math.random() * 5)) * 1000);
                    cuentaCorriente.girar((int) (10000 * Math.random()), cuentaCorrienteView);
                } catch (InterruptedException ex) {
                }
            }
        }
    }
}
