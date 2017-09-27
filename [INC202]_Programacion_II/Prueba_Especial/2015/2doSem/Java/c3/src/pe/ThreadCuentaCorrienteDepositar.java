package pe;

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
            while (status) {
                try {
                    ThreadCuentaCorrienteDepositar.sleep((long) (1 + (int) (Math.random() * 5)) * 1000);
                    cuentaCorriente.depositar((int) (10000 * Math.random()), cuentaCorrienteView);
                } catch (InterruptedException ex) {
                }
            }
        }
    }
}
