package productorconsumidor;

public class Cuenta {
    private int saldo;
    private int montoUltimoGiro;
    private boolean cuentaConSaldo = false;

    public int getSaldo(){
        return saldo;
    }
    
    public /* synchronized */ int depositar(int monto){
/*
        while(cuentaConSaldo){
            try {
//                System.out.println(Thread.currentThread().getName() + " : esperando para depositar ...");
                wait();
            } catch (InterruptedException ex) { }
        }
*/
        saldo += monto;
        //hacer una pausa para "fabricar" problemas de concurrencia
        pausa();
        
//        cuentaConSaldo = true;
//        notify();
        return saldo;
    }
    
    public /* synchronized */ int girar(int monto){
/*        
        while(!cuentaConSaldo){
            try {
//                System.out.println(Thread.currentThread().getName() + " : esperando para girar ...");
                wait();
            } catch (InterruptedException ex) { }
        }
*/
        if (monto <= saldo){
            saldo -= monto; 
            montoUltimoGiro = monto;
            //hacer una pausa para "fabricar" problemas de concurrencia
            pausa();
        } else {
            montoUltimoGiro = 0;
            System.out.println(Thread.currentThread().getName() + " : No hay suficiente saldo : " + saldo);
        }
        
//        cuentaConSaldo = false;
//        notify();
        return montoUltimoGiro;
    }
    
    private void pausa(){
        try {
            Thread.sleep(5);
        } catch (InterruptedException ex){ }
    }
}
