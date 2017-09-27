
import java.util.Random;

public class BajadaThread extends Thread
{
    private Autobus a;
    private Random r;
    
    public BajadaThread(Autobus a)
    {
        this.a = a;
    }
    @Override
    public void run()
    {
        while(true)
        {
            r = new Random();
            a.bajada(r.nextInt(10)+1);
        }
    }
}
