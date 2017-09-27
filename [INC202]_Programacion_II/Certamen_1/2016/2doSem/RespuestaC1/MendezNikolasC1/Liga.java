
import java.util.ArrayList;

public class Liga {
	
	private ArrayList<Equipo> finales = new ArrayList<Equipo>();
	Encuentro e;
	
	public void octavos(){
		System.out.println("Octavos de final");
		e = new Encuentro();
		int ganador=0;
		e.llenado();
		
		for (int j = 0; j < 8; j++) {
			ganador = e.partido();
			finales.add(e.seleccionados.get(ganador)); 
		}		
	}
	
	@SuppressWarnings("unchecked")
	public void cuartas(){
		System.out.println("\nCuartas de final");
		int ganador;
		e.seleccionados = (ArrayList<Equipo>) finales.clone();
		for (int j = 0; j < 4; j++) {
			ganador = e.partido();
			finales.add(e.seleccionados.get(ganador)); 
		}

	}
	
	@SuppressWarnings("unchecked")
	public void semifinales(){
		System.out.println("\nSemifinales de final");
		int ganador;
		e.seleccionados = (ArrayList<Equipo>) finales.clone();
		for (int j = 0; j < 2; j++) {
			ganador = e.partido();
			finales.add(e.seleccionados.get(ganador)); 
		}

	}

	@SuppressWarnings("unchecked")
	public void finales(){
		System.out.println("\nFinal");
		int ganador;
		e.seleccionados = (ArrayList<Equipo>) finales.clone();
		for (int j = 0; j < 1; j++) {
			ganador = e.partido();
			finales.add(e.seleccionados.get(ganador)); 
		}

	}
}
