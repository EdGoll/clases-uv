public class Prueba {
    public static void pruebaSaludo(){
        Thread t1 = new SaludoThread("-");
        Thread t2 = new SaludoThread("**");
        Thread t3 = new SaludoThread(">>>");
        
        t1.setPriority(Thread.MIN_PRIORITY);
        t2.setPriority(3);
        t3.setPriority(Thread.MAX_PRIORITY);
        
        t1.start();
        t2.start();
        t3.start();
        
    }

    public static void pruebaCuenta(){
        Cuenta cuenta = new Cuenta();
        cuenta.depositar(300);
        
        Thread t1 = new Girador("-", 1, cuenta);
        Thread t2 = new Girador("**", 2, cuenta);

        
        t1.start();
        t2.start();
        //t3.start();
        
    }

}
