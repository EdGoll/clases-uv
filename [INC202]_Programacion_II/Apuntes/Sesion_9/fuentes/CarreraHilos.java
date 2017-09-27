public class CarreraHilos {
    public static void hacerCarrera(){
        Thread t1 = new Thread(new Ejecutable(), "UNO");
        Thread t2 = new Thread(new Ejecutable(), "DOS");
        Thread t3 = new Thread(new Ejecutable(), "TRES");
        
        t1.start();
        t2.start();
        t3.start();
    }
}
