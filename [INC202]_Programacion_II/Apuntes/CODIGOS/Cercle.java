class Cercle{
	private PuntoTest p;
	private float r;
	public Cercle(int x,int y, float r){
		p=new PuntoTest(x,y);
		this.r=r;
		p.mostrar();
		
	}
	public void mostrar(){
		System.out.println("Punto central del circulo de coordenadas : "+p.x+"  " +p.y);
		System.out.println("Radio del circulo : "+r);}
	
	public void desplazar(PuntoTest p, int dx, int dy){
		p.x+=dx;
		p.y+=dy;
		System.out.println("Punto central desplazado del circulo : "+p.x+"  " +p.y);}
	
	
}