

public class Guerrero extends Personaje{
	
	private String arma;
	private int danio;
	private String ta;
	
	public Guerrero(String nombre, int energia,String arma) {
		super(nombre, energia);
		this.arma=arma;
	}

	public int combatir(int ataque) {
		if(ataque == 0) {
			danio=20;
			ta="Golpe directo";
		}
		else if(ataque==1) {
			danio=30;
			ta="Giro letal";
		}
		else if(ataque==2) {
			danio=70;
			ta="Super arma";
		}
		else danio = 0;
		return danio;
	}

	public int alimentarse(int nuevaEnergia) {
		return 0;
	}

	public int consumirEnergia(int gastoEnergia) {
		gastoEnergia = (int) (gastoEnergia * 0.3);
		return gastoEnergia;
	}

	public String toString() {
		String mensaje;
		if(danio <= 0)mensaje=nombre+"Pierde turno";
		mensaje=nombre+" usa su "+arma+" y realiza el ataque "+ta+" causando "+danio+"pts de danio";
		return mensaje;
	}


}
