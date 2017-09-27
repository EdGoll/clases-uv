public class ThreadCuentaCorrienteGirar extends Thread {

    private final CuentaCorriente cuentaCorriente;
    private final CuentaCorrienteView cuentaCorrienteView;

    public ThreadCuentaCorrienteGirar(CuentaCorriente cuentaCorriente, CuentaCorrienteView cuentaCorrienteView) {
        this.cuentaCorriente = cuentaCorriente;
        this.cuentaCorrienteView = cuentaCorrienteView;
    }

    @Override
    public void run() {
        while (true) {
            cuentaCorriente.girar((int) (10000 * Math.random()), cuentaCorrienteView);
        }
    }
}