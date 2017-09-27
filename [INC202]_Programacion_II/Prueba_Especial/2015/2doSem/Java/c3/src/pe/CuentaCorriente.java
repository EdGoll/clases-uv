package pe;

public class CuentaCorriente {

    //private final int MAX_AHORRO = 100000;
    private int saldo = 0;

    public synchronized void depositar(int dinero, CuentaCorrienteView cuentaCorrienteView) {
//        try {
//            while (saldo >= MAX_AHORRO) {
//                wait();
//            }
        saldo += dinero;
        cuentaCorrienteView.setTextAbono("Deposito: " + dinero + " Saldo: " + getSaldo());
        notifyAll();
//        } catch (InterruptedException ex) {
//        }
    }

    public synchronized void girar(int dinero, CuentaCorrienteView cuentaCorrienteView) {
//        try {
//            while (saldo <= 0) {
//                wait();
//            }
        saldo -= dinero;
        cuentaCorrienteView.setTextGiro("Giro: " + dinero + " Saldo: " + getSaldo());
        notifyAll();
//        } catch (InterruptedException ex) {
//        }
    }

    private synchronized int getSaldo() {
        return saldo;
    }
}
