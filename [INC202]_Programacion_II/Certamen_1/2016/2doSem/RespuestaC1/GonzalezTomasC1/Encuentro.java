

import java.util.Random;

public class Encuentro {
	
	public static Equipo ganador_partido(Equipo equipo1, Equipo equipo2){
		System.out.print(equipo1.toString());
		System.out.print(" v/s ");
		System.out.print(equipo2.toString());
		if(equipo1.getNivel_juego() == equipo2.getNivel_juego()){
			Random rnd = new Random();
			int aux = rnd.nextInt(1);
			if(aux==0){
				return equipo1;
			}else {
				return equipo2;
			}
		}else if (equipo1.getNivel_juego() > equipo2.getNivel_juego()){
			return equipo1;
		}else {
			return equipo2;
		}
		
	}
}
