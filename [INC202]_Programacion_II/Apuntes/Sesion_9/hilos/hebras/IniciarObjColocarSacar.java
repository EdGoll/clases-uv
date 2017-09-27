package hebras;

public class IniciarObjColocarSacar {
    public static void main(String[] args) {
        Compartido compartido = new CompartidoSincronizado();
        
        Colocar colocar = new Colocar("RVV", compartido);
        Sacar sacar = new Sacar("EMA", compartido);
        
        Thread ts1 = new Thread(sacar);
        Thread ts2 = new Thread(sacar);
        Thread ts3 = new Thread(sacar);
        Thread t = new Thread(colocar);
        
        ts1.start();
        ts2.start();
        ts3.start();
        
        t.start();
        try {
            t.join();
        } catch (InterruptedException ex) {
            ex.printStackTrace();
        }
//        t.start();
        
        if (ts1.isAlive()) System.out.println("ts1 esta vivo");
        if (ts2.isAlive()) System.out.println("ts2 esta vivo");
        if (ts3.isAlive()) System.out.println("ts3 esta vivo");
    }
}
