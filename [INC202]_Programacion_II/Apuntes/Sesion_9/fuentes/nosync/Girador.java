package nosync;


public class Girador implements Runnable {
    private int monto;
    private int montoGirado;
    private Cuenta cuenta;
    
    public Girador (int monto, Cuenta cuenta){
        this.monto = monto;
        this.cuenta = cuenta;
    }
    
    public void run(){
        System.out.println(Thread.currentThread().getName() + " : iniciando ...");
        for (int i = 0; i < 100; i++){
//            synchronized(cuenta){
                montoGirado += cuenta.girar(monto);
//            }
        }
        System.out.println(Thread.currentThread().getName() + " : finalizando, total monto girado : " + montoGirado);
    }
}
