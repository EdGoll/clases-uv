class Cercle{
	private PuntoTest p;
	private float r;
	public Cercle(int x,int y, float r){
		p=new PuntoTest(x,y);
		this.r=r;
	}
	public void mostrar(){
		System.out.println("Punto central del circulo de coordenadas : "+p.getX()+"  " +p.getY());
		System.out.println("Radio del circulo : "+r);}
	
	public void desplazar(int dx, int dy){
		p.setX(p.getX()+dx);
		p.setY(p.getY()+dy);}
	
	
}