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

public class Rectangulos1{	
	int x1=0;
	int x2=0;
	int y1=0;
	int y2=0;
	Rectangulos1 consRect(int x1,int y1,int x2,int y2){
		this.x1=x1;
		this.y1=y1;
		this.x2=x2;
		this.y2=y2;
		return this;}
	Rectangulos1 consRect(PuntoT p1, PuntoT p2){
		x1=p1.x;
		y1=p1.y;
		x2=p2.x;
		y2=p2.y;
		return this;}	
	Rectangulos1 consRect(PuntoT p3, int a, int l){
		x1=p3.x;
		y1=p3.y;
		x2=(x1+a);
		y2=(y1+l);
		return this;}	
	void printRect(){
		System.out.print(" Valores " + x1 + ", "+y1 + ", "+x2 + ", "+y2);
		System.out.println(" ");}
	
	public static void main (String args []){
		Rectangulos1 rect = new Rectangulos1();
		System.out.print("Llamar a constRect con las coordenadas : 25,25,50,50:");
		rect.consRect(25,25,50,50);
		rect.printRect();
		System.out.print("Llamar a constRect con los puntos (10,10) y (20):");
		rect.consRect(new PuntoT(10,10),new PuntoT(20));
		rect.printRect();
		System.out.print("Llamar a constRect con los puntos (0,0) y los valores 50,50 :");
		rect.consRect(new PuntoT(),50,50);
		rect.printRect();
		PuntoT a=new PuntoT(3,5);
		PuntoT b=new PuntoT();
		PuntoT c=new PuntoT(4);
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
	
