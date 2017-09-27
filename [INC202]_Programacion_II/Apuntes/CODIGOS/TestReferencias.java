import java.awt.Point;

public class TestReferencias{
	public static void main (String args[]){
		Point pt1, pt2;
		pt1 = new Point(100,100);
		pt2=pt1;
		pt1.x=200;
		pt1.y=200;
		System.out.println("Punto 1= "+pt1.x+","+pt1.y);
		System.out.println("Punto 2= "+pt2.x+","+pt2.y);
		pt1.x=100;
		pt1.y=100;
		System.out.println("Punto 1= "+pt1.x+","+pt1.y);
		System.out.println("Punto 2= "+pt2.x+","+pt2.y);
		pt2.x=150;
		pt2.y=150;
		System.out.println("Punto 1= "+pt1.x+","+pt1.y);
		System.out.println("Punto 2= "+pt2.x+","+pt2.y);
		pt2=null;
		System.out.println("Punto 1= "+pt1.x+","+pt1.y);
		System.out.println("Punto 2= "+pt2);
	}}