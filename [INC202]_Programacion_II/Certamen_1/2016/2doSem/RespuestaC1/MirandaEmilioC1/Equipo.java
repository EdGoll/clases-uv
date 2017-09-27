import java.util.Random;

public class Equipo{
	private int nombre;
	private Jugador[] listajugadores=new Jugador[11];
	private int nivelcolectivo;
	
	public void setNombre(int nombre){
		this.nombre=nombre;
	}
	public int getNombre(){
		return nombre;
	}
	public void agregarJugadores(){
		Jugador portero=new Jugador();
		Random random=new Random();
		//Portero:
		portero.setId(1);
		portero.setBr(random.nextInt(100)+1);
		portero.setBg(random.nextInt(100)+1);
		portero.setGc(0);
		portero.setTipo("portero");
		portero.setNivelJugador((int)(((portero.getBr()*20)/100) + ((portero.getBg()*35)/100) + ((portero.getGc()*45)/100)));
		listajugadores[0]=portero;
		//Defensas:
		for(int x=2;x<5;x++){
			Jugador defensa=new Jugador();
			defensa.setId(x);
			defensa.setBr(random.nextInt(100)+1);
			defensa.setBg(random.nextInt(100)+1);
			defensa.setGc(random.nextInt(100)+1);
			defensa.setTipo("defensa");
			defensa.setNivelJugador((int)(((defensa.getBr()*20)/100) + ((defensa.getBg()*35)/100) + ((defensa.getGc()*45)/100)));
			listajugadores[x-1]=defensa;
		}
		//Laterales:
		for(int x=5;x<7;x++){
			Jugador lateral=new Jugador();
			lateral.setId(x);
			lateral.setBr(random.nextInt(100)+1);
			lateral.setBg(random.nextInt(100)+1);
			lateral.setGc(random.nextInt(100)+1);
			lateral.setTipo("lateral");
			lateral.setNivelJugador((int)(((lateral.getBr()*20)/100) + ((lateral.getBg()*35)/100) + ((lateral.getGc()*45)/100)));
			listajugadores[x-1]=lateral;
		}
		//Centro campistas:
		for(int x=7;x<9;x++){
			Jugador ccampista=new Jugador();
			ccampista.setId(x);
			ccampista.setBr(random.nextInt(100)+1);
			ccampista.setBg(random.nextInt(100)+1);
			ccampista.setGc(random.nextInt(100)+1);
			ccampista.setTipo("centro campista");
			ccampista.setNivelJugador((int)(((ccampista.getBr()*20)/100) + ((ccampista.getBg()*35)/100) +
							((ccampista.getGc()*45)/100)));
			listajugadores[x-1]=ccampista;
		}
		//Delanteros:
		for(int x=9;x<=11;x++){
			Jugador delantero=new Jugador();
			delantero.setId(x);
			delantero.setBr(random.nextInt(100)+1);
			delantero.setBg(random.nextInt(100)+1);
			delantero.setGc(random.nextInt(100)+1);
			delantero.setTipo("delantero");
			delantero.setNivelJugador((int)(((delantero.getBr()*20)/100) + ((delantero.getBg()*35)/100) +
							((delantero.getGc()*45)/100)));
			listajugadores[x-1]=delantero;
		}
	}
	public void setNivelColectivo(int nivelcolectivo){
		this.nivelcolectivo=nivelcolectivo;
	}
	public int getNivelColectivo(){
		return nivelcolectivo;
	}
	public int calcularNivelColectivo(){
		int nc=0;
		for(int x=0;x<11;x++){			
		nc=listajugadores[x].getNivelJugador() + nc;
		}
		return nc;
	}
}
