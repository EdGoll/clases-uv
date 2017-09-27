import java.util.Random;

public class MetodoPrincipal{
	public static void main (String[] args){
		Lista alumnos = new Lista("Alumnos", 45);
		alumnos.generar();
		Lista A, B;

		alumnos.mostrar();

		 
	}

	private static int random(int min, int max) {
	   Random rand = new Random();
	   int randomNum = rand.nextInt((max - min) + 1) + min;
	   return randomNum;
	}
}