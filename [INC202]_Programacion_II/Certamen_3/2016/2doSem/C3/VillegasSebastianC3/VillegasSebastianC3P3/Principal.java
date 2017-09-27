
public class Principal
{
    public static void main(String[] args) 
    {
        Autobus a = new Autobus(45);
        SubidaThread s = new SubidaThread(a);
        BajadaThread b = new BajadaThread(a);
        s.start();
        b.start();
    }
    
}
