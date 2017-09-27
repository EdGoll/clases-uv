public class ThreadCuentaCorrienteDepositar extends Thread {

    private final CuentaCorriente cuentaCorriente;
    private final CuentaCorrienteView cuentaCorrienteView;
    public boolean status;

    public ThreadCuentaCorrienteDepositar(CuentaCorriente cuentaCorriente, CuentaCorrienteView cuentaCorrienteView) {
        this.cuentaCorriente = cuentaCorriente;
        this.cuentaCorrienteView = cuentaCorrienteView;
    }

    @Override
    public void run() {
        while (true) {
            ThreadCuentaCorrienteDepositar.sleep(1000);
            while (status) {
                try {
                    cuentaCorriente.depositar((int) (10000 * Math.random()), cuentaCorrienteView);
                } catch (InterruptedException ex) {
                }
            }
        }
    }
}
