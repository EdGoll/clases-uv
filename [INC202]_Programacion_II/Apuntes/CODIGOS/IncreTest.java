public class IncreTest{
	public static void main (String args[]){

	int x=0;		
	int y=0;
	
	System.out.println("x e y son : "+x+" y : " +y +"respectivamente");
	x++;	
	System.out.println("x++ resulta = "+x);
	++x;
	System.out.println("++x resulta "+ x);
	System.out.println("Volvemos a x=0 ");
	x=0;
	y=x++;
	System.out.println("y=x++ ");
	System.out.println("x es : "+x);
	System.out.println("y es : "+y);
	y=++x;
	System.out.println("y=++x ");
	System.out.println("x es : "+x);	
	System.out.println("y es : "+y)	;	
	}}