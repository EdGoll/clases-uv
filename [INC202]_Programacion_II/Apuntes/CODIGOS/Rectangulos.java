import java.awt.Point;
public class Rectangulos{	
	int x1=0;
	int x2=0;
	int y1=0;
	int y2=0;
	Rectangulos consRect(int x1,int y1,int x2,int y2){
		this.x1=x1;
		this.y1=y1;
		this.x2=x2;
		this.y2=y2;
		return this;}
	Rectangulos consRect(Point p1, Point p2){
		x1=p1.x;
		y1=p1.y;
		x2=p2.x;
		y2=p2.y;
		return this;}	
	Rectangulos consRect(Point p1, int a, int l){
		x1=p1.x;
		y1=p1.y;
		x2=(x1+a);
		y2=(y1+l);
		return this;}	
	void printRect(){
		System.out.print(" Valores " + x1 + ", "+y1 + ", "+x2 + ", "+y2);
		System.out.println(" ");}
	public static void main (String args []){
		Rectangulos rect = new Rectangulos();
		System.out.print("Llamar a constRect con las coordenadas : 25,25,50,50:");
		rect.consRect(25,25,50,50);
		rect.printRect();
		System.out.print("Llamar a constRect con los puntos (10,10) y (20,20):");
		rect.consRect(new Point(10,10),new Point(20,20));
		rect.printRect();
		System.out.print("Llamar a constRect con los puntos (10,10) y los valores 50,50 :");
		rect.consRect(new Point(10,10),50,50);
		rect.printRect();}}