import java.util.Random;
import java.util.ArrayList;

public class Equipo 
{
    private int Nombre,TeamPWLVL = 0;
    private boolean hasPlayed;
    private ArrayList<Jugador> j = new ArrayList<Jugador>();
    
    public void nombreGen()
    {
        Random r = new Random();
        Nombre = r.nextInt(100); //Las instrucciones no son muy claras en la pauta, así que utilizaré este valor como el número de equipo mostrado en la salida
    }
    public void equipoGen()
    {
        Random r = new Random();
        
        j.add(new Jugador(1, r.nextInt(101),r.nextInt(101),0,"Portero")); //Añado un portero al equipo con GC 0
        
        for(int i = 2; i < 5;i++)
        {
            j.add(new Jugador(i, r.nextInt(101),r.nextInt(101),r.nextInt(101),"Defensa")); //Añado tres defensas
        }
        for(int i = 5; i < 7;i++)
        {
            j.add(new Jugador(i, r.nextInt(101),r.nextInt(101),r.nextInt(101),"Lateral")); //Añado dos laterales
        }
        for(int i = 7; i < 9;i++)
        {
            j.add(new Jugador(i, r.nextInt(101),r.nextInt(101),r.nextInt(101),"Centrocampista")); //Añado dos centrocampistas
        }
        for(int i = 9; i < 12;i++)
        {
            j.add(new Jugador(i, r.nextInt(101),r.nextInt(101),r.nextInt(101),"Delantero")); //Añado tres delanteros
        }
        
        for (int i = 0; i < j.size(); i++) //Ántes era su propio método pero por culpable conveniencia lo pongo aquí.
        {
            Jugador ju = j.get(i);
            TeamPWLVL += ju.getPWLVL(); //Dat team pwlvl
        }
        hasPlayed = false;
    }
   
    public int getNombre()
    {
        return Nombre;
    }
    public void setNombre(int Nombre)
    {
        this.Nombre = Nombre;
    }
    
    public int getTeamPWLVL()
    {
        return TeamPWLVL; //Retorno powerlevel del equipo
    }
    public boolean getPlayed()
    {
        return hasPlayed;
    }
    public void setPlayed()
    {
        hasPlayed = true;
    }
    public void setPlayedFalse()
    {
        hasPlayed = false;
    }
}
