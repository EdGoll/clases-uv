public class Comparar{
	
	int a;
	int b ;
	float areat;
	
	void compararEnteros(){
		System.out.println("a es = "+a + "  b es = " +b);
		if (a>b){
			System.out.println("a es mayor que b");}
		else{
			if (a<b) {
				System.out.println("a es menor que b");}
			else {
				System.out.println("a es igual a b");
				}	
		}}
		public static void main (String args[]){
		Comparar z = new Comparar();
		z.a = 5;
		z.b=46;
		System.out.println("llamando al metodo comparar");
		z.compararEnteros();
		}	
	}