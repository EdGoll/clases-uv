import java.util.ArrayList;
import java.util.Random;

public class Liga 
{
    private int pwlvl1,n1,pwlvl2,n2,asize,posded,poswin,pos1,pos2,Empate,nombreResp; //Posiciones en el arraylist, nivel de juego, nombre de equipos
    private ArrayList<Equipo> e = new ArrayList<Equipo>();
    private ArrayList<Integer> resNombre = new ArrayList<Integer>(); //Restringe nombres ya ocupados
    
    public void ligaGen()
    {
        int resp;
        Equipo eq = new Equipo();
        eq.equipoGen();
        eq.nombreGen();
        resNombre.add(eq.getNombre());//Creo el primer nombre y lo registro como ocupado.
        e.add(eq);
        for(int i = 0; i < 16;i++)
        {
            eq = new Equipo();
            eq.equipoGen();
            eq.nombreGen();
            for(int j = 0; j < resNombre.size(); j++)//Verifico si el nombre está ocupado y añado 1 para diferenciar los nombres
            {
                if(eq.getNombre() == resNombre.get(i))
                {
                    resp = eq.getNombre() + 1;
                    eq.setNombre(resp);
                }
            }
            resNombre.add(eq.getNombre());
            e.add(eq);
        }
    }
    
    public void playLiga()
    {
         
        Equipo eq;
        Equipo equ;
        Equipo equi; 
        Random r = new Random();
        Encuentro en = new Encuentro();
        asize = e.size()/2;//La mitad del tamaño del arraylist
        for (int i = 0; i < asize;i++)//Tomo dos equipos por ciclo
        {
            eq = new Equipo();
            do
            {
                pos1 = r.nextInt(asize*2+1-i);
                eq = e.get(pos1);
                n1 = eq.getNombre();
                pwlvl1 = eq.getTeamPWLVL();
            }while(eq.getPlayed() == true);
            eq = new Equipo();
            do
            {
                pos2 = r.nextInt(asize*2+1-i);
                eq = e.get(pos2);
                n2 = eq.getNombre();
                pwlvl2 = eq.getTeamPWLVL();
            }while(eq.getPlayed() == true || pos2 == pos1);
            
            en.playEncuentro(pwlvl1,pwlvl2,pos1,pos2);
            poswin = en.getWinner();
            posded = en.getLoser();
            Empate = en.getEmpate();
            eq = new Equipo();
            eq = e.get(poswin);
            System.out.println("Equipo " + n1 + " ( nivel de juego " + pwlvl1 + " ) v/s Equipo " + n2 + " ( nivel de juego " + pwlvl2 + " ), ");
            if (Empate == 0)
            {
                System.out.print("Resultado: Ganador Equipo " + eq.getNombre() + "\n");
            }
            else
            {
                System.out.print("Resultado: Empate. Ganador por sorteo: Equipo " + eq.getNombre() + "\n");
            }
            nombreResp = eq.getNombre();
            equ = new Equipo();
            equ.equipoGen();
            equ.setNombre(nombreResp);
            equ.setPlayed();
            e.set(poswin,equ);
            e.remove(posded);
        }
        for (int i = 0; i< e.size();i++) //Reseteo el boolean hasPlayed
        {
            eq = e.get(i);
            equi = new Equipo();
            equi = eq;
            equi.setPlayedFalse();
            e.set(i,equi);
        }
        
    }
}
