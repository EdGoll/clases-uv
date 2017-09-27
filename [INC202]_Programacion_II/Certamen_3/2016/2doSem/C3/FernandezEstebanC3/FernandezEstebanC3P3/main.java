public class main {
    public static void main(String[] args) throws InterruptedException{
        
        Autobus bus = new Autobus();
        SubidaThread up = new SubidaThread(bus);
        BajadaThread down = new BajadaThread(bus);
        up.start();
        down.start();
        
    }
}
