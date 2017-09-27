

public class ThreadSalir extends Thread {

    private final micro mic;

    public ThreadSalir(micro mic) {
        this.mic = mic;
    }

    @Override
    public void run() {
        while (true) {
            try {
                ThreadSalir.sleep((long) (1 + (int) (Math.random() * 5)) * 1000);
                mic.salir((int) (1 + (int) (Math.random() * 10)));
            } catch (InterruptedException ex) {
            }
        }
    }
}
