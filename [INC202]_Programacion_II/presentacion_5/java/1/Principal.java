public class Principal {

    public static void main(String[] args) {

        Cliente cliente1 = new Cliente("Cliente 1", new int[]{2, 2, 1, 5, 2, 3});
        Cliente cliente2 = new Cliente("Cliente 2", new int[]{1, 3, 5, 1, 1});

        Cajera cajera = new Cajera("Cajera ");

        long initialTime = System.currentTimeMillis();

        cajera.procesarCompra(cliente1, initialTime);
        cajera.procesarCompra(cliente2, initialTime);
    }
}
