
public class Guerrero extends Personaje{
	
	private String arma;
	private String[] Golpes = {"GolpeDirecto", "GiroLetal", "SuperArma", "PierdeTurno"};
	private String t_ataque = "";
	private int ataque = 0;
	
	NumeroAleatorio golpe = new NumeroAleatorio();
	
	public Guerrero(String nombre, Integer energia, String arma) {
		super(nombre, energia);
		this.arma = arma;
		
	}
	
	public Guerrero(){		
	}
	
	public String getArma(){
		return arma;
	}
	public void setArma(String arma){
		this.arma = arma;
	}	
	
	public Integer combatir() {
		
		
		int a = golpe.getNumero(4);
		
		switch (a) {
		
		case 0:
			System.out.println("El ataque realizado es: " + Golpes[0]);
			ataque = 20;
			t_ataque = Golpes[0];
			System.out.println("Valor ataque: " + ataque);
			break;
			
		case 1:
			System.out.println("El ataque realizado es: " + Golpes[1]);
			ataque = 30;
			t_ataque = Golpes[1];
			System.out.println("Valor ataque: " + ataque);
			break;
		
		case 2:
			System.out.println("El ataque realizado es: " + Golpes[2]);
			ataque = 70;
			t_ataque = Golpes[2];
			consumirEnergia(21);
			System.out.println("Valor ataque: " + ataque);
			break;
			
		case 3:
			System.out.println(Golpes[3]);
			ataque = 0;
			t_ataque = Golpes[3];
			System.out.println("Valor ataque: " + ataque);
			break;
		
		}
	
		return ataque;
	}
	public String tipoAtaque() {
		return t_ataque;
		
	}
	public int valorAtaque() {
		return ataque;
		
	}	
	
	
	
}
