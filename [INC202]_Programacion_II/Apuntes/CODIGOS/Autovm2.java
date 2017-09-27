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
	void showAtr(){
		System.out.println("Este auto es un" +
					marca+ "de color"+color);
	}
}