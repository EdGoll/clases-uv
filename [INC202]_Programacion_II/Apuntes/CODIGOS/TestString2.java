public class TestString2{
	String str;
	
	void metodosString(){
		
		System.out.println("La cadena es "+ str);
		System.out.println("El largo de la cadena es: "+ str.length());
		System.out.println("El caracter en la posicion 5 es: "+ str.charAt(5));		
		System.out.println("La sub cadena entre 4 y 7 es: "+ str.substring(4,7));
		System.out.println("El indice de b es: "+ str.indexOf('b'));		
		System.out.println("El indice del inicio de la cadena clase es "+
						   str.indexOf("clase"));		
		System.out.println("La cadena en mayuscula : "+ str.toUpperCase());	
	}
	
	public static void main (String args[]){
		TestString2 mio = new TestString2();
		mio.str="Prueba clase String";
		mio.metodosString();
			}}