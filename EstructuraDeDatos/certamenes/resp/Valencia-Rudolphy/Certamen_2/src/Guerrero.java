import java.util.Random;

public class Guerrero extends Personajes {
	String arma;	
	String ataques[]= {"Golpe Directo","Giro Letal","Super arma","Pierde turno"};
	String tipo_ataque="";
	int dmg=0;
	public Guerrero(String nombre,int energia,String arma) {
		super(nombre,150);
		this.arma=arma;
		
	}
	
	public int combatir() {
		
		Random r = new Random();
		int ataque = r.nextInt(4);
		
		
		
		switch(ataque) {
		case 0 :
			System.out.println("Con: "+ataques[0]+". ");
			tipo_ataque=ataques[0];
			dmg=20;
			System.out.println("Con daño de: "+dmg+"!");
			break;
		case 1:
			System.out.println("Con: "+ataques[1]+". ");
			tipo_ataque=ataques[1];
			dmg=30;
			System.out.println("Con daño de: "+dmg+"!");
			break;
		case 2:
			System.out.println("Con: "+ataques[2]+". ");
			tipo_ataque=ataques[2];
			dmg=70;
			System.out.println("Con daño de: "+dmg+"!");
			consumirEnergia(21);
			break;
		case 3:
			System.out.println("Guerrero: "+ataques[3]);
			tipo_ataque=ataques[3];
			dmg=0;
			break;
		}
			return dmg;
		}
		
		public String tipoAtaque() {
			return tipo_ataque;
		}
		public int daño() {
			return dmg;
		}
}

