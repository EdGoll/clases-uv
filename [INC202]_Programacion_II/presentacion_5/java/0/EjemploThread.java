public class EjemploThread extends Thread {

     public void run(){
       for(int i=5; i>0;i--){
         try {
            System.out.println("MyThread running"+getName());
            Thread.sleep(1000);
         } catch (InterruptedException ex) {
             Thread.currentThread().interrupt();
         }
       }
     }

}
