public class CuentaCorriente {

    private int saldo = 0;

    public synchronized void depositar(int dinero, CuentaCorrienteView cuentaCorrienteView) {
        saldo += dinero;
        cuentaCorrienteView.setTextAbono("Deposito: " + dinero + " Saldo: " + getSaldo());
        notifyAll();
    }

    public synchronized void girar(int dinero, CuentaCorrienteView cuentaCorrienteView) {
        saldo -= dinero;
        cuentaCorrienteView.setTextGiro("Giro: " + dinero + " Saldo: " + getSaldo());
        notifyAll();
    }

    private synchronized int getSaldo() {
        return saldo;
    }
}
