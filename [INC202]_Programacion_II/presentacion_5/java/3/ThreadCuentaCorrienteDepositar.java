public class ThreadCuentaCorrienteDepositar extends Thread {

    private final CuentaCorriente cuentaCorriente;
    private NumeroAleatorio numAle = new NumeroAleatorio();

    public ThreadCuentaCorrienteDepositar(CuentaCorriente cuentaCorriente) {
        this.cuentaCorriente = cuentaCorriente;
    }

    @Override
    public void run() {
        while (true) {
            try {
                ThreadCuentaCorrienteDepositar.sleep((long) (1 + numAle.getNumero(5000)));
                cuentaCorriente.depositar(numAle.getNumero(10000));
            } catch (InterruptedException ex) {
            }
        }
    }
}
