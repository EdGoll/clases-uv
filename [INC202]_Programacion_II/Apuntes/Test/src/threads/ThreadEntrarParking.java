package threads;

public class ThreadEntrarParking implements Runnable {

    @Override
    public void run() {
        Parking p = new Parking();

        for (int i = 0; i < 10; i++) {
            p.entrar();
        }
    }
}
