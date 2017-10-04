public class EjemploThreadImpl{

    public static void main(String[] args) {

      EjemploThread ej = new EjemploThread();
      ej.start();
      System.out.println("Comenzando...");


      EjemploThreadClose ejClose = new EjemploThreadClose();
      ejClose.start();
      System.out.println("Comenzando EjemploThreadClose...");
      try {
        Thread.sleep(1000);
      } catch (InterruptedException ex) {
          Thread.currentThread().interrupt();
      }
      ejClose.terminar();

    }
}
