

public class Mago extends Personaje{
	
	private String hechizo;
	private int danio;
	private String ta;
	public Mago(String nombre,int energia,String hechizo) {
		super(nombre, energia);
		this.hechizo=hechizo;
	}
	
	public int encantar(int ataque,int especial) {
		if(ataque == 0) {
			danio=20;
			ta="Llamarada";
		}
		else if(ataque==1) {
			danio=35;
			ta="Insendio";
			if(especial==1)danio+=5;
		}
		else if(ataque==2) {
			danio=60;
			ta="Explosion";
		}
		else danio = 0;
		return danio;		
	}

	@Override
	public int alimentarse(int nuevaEnergia) {
		nuevaEnergia = (int) (nuevaEnergia * 0.5);
		return nuevaEnergia;
	}

	@Override
	public int consumirEnergia(int gastoEnergia) {	
		return gastoEnergia;
	}

	public String toString() {
		String mensaje;
		if(danio <= 0)mensaje=nombre+"Pierde turno";
		else mensaje=nombre+" uso "+hechizo+" "+ta+" causando "+danio+"pts de danio";
		return mensaje;
	}	

}
