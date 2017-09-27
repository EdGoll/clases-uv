import java.util.Scanner;

class Factorial{

	public static long fac(long n){
		long res;
		System.out.println("Entra a fac : n = "+ n);
		if(n<=1) 
			res=1;
		else
		res=fac(n-1)*n;
		System.out.println("Sale de a fac : resultado = "+ res);
		return res;}

	public static long leer(){
		Scanner kyb=new Scanner(System.in);
		System.out.println("Ingrese un valor positivo");
		long valor = kyb.nextInt();
		return valor;}}

public class CalcularFac2{	
	
	public static void main (String args []){
		System.out.println("El factorial es :" + Factorial.fac(Factorial.leer()));
	}}
	
