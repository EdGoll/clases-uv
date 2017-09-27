package newThread;

public class CuentaCorriente {

    private static final int MAX_AHORRO = 100000;
    private int saldo = 0;

    public synchronized void depositar(int dinero) {
        try {
            while (saldo >= MAX_AHORRO) {
                wait();
            }
            saldo += dinero;
            System.out.println("Deposito: " + dinero + " Saldo: " + getSaldo());
            notifyAll();
        } catch (InterruptedException ex) {
        }
    }

    public synchronized void girar(int dinero) {
        try {
            while (saldo <= 0) {
                wait();
            }
            saldo -= dinero;
            System.out.println("Giro: " + dinero + " Saldo: " + getSaldo());
            notifyAll();
        } catch (InterruptedException ex) {
        }
    }

    private int getSaldo() {
        return saldo;
    }
}
