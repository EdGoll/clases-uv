public static void main (String args []){
	Rectangulo rect = new Rectangulo();
	System.out.print("Llamar a constRect con las coordenadas : 25,25,50,50:");
	rect.consRect(25,25,50,50);
	rect.printRect();
	System.out.print("Llamar a constRect con los puntos (10,10) y (20,20):");
	rect.consRect(new Point(10,10),new Point(20,20));
	rect.printRect();
	System.out.print("Llamar a constRect con los puntos (10,10) y los valores 50,50 :");
	rect.consRect(new Point(10,10),50,50);
	rect.printRect();}