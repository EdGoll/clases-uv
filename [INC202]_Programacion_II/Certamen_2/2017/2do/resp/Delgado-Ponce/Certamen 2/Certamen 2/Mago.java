
public class Mago extends Personaje {
	
	private String hechizo;
	private String[] niveles = {"Llamarada", "Incendio", "Explosion", "PierdeTurno"};
	private String t_ataque;
	private int v_ataque = 0;
	NumeroAleatorio golpe = new NumeroAleatorio();
	
	
		public Mago(String nombre, Integer energia, String hechizo) {
		super(nombre, energia);
		this.hechizo = hechizo;
		
	}
	
	public Mago(){
		
	}
	
	public String getHechizo(){
		return hechizo;
	}
	public void setHechizo(String hechizo){
		this.hechizo = hechizo;
	}	
	
	public int encantar() {
			
		
		int a = golpe.getNumero(4);
		
		switch (a) {
		
		case 0:
			System.out.println("El ataque realizado es: " + niveles[0]);
			v_ataque = 20;
			t_ataque = niveles[0];
			consumirEnergia(2);
			System.out.println("Valor ataque: " + v_ataque);
			break;
			
		case 1:
			System.out.println("El ataque realizado es: " + niveles[1]);
			v_ataque = 35;
			t_ataque = niveles[1];
			consumirEnergia(2);
			int x = golpe.getNumero(2);
			if (x == 1) {
				v_ataque +=5;
				System.out.println("Valor ataque: " + v_ataque);
			}
			else {
				v_ataque = 35;
				System.out.println("Valor ataque: " + v_ataque);
			}
			break;
		
		case 2:
			System.out.println("El ataque realizado es: " + niveles[2]);
			v_ataque = 60;
			t_ataque = niveles[2];
			consumirEnergia(2);
			alimentarse(30);
			System.out.println("Valor ataque: " + v_ataque);
			
			break;
			
		case 3:
			System.out.println( niveles[3]);
			v_ataque = 0;
			t_ataque = niveles[3];
			System.out.println("Valor ataque: " + v_ataque);
			break;
		
		}
		
	
		return v_ataque;
	}
	//RETORNA EL TIPO DE ATAQUE PARA SER ESCRITO EN UN ARCHIVO.
	public String tipoAtaque() {
		return t_ataque;
		
	//RETORNA EL VALOR DEL ATAQUE.
	}
	public int valorAtaque() {
		return v_ataque;
		
	}
	
}

