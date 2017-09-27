public class Auto{

	String color;
	String marca;
	boolean estado;
	
	public void startMotor(){
		if (estado== true)
			System.out.println("Auto encendido");
		else {
			estado=true;
			System.out.println("Ok se encendio");}}}