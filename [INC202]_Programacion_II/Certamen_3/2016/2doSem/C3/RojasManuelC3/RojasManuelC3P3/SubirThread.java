public class SubirThread extends Thread {

    private Autobus a;

    public SubirThread(Autobus a) {
        this.a = a;
    }

    @Override
    public void run() {
        while (true) {
            a.subir();
        }
    }

}
