package sync;


public class ClienteCuenta extends Thread {
    private Cuenta cuenta;
    public ClienteCuenta (Cuenta cuenta){
        this.cuenta = cuenta;
    }
    public void run(){
        synchronized (cuenta){
            cuenta.depositar(150);
        }
    }
    
    public static void pruebaDeposito(){
        final Cuenta cuenta = new Cuenta();
        Thread t1 = new Thread(){
            public void run(){
                cuenta.depositar(10);
            }
        };
        Thread t2 = new Thread(){
            public void run(){
                cuenta.depositar(20);
            }
        };
        
        t1.start();
        t2.start();
    }
}
