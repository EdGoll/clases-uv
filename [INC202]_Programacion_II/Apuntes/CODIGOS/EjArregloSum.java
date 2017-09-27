//import java.lang.Math;
public class EjArregloSum{

	public static int sumar (int[] tab)
	{
		int sum = 0,r;
		for (int i = 0; i < tab.length; i++)
		{
			r= (int) (Math.random()*100);
			tab[i]=r;
			System.out.println ("el valor numero:" +i+"es"+r);
			sum += tab[i];
		}
		return sum;
		}

public static void main (String args[]){
	int tab[]=new int [10];
	System.out.println ("la suma es : " + sumar(tab));
}}