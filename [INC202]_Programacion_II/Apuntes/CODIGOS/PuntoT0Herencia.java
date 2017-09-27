class Punto{
	private int x,y;
	public void inicializar (int abs, int ord){
		x=abs;
		y=ord;}
	public void desplazar(int dx, int dy){
		x+=dx;
		y+=dy;}
	public void mostrar(){
		System.out.println("punto de coordenadas : "+x+" " + y);}
}

