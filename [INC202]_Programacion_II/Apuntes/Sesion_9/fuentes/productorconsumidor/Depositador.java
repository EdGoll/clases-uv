package productorconsumidor;

public class Depositador extends Thread {
    private int monto;
    private Cuenta cuenta;
    
    public Depositador(String nombre, int monto, Cuenta cuenta){
        super(nombre);
        this.monto = monto;
        this.cuenta = cuenta;
    }

    public void run(){
        System.out.println(getName() + " : iniciando ...");
        for (int i = 0; i < 100; i++){
            int saldoActual = cuenta.depositar(monto);
            System.out.println(getName() + " : depositado, saldo actual : " + saldoActual);
        }
        System.out.println(getName() + " : finalizando, saldo : " + cuenta.getSaldo());
    }
}