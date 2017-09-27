public class Test {
    public static void ejecutarSaludos(){
        Thread t1 = new SaludoThread("-");
        Thread t2 = new SaludoThread("**");
        Thread t3 = new SaludoThread(">>>");
        
        t1.start();
        t2.start();
        t3.start();
        
    }
}
