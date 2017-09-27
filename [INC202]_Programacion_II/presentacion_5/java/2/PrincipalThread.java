public class PrincipalThread {

    public static void main(String[] args) {
        Parking parking = new Parking(10);

        ThreadEntrada te = new ThreadEntrada(parking);
        ThreadSalida ts = new ThreadSalida(parking);
        
        te.start();
        ts.start();
    }
}
