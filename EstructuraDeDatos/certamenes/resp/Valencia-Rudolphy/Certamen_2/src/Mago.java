import java.util.Random;

public class Mago extends Personajes{	
	 String hechizo;
	 String ataques[]= {"Llamarada", "Incendio","Explosion","Pierde turno"};
	 String tipo_hechizo="";
	 int dmg=0;
	public Mago(String nombre,int Energia,String hechizo) {
		super(nombre,100);
		this.hechizo=hechizo;
	}
	 
	 public int encantar() {
		Random r = new Random();
		int ataque= r.nextInt(5);
		
		
		
		switch(ataque) {
		case 0:
			System.out.println("Con:"+ ataques[0]+". ");
			tipo_hechizo=ataques[0];
			dmg=20;
			System.out.println("con daño de: "+dmg+"!");
			consumirEnergia(2);
			break;
		case 1:
			System.out.println("con:"+ataques[1]+". ");
			dmg=35;
			tipo_hechizo=ataques[1];
			System.out.println("con daño de: "+dmg+"!");
			int extra = r.nextInt(2);			
			if(extra==1) {
				dmg+=5;
			}
			consumirEnergia(2);
			break;
		case 2:
			System.out.println("Con:"+ataques[2]+". ");
			tipo_hechizo=ataques[2];
			dmg=60;
			System.out.println("con daño de: "+dmg+"!");
			consumirEnergia(2);
			alimentarse(30);
			break;
		case 3:
			System.out.println("El mago: "+ataques[3]);
			tipo_hechizo=ataques[3];
			dmg=0;
			break;
			
		}
		return dmg;
		
	}
	 public String tipoAtaque() {
			return tipo_hechizo;
		}
		public int daño() {
			return dmg;
		}

	
}
