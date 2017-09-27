public class Notas{

	int nota1;
	int nota2;
	int nota3;
	float promedio;

	void promedio(){
		promedio = (nota1+nota2+nota3)/3;		
		System.out.println("El promedio es "+ promedio);
	
	}
	public static void main (String args[]){
		Notas a = new Notas();
		a.nota1 = 5;
		a.nota2= 4;
		a.nota3= 2;		
		System.out.println("llamando a promedio");
		a.promedio();
	}	
}