public class EjemploThreadImpl{

    public static void main(String[] args) {

      EjemploThread ej = new EjemploThread();
      ej.start();
      System.out.println("Comenzando... ej");

      EjemploThreadClose ejClose = new EjemploThreadClose();
      ejClose.start();
      System.out.println("Comenzando EjemploThreadClose...");

      ejClose.terminar();
    }
}
