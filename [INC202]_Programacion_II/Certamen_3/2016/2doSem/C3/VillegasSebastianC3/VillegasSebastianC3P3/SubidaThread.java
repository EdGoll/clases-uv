
import java.util.Random;

public class SubidaThread extends Thread
{
    private Autobus a;
    private Random r;
    
    public SubidaThread(Autobus a)
    {
        this.a = a;
    }
    @Override
    public void run()
    {
        while(true)
        {
            r = new Random();
            a.subida(r.nextInt(10)+1);
        }
    }
}
