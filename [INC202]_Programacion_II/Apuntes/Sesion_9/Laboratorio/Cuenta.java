public class Cuenta {
    private int saldo;
    private int montoUltimoGiro;
    
    public int getSaldo(){
        return saldo;
    }
    
    public int depositar(int monto){
        saldo += monto;
        return saldo;
    }
    
    public synchronized int giro(int monto){
        if (monto <= saldo){
            saldo -= monto;
            montoUltimoGiro = monto;
            //fabricar un problema de concurrencia
            esperar();
        } else {
            System.out.println(Thread.currentThread().getName() + ": no hay $$$ ");
            montoUltimoGiro = 0;
        }
        return montoUltimoGiro;
    }
    
    private void esperar(){
        try {
            Thread.sleep(5); // 5 milisegundos
        } catch (InterruptedException ex) {
            //nada que hacer si me despiertan...
        }
    }
    
    
    
    
    
    
}
