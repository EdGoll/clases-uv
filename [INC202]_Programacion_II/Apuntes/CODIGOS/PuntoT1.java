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
	
