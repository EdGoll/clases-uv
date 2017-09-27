public class Autot{

	String color;
	String marca;
	boolean estado;
	
	void startMotor(){
		if (estado== true)
			System.out.println("Auto encendido");
		else {
			estado=true;
			System.out.println("Ok se encendio");
		}
	}
	void showAtr(){
		System.out.println("Este auto es un " +
					marca+ " de color "+color);
	}
	
	public static void main (String args[]){
		Autot a = new Autot();
		a.marca = "Toyota Yaris";
		a.color="rojo";
		System.out.println("llamando a showAtri");
		a.showAtr();
		System.out.println("llamando a startMotor");	
		a.startMotor();
	}
	
}