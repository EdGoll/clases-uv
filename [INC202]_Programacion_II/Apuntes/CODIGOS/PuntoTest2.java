class PuntoTest{
	private int x,y;
	public PuntoTest (int abs, int ord){
		this.x=abs;
		this.y=ord;}
	public void mostrar(){
		System.out.println("punto de coordenadas : "+x+" " + y);}
	
	public int getX(){return x;}
	public int getY(){return y;}	
	public int setX(int x){return this.x=x;}	
	public int setY(int y){return this.y=y;}	
}
