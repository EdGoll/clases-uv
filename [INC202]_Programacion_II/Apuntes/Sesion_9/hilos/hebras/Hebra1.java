package hebras;

public class Hebra1 {
    
    
    public static void main(String[] args) {
        abstract class MiCorredor implements Runnable{
            protected String nombre;
            public void setNombre(String nombre){
                this.nombre = nombre;
            }
            
        }
        
        MiCorredor r =  new MiCorredor(){
            public void run(){
                System.out.println(Thread.currentThread().getName() + " : " + nombre);
            }
/*
            private synchronized void correrSincronizado(){
                System.out.println(Thread.currentThread().getName() + " : " + nombre);
            }
 */
        };
        /*
        r.setNombre("primer nombre");
        new Thread(r, "uno").start();
         
        r.setNombre("segundo nombre");
        new Thread(r, "dos").start();
         
        r.setNombre("tercer nombre");
        new Thread(r, "tres").start();
         
        r.setNombre("cuarto nombre");
        new Thread(r, "cuatro").start();
         */
        
        Thread t1 = new Thread(r);
        t1.start();
        try {
            t1.join();
        } catch (InterruptedException ex) {
            ex.printStackTrace();
        }
        t1.start();
        
        
    }
    
}
