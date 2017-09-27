public static void main (String args[]){
	Auto a = new Auto();
	a.marca = "Toyota Yaris";
	a.color="rojo";
	System.out.println("llamando a showAtri");
	a.showAtri();
	System.out.println("llamando a startMotor");	
	a.startMotor();
}

