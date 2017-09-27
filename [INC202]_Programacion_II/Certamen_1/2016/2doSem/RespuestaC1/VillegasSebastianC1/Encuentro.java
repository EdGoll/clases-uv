import java.util.Random;

public class Encuentro 
{
    private int poswin,posded,Empate;
    public void playEncuentro(int pwlvl1,int pwlvl2, int pos1, int pos2)
    {
        Random r = new Random();
        Empate = 0;
        if (pwlvl1 > pwlvl2)
        {
            poswin = pos1;
            posded = pos2;
        }
        else
        {
            if(pwlvl1 == pwlvl2)//Si son iguales se resuelve al azar
            {
                Empate = 1;
                if(r.nextInt(2) == 0)
                {
                    poswin = pos1;
                    posded = pos2;
                }
                else
                {
                    poswin = pos2;
                    posded = pos1;
                }
            }
            else
            {
                poswin = pos2;
                posded = pos1;
            }
        }
    }
    
    public int getWinner()
    {
        return poswin;
    }
    public int getLoser()
    {
        return posded;
    }
    public int getEmpate()
    {
        return Empate;
    }       
}
