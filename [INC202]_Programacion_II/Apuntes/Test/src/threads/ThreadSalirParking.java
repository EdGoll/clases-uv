package threads;

public class ThreadSalirParking implements Runnable {

    @Override
    public void run() {
        Parking p = new Parking();

        for (int i = 0; i < 10; i++) {
            p.salir();
        }
    }
}
