import java.util.Random;

public class Equipo{
	
	public int nivel_colectivo;

	public int nombreEquipo(){
		Random r = new Random();
		int nombre = r.nextInt(1000)+1;
		return(nombre);
	}

	public int jugadoresEquipo(){
		Jugador portero = new Jugador();
		while (portero.GC()!=0){
			portero.BR();
			portero.BG();
			portero.GC();
		}
		portero.juegoIndividual();
		Jugador def1 = new Jugador();
			def1.BR();
			def1.BG();
			def1.GC();
			def1.juegoIndividual();
		Jugador def2 = new Jugador();
			def2.BR();
			def2.BG();
			def2.GC();
			def2.juegoIndividual();
		Jugador def3 = new Jugador();
			def3.BR();
			def3.BG();
			def3.GC();
			def3.juegoIndividual();
		Jugador lat1 = new Jugador();
			lat1.BR();
			lat1.BG();
			lat1.GC();
			lat1.juegoIndividual();
		Jugador lat2 = new Jugador();
			lat2.BR();
			lat2.BG();
			lat2.GC();
			lat2.juegoIndividual();
		Jugador ccamp1 = new Jugador();
			ccamp1.BR();
			ccamp1.BG();
			ccamp1.GC();
			ccamp1.juegoIndividual();
		Jugador ccamp2 = new Jugador();
			ccamp2.BR();
			ccamp2.BG();
			ccamp2.GC();
			ccamp2.juegoIndividual();
		Jugador delan1 = new Jugador();
			delan1.BR();
			delan1.BG();
			delan1.GC();
			delan1.juegoIndividual();
		Jugador delan2 = new Jugador();
			delan2.BR();
			delan2.BG();
			delan2.GC();
			delan2.juegoIndividual();
		Jugador delan3 = new Jugador();
			delan3.BR();
			delan3.BG();
			delan3.GC();
			delan3.juegoIndividual();

			nivel_colectivo= portero.juegoIndividual()+def1.juegoIndividual()+def2.juegoIndividual()+def3.juegoIndividual()+lat1.juegoIndividual()+lat2.juegoIndividual()+ccamp1.juegoIndividual()+ccamp2.juegoIndividual()+delan1.juegoIndividual()+delan2.juegoIndividual()+delan3.juegoIndividual();
			return(nivel_colectivo);
		}
}