public class ThreadCuentaCorrienteGirar extends Thread {

    private final CuentaCorriente cuentaCorriente;
    private NumeroAleatorio numAle = new NumeroAleatorio();

    public ThreadCuentaCorrienteGirar(CuentaCorriente cuentaCorriente) {
        this.cuentaCorriente = cuentaCorriente;
    }

    @Override
    public void run() {
        while (true) {
            try {
                ThreadCuentaCorrienteGirar.sleep((long) (1 + numAle.getNumero(5000)));
                cuentaCorriente.girar(numAle.getNumero(10000));
            } catch (InterruptedException ex) {
            }
        }
    }
}
