

public class ThreadEntrar extends Thread {

    private micro mic;

    public ThreadEntrar(micro mic) {
        this.mic = mic;
    }
    
    @Override
    public void run() {
        while (true) {
            try {
                ThreadEntrar.sleep((long) (1 + (int)(Math.random() * 5)) * 1000);
                mic.entrar((int) (1 + (int)(Math.random() * 10)));
            } catch (InterruptedException ex) {
            }
        }
    }
}
