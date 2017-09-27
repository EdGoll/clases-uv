public class Principal {

    public static void main(String[] args) {

        SimulacionCliente sc = new SimulacionCliente();

        ThreadRetailIngreso tri = new ThreadRetailIngreso(sc);
        ThreadRetailEgreso tre = new ThreadRetailEgreso(sc);

        tri.start();
        tre.start();

        try {
            tri.join();
            tre.join();
        } catch (InterruptedException ex) {
        }
    }
}
