public class Ejecutable implements Runnable {
    public void run(){
        for (int i = 0; i < 1000; i++){
            System.out.println(Thread.currentThread().getName() + "  : " + i);
            Thread.currentThread().yield();
            try {
                Thread.currentThread().sleep(10);
            } catch (InterruptedException ex){
                //nada que hacer
            }
        }
    }
}
