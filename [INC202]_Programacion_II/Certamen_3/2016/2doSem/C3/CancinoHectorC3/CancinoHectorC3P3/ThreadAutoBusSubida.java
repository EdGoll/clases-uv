import java.util.Random;

public class ThreadAutoBusSubida extends Thread {

    private Random rnd;
    private final AutoBus autoBus;

    public ThreadAutoBusSubida(AutoBus autoBus) {
        this.autoBus = autoBus;
    }
    
    @Override
    public void run() {
        rnd = new Random();
        while (true) {
            try {
                ThreadAutoBusSubida.sleep((rnd.nextInt(5)+1)*1000);
                autoBus.subida(rnd.nextInt(10)+1);
            } catch (InterruptedException ex) {
            }
        }
    }
}
