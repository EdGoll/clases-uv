public class ThreadCuentaCorrienteDepositar extends Thread {

    private final CuentaCorriente cuentaCorriente;

    public ThreadCuentaCorrienteDepositar(CuentaCorriente cuentaCorriente) {
        this.cuentaCorriente = cuentaCorriente;
    }
    
    @Override
    public void run() {
        while (true) {
            try {
                ThreadCuentaCorrienteDepositar.sleep((long) (1 + (int)(Math.random() * 5)) * 1000);
                cuentaCorriente.depositar((int)(10000 * Math.random()));
            } catch (InterruptedException ex) {
            }
        }
    }
}
