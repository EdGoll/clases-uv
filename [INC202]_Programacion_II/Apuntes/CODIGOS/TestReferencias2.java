public class TestReferencias2{
	int x;
	int y;
	String z;
	
	public static void main (String args[]){
		TestReferencias2 pt1,pt2;
		pt1 =new TestReferencias2();
		pt1.x=50;
		pt1.y=50;
		pt1.z="60";
		pt2=pt1;
		System.out.println("Punto 1= "+pt1.x+","+pt1.y+","+pt1.z);
		System.out.println("Punto 2= "+pt2.x+","+pt2.y+","+pt2.z);
		pt1.x=100;
		pt1.y=100;
		System.out.println("Punto 1= "+pt1.x+","+pt1.y);
		System.out.println("Punto 2= "+pt2.x+","+pt2.y);
		pt2.x=350;
		pt2.y=150;
		System.out.println("Punto 1= "+pt1.x+","+pt1.y);
		System.out.println("Punto 2= "+pt2.x+","+pt2.y);
		pt2=null;
		System.out.println("Punto 1= "+pt1.x+","+pt1.y);
		System.out.println("Punto 2= "+pt2);
	}}