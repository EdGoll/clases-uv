public class PuntoT{
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
	public static void main(String arg[]){
		PuntoT a,b,c;
		a=new PuntoT(3,5);
		b=new PuntoT();
		c=new PuntoT(4);
		a.mostrar();
		int v=2,w=4;
		a.desplazar(v,w);
		a.mostrar();
		b.mostrar();
		b.desplazar(v);
		b.mostrar();
		short z=3;
		c.mostrar();
		c.desplazar(z);
		c.mostrar();
		byte p=7;
		a.desplazar(p);
		a.mostrar();
		}}
