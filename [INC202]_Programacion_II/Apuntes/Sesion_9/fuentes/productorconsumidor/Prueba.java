package productorconsumidor;

public class Prueba {
    public static void pruebaDepositarGirar(){
        Cuenta cuenta = new Cuenta();
        
        Thread t1 = new Depositador("marido", 10, cuenta);
        Thread t2 = new Girador("esposa", 9, cuenta);
        
        t1.start();
        t2.start();
            
        try {
            t1.join();
            t2.join();
        } catch (InterruptedException ex){ }

        System.out.println("saldo en cuenta : " + cuenta.getSaldo());
    }
    
    public static void main(String[] args){
        pruebaDepositarGirar();
    }
}
