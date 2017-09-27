package nosync;

public class Prueba {
    public static void probarGiro(){
        Cuenta cuenta = new Cuenta();
        
        cuenta.depositar(600);
        
        Runnable g1 = new Girador(1, cuenta);
        Runnable g2 = new Girador(2, cuenta);
        Runnable g3 = new Girador(3, cuenta);
        
        Thread t1 = new Thread(g1, "-");
        Thread t2 = new Thread(g2, "**");
        Thread t3 = new Thread(g3, ">>>");
        
        t1.start();
        t2.start();
        t3.start();
        
        try {
            t1.join();
            t2.join();
            t3.join();
        } catch (InterruptedException ex){
        }
        
        System.out.println("saldo en cuenta : " + cuenta.getSaldo());
    }
    
    public static void main(String[] args){
    	probarGiro();
    }
}