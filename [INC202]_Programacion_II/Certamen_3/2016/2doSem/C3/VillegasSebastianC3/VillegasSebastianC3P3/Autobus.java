
import java.util.Random;

public class Autobus 
{
    private int nEsp,nEspMax;
    private Random r;

    public Autobus(int nEsp) 
    {
        this.nEsp = nEsp;
        nEspMax = nEsp;
        r = new Random();
    }

    public synchronized void subida(int nSubida) 
    {
        int nSubidaEx = 0;
        try
        {
            if(nEsp - nSubida < 0)
            {
                nEsp-= nSubida;
                while(nEsp < 0)
                {
                    nEsp++;
                    nSubidaEx++;
                }
                nSubida-= nSubidaEx;
                nSubidaEx = 0;
            }
            else
            {
                nEsp-= nSubida;
            }
            
            if(nSubida > 1)
            {
                System.out.println("Han subido "+nSubida+" personas");
            }
            else
            {
                System.out.println("Ha subido "+nSubida+" persona");
            }
            
            while (nEsp == 0) 
            {  
                System.out.println("\nEl bus se ha llenado\n");
                wait();
            }
            System.out.println("Hay "+(nEspMax-nEsp)+" pasajeros en el bus");
            notifyAll();
            Thread.sleep((r.nextInt(5)+1)*1000);
            
        }
        catch (InterruptedException ex) 
        {
            System.out.println(ex.getMessage());
        }
    }

    public synchronized void bajada(int nBajada) 
    {
        int nBajadaEx = 0;
        try 
        {
            if(nEsp + nBajada > nEspMax)
            {
                nEsp+= nBajada;
                while(nEsp > nEspMax)
                {
                    nEsp--;
                    nBajadaEx++;
                }
                nBajada-= nBajadaEx;
                nBajadaEx = 0;
            }
            else
            {
                nEsp+= nBajada;
            }
            
            if(nBajada > 1)
            {
                System.out.println("Han bajado "+nBajada+" personas");
            }
            else
            {
                System.out.println("Ha bajado "+nBajada+" persona");
            }
            
            while (nEsp == nEspMax) 
            {
                
                System.out.println("\nEl bus se encuentra vacío\n");
                wait();
            }
            System.out.println("Hay "+(nEspMax-nEsp)+" pasajeros en el bus");
            notifyAll();
            Thread.sleep((r.nextInt(5)+1)*1000);
            
        }
        catch (InterruptedException ex) 
        {
            System.out.println(ex.getMessage());
        }
    }
}
