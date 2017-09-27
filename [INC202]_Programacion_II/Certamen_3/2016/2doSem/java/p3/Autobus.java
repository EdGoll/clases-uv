import java.util.Random;

public class Autobus {
    
    private final int CAPACIDAD = 45;
    private int pasajeros, suben, bajan;
    private final Random rnd;
    
    public Autobus() {
        pasajeros = 0;
        rnd = new Random();
    }
    
    public synchronized void subir() {
        try {
            Thread.sleep((rnd.nextInt(5) + 1) * 1000);
            suben = rnd.nextInt(10) + 1;
            
            while((pasajeros + suben) > CAPACIDAD) {
                wait();
            }
            pasajeros += suben;
            System.out.println(String.format("Suben %d pasajeros. Total = %d", suben, pasajeros));
            notifyAll();
        } catch (InterruptedException ie) {
            System.out.println(String.format("Error: %s", ie.getMessage()));
        }
    }
    
    public synchronized void bajar() {
        try {
            Thread.sleep((rnd.nextInt(5) + 1) * 1000);
            bajan = rnd.nextInt(10) + 1;
            while((pasajeros - bajan) < 0) {
                wait();
            }
            pasajeros -= bajan;
            System.out.println(String.format("Bajan %d pasajeros. Total = %d", bajan, pasajeros));
            notifyAll();
        } catch (InterruptedException ie) {
            System.out.println(String.format("Error: %s", ie.getMessage()));
        }
    }
}
