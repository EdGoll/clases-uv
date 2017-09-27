public class BajarThread extends Thread {

    private Autobus a;

    public BajarThread(Autobus a) {
        this.a = a;
    }

    @Override
    public void run() {
        while (true) {
            a.bajar();
        }
    }
}
