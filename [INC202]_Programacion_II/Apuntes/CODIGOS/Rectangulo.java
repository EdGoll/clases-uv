
import java.util.Scanner;
public class Rectangulo {	
 float x1, x2, y1, y2;
	
 void rectangulo()
 
{
     Scanner sc=new Scanner(System.in);
     System.out.println("Ingresa datos para x e y:");
     x1=sc.nextInt();
     x2=sc.nextInt();
     y1=sc.nextInt();
     y2=sc.nextInt();
 }

	 float area(){
     return (x2-x1)*(y2-y1);
 }
 public static void main(String[] args)
 {
	 Rectangulo p1=new Rectangulo();
	 p1.rectangulo();
     System.out.println(p1.area());

 }
}
