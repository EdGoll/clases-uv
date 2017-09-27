package c3;

public class SimulacionCliente {

    private final int MAX = 100;
    private int saldo = 0;
    
    public synchronized void ingresar(int clientes) {
        try {
            while (saldo >= MAX) {
                wait();
            }
            if (saldo + clientes >= MAX) {
                clientes = MAX - saldo;
            }
            saldo += clientes;
            System.out.println("Ingresaron: " + clientes + " clientes y actualemnte hay: " + getSaldo());
            notifyAll();
        } catch (InterruptedException ex) {
        }
    }

    public synchronized void egresar(int clientes) {
        try {
            while (saldo <= 0) {
                wait();
            }
            if (clientes > saldo) {
                clientes = saldo;
            }
            saldo -= clientes;
            System.out.println("Egresaron: " + clientes + " clientes y actualemnte hay: " + getSaldo());
            notifyAll();
        } catch (InterruptedException ex) {
        }
    }

    private synchronized int getSaldo() {
        return saldo;
    }
}
