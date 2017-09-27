import java.util.Scanner;

class Factorial{
	public static long fac(long n){
		if(n>1) return(fac(n-1)*n);
		else return 1;}

	public static long leer(){
		Scanner kyb=new Scanner(System.in);
		System.out.println("Ingrese un valor positivo");
		long valor = kyb.nextInt();
		return valor;}}

public class CalcularFac{	
	
	public static void main (String args []){
		System.out.println("El factorial es :" + Factorial.fac(Factorial.leer()));
	}}
	
