public class Area{
	
	int largo;
	int ancho;
	float areat;
	
	void calculoArea(){
		if ((largo<=0)||(ancho<=0)){
			System.out.println("El calculo del area es imposible");}
		else{areat = (largo*ancho);
			System.out.println("El area es "+ areat);
		}
	}
		public static void main (String args[]){
			Area a = new Area();
			a.largo = 15;
			a.ancho=4;
			System.out.println("llamando al metodo calcular area");
			a.calculoArea();
		}	
	}