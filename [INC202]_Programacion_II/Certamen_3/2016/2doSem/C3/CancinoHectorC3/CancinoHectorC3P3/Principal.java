public class Principal {

    public static void main(String[] args) {

        AutoBus ab = new AutoBus();

        ThreadAutoBusSubida saud = new ThreadAutoBusSubida(ab);
        ThreadAutoBusBajada baud = new ThreadAutoBusBajada(ab);

        saud.start();
        baud.start();

        try {
            saud.join();
            baud.join();
        } catch (InterruptedException ex) {
        }
    }
}
