package threads;

public class Principal {

    public static void main(String[] args) {
        Thread th1 = new Thread(new ThreadEntrarParking());
        Thread th2 = new Thread(new ThreadSalirParking());

        th1.start();
        th2.start();
    }
}
