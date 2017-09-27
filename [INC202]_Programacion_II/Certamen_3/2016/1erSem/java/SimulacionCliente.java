public class SimulacionCliente {

    private final int MAX = 100;
    private int saldo = 0;

    public synchronized void ingresar(int clientes, RetailView retailView) {
        try {
            while (saldo >= MAX) {
                wait();
            }
            if (saldo + clientes >= MAX) {
                clientes = MAX - saldo;
            }
            saldo += clientes;
            retailView.in.setText(retailView.in.getText() + getSaldo() + "\n");
            notifyAll();
        } catch (InterruptedException ex) {
        }
    }

    public synchronized void egresar(int clientes, RetailView retailView) {
        try {
            while (saldo <= 0) {
                wait();
            }
            if (clientes > saldo) {
                clientes = saldo;
            }
            saldo -= clientes;
            retailView.out.setText(retailView.out.getText() + getSaldo() + "\n");
            notifyAll();
        } catch (InterruptedException ex) {
        }
    }

    private synchronized int getSaldo() {
        return saldo;
    }
}
