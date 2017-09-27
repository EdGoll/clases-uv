public class Auto{

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
	//test para docs
	void showAtr(){
		System.out.println("Este auto es un " +
					marca+ " de color "+color);
	}
	//test numero 2
	public static void main (String args[]){
		Auto a = new Auto();
		a.marca = "Toyota Yaris";
		a.color="rojo";
		System.out.println("llamando a showAtri");
		a.showAtr();
		System.out.println("llamando a startMotor");	
		a.startMotor();
	}
	
}