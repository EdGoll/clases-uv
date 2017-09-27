import java.util.Random;

public class ThreadAutoBusBajada extends Thread {
    
    private Random rnd;
    private final AutoBus autoBus;

    public ThreadAutoBusBajada(AutoBus autoBus) {
        this.autoBus = autoBus;
    }

    @Override
    public void run() {
        rnd = new Random();
        while (true) {
            try {
                ThreadAutoBusBajada.sleep((rnd.nextInt(5)+1)*1000);
                autoBus.bajada(rnd.nextInt(10)+1);
            } catch (InterruptedException ex) {
            }
        }
    }
}
