import java.util.Random;

public class Lista {
	private Alumno[] alumnos;
	private int posicionUltimoAlumno;
	public final static int LIMITEINFERIOR = 40;
	public final static int LIMITESUPERIOR = 75;
	public int tamanio;
	public final String nombre;

	public Lista(String nombre, int tamanio) {
		this.setTamanio(tamanio);
		this.posicionUltimoAlumno = 0;
		this.nombre = nombre;
	}

	public void generar() {
		while(this.posicionUltimoAlumno < tamanio) {
			int idAlumno = random(1, 100);
			alumnos[this.posicionUltimoAlumno] = new Alumno(idAlumno);
			if(! alumnos[posicionUltimoAlumno].isIn(this)) {
				this.posicionUltimoAlumno++;
			} 
		}
	}

	public void mostrar() {
		System.out.println("Lista: " + this.nombre);
		for(int i = 0; i < tamanio; i++) {
			System.out.println("Alumno: " + this.alumnos[i].getId());
		}
	}

	private static int random(int min, int max) {
	   Random rand = new Random();
	   int randomNum = rand.nextInt((max - min) + 1) + min;
	   return randomNum;
	}

	public void setTamanio(int tamanio) {
		if(this.LIMITEINFERIOR < tamanio && tamanio <= this.LIMITESUPERIOR) {
			this.tamanio = tamanio;
			this.alumnos = new Alumno[this.tamanio];
		}
		this.tamanio = 0;
	}

	public int getTamanio() {
		return this.tamanio;
	}

	public int getPosicionUltimoAlumno() {
		return this.posicionUltimoAlumno;
	}

	public Alumno getAlumno(int i) {
		return this.alumnos[i];
	}

	public Alumno[] getAlumnos() {
		return this.alumnos;
	}
}