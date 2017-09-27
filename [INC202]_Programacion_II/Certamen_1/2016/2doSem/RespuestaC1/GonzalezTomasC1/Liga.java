


import java.util.ArrayList;
import java.util.Random;

public class Liga {
	int[] equipos_ya_jugaron = new int[16];
	ArrayList<Equipo> equipos_octavos = new ArrayList<>();
	ArrayList<Equipo> equipos_cuartos = new ArrayList<>();
	ArrayList<Equipo> equipos_semi = new ArrayList<>();
	ArrayList<Equipo> equipos_final = new ArrayList<>();
	Equipo[] equipos_aux = new Equipo[16]; 
	Equipo ganador;
	
	public void octavos_final(){
		Random rdm = new Random();
		for (int i = 0; i < 16; i++) {
			equipos_octavos.add(new Equipo(rdm.nextInt(100)+1));
		}
		System.out.println("OCTAVOS DE FINAL");
		for (int i = 0; i < 16 ;) {
			
			ganador = Encuentro.ganador_partido(equipos_octavos.get(i), equipos_octavos.get(i+1));
			equipos_cuartos.add(ganador);
			System.out.println(", Resultado: Ganador Equipo " + ganador );
			
			i=i+2;
			
			
		}
		cuartos_final();
	}
	public void cuartos_final(){
		System.out.println("CUARTOS DE FINAL");
		for (int i = 0; i < 8 ;) {
			
			ganador = Encuentro.ganador_partido(equipos_cuartos.get(i), equipos_cuartos.get(i+1));
			equipos_semi.add(ganador);
			System.out.println(", Resultado: Ganador Equipo " + ganador );
			i=i+2;
			
			
		}
		semi_final();
	}
	public void semi_final(){
		System.out.println("SEMI FINAL");
		for (int i = 0; i < 4 ;) {
			
			ganador = Encuentro.ganador_partido(equipos_semi.get(i), equipos_semi.get(i+1));
			equipos_final.add(ganador);
			System.out.println(", Resultado: Ganador Equipo " + ganador );
			i=i+2;
			
			
		}
		final_final();
	}
	public void final_final(){
		System.out.println(" FINAL");
		for (int i = 0; i < 2 ;) {
			
			ganador = Encuentro.ganador_partido(equipos_final.get(i), equipos_final.get(i+1));
			System.out.println(", Resultado: Ganador Equipo " + ganador );
			i=i+2;
			
			
		}
	}
	
 
}
