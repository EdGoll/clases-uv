import java.util.Random;
import java.util.ArrayList;
public class Encuentro{

	public int niv_equip[] = new int [16];
	public int partido[][] = new int [8][2];
	private int tamanio, MIN=1, MAX=16,ID=100;

	Random r = new Random();
	Equipo nuevo = new Equipo();
	public void equipos(){
		int relleno[] = new int [100];
		for (int i=0; i<relleno.length; i++){
			relleno[i]=nuevo.nombreEquipo();
		}
		for (int i=0; i<equipos.length;i++){
			int n=100;
			int res=r.nextInt(n);
			equipos[i]=relleno[res];
			relleno[res]=relleno[n-1];
			n--;

		}

		for (int i=0; i<niv_equip.length; i++){
			niv_equip[i]=nuevo.jugadoresEquipo();
		}
		
		for (int i=0; i<equipos.length; i++){
			//for(j=0;j<equipos[i].length; j++){
				System.out.println("equipo "+equipos[i]);
				System.out.println("lvl "+niv_equip[i]);
			//}	
		}		
	}
	
	public Equipo encuentros(Equipo equip1, Equipo equip2){
		if (equip1.jugadoresEquipo<equip2.jugadoresEquipo)

			return(equip1);
		else if (equip2.jugadoresEquipo<equip1.jugadoresEquipo)
			return(equip2);
		else 
			if (empate()==0)
				return(equip1);
			else
				return(equip2);

		/*for (int i=0; i<partido.length; i++){
			for (int j=0; j<partido[i].length; j++)
				partido[i][j]=r.nextInt(16)+1;
		}*/
	}

	public int empate(){
		int rnd = r.nextInt(2);
		return(rnd);
	}
}