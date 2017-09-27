package sync;


public class Cuenta {
    private int saldo;
    public void depositar(int monto){
        System.out.println("depositando : " + saldo +  " : " + monto);
        dormir();
        saldo += monto;
        System.out.println("depositando : " + saldo +  " : " + monto);
    }
    
    public synchronized void girar(int monto){
        System.out.println("girando : " + saldo +  " : " + monto);
        dormir();
        saldo -= monto;
        System.out.println("girando : " + saldo +  " : " + monto);
    }
    
    private void dormir(){
        try {
            Thread.sleep(15000);
        } catch (InterruptedException ex){
        }
    }
}

