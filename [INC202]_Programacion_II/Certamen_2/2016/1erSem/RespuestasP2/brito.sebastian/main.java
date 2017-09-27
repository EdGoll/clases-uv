
public class main {

	public static void main(String[] args){
		
		metodos m = new metodos();
		m.leer("alumnos.csv" );
		m.leer("asignatura1.csv" );
		m.leer("asignatura2.csv" );
		
		m.calcular();
		
		m.crear();
	    m.escribir();
	}
}
