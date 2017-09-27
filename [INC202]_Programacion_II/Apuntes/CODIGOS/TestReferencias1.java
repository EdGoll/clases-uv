public class TestReferencias1{
	
	public static void main (String args[]){
		String str1, str2;
		int a=9,b=0;
		str1="mi string test";
		str2=str1;
		b=a;
		System.out.println("Cadena 1= "+str1);
		System.out.println("Cadena 2= "+str2);
		System.out.println("Valor a= "+a);
		System.out.println("Valor b= "+b);
		a=250;
		str1="cambio punto 1 para test ";
		System.out.println("Cadena 1= "+str1);
		System.out.println("Cadena 2= "+str2);
		System.out.println("Valor a= "+a);
		System.out.println("Valor b= "+b);
		b=150;
		str2="otro punto";//str2=new String();
		System.out.println("Cadena 1= "+str1);
		System.out.println("Cadena 2= "+str2);
		System.out.println("Valor a= "+a);
		System.out.println("Valor b= "+b);}}


