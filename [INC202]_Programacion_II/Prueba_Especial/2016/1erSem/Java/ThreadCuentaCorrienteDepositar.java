public class ThreadCuentaCorrienteDepositar extends Thread {
    
    private final CuentaCorriente cuentaCorriente;
    private final CuentaCorrienteView cuentaCorrienteView;
    
    public ThreadCuentaCorrienteDepositar(CuentaCorriente cuentaCorriente, CuentaCorrienteView cuentaCorrienteView){
        this.cuentaCorriente = cuentaCorriente;
        this.cuentaCorrienteView = cuentaCorrienteView;
    }
    
    @Override
    public void run() {
        while (true) {
            cuentaCorriente.depositar((int) (10000 * Math.random()), cuentaCorrienteView);
        }
    }
}