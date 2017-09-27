

public class Principal {

    public static void main(String[] args) {

        micro mic = new micro();

        ThreadEntrar te = new ThreadEntrar(mic);
        ThreadSalir ts = new ThreadSalir(mic);

        te.start();
        ts.start();

        try {
            te.join();
            ts.join();
        } catch (InterruptedException ex) {
        }
    }
}
