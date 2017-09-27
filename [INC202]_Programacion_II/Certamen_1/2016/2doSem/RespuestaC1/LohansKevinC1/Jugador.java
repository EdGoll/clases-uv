import java.util.Random;

public class Jugador{
	public int num_id;
	public int BR;
	public int niv_ind;
	public int BG;
	public int gc;

	public void numJugador(){
		Random r = new Random();
		num_id=r.nextInt(14483);
	}

	public int BR(){
		Random r = new Random();
		BR= r.nextInt(100)+1;
		return(BR);
	}
	public int BG(){
		Random r = new Random();
		BG = r.nextInt(100)+1;
		return(BG);
	}

	public int GC(){
		Random r=new Random();
		gc=r.nextInt(100);
		return (gc);

	}

	public int juegoIndividual(){
			niv_ind= (int)(BR*0.2 + BG*0.35 + gc*0.45);
			return (niv_ind);
	}

}
