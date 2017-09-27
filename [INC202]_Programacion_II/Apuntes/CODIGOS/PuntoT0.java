class PuntoT{
	int x,y;
	public PuntoT (int abs, int ord){
		x=abs;
		y=ord;}
	public PuntoT (){
		x=0;
		y=0;}
	public PuntoT (int abs){
		x=y=abs;}
	void desplazar(int dx, int dy){
		x+=dx;
		y+=dy;}
	void desplazar(int dx){
		x+=dx;
	}
	void desplazar(short dy){
		y+=dy;
	}
	public void mostrar(){
		System.out.println("punto de coordenadas : "+x+" " + y);}
}
