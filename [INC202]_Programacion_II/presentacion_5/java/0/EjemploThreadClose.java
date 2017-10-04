public class EjemploThreadClose extends Thread {

  private boolean isRunning = true;

     public void run(){

          while(isRunning){
           try {
              System.out.println("MyThread running"+ getName());
              Thread.sleep(1000);
           } catch (InterruptedException ex) {
               Thread.currentThread().interrupt();
           }
         }
        System.out.println("Terminando EjemploThreadClose...");
     }

     public void terminar() {
         isRunning = false;
     }

}
