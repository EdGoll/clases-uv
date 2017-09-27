package nosync;

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
    
    public /*synchronized*/ int girar(int monto){

        if (monto <= saldo){
            saldo -= monto; 
            montoUltimoGiro = monto;
            //hacer una pausa para "fabricar" problemas de concurrencia
            pausa();
        } else {
            montoUltimoGiro = 0;
            System.out.println(Thread.currentThread().getName() + " : No hay suficiente saldo : " + saldo);
        }
        
        return montoUltimoGiro;
    }
    
    private void pausa(){
        try {
            Thread.sleep(5);
        } catch (InterruptedException ex){
        }
    }
}
