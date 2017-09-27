public abstract class ClaseHijaMayor extends ClaseAbuelo implements ClaseMadre, ClasePadre { 
	private String titulo;
	private String mensaje;

	@Override
	public void saludar() {
		titulo = "Saludo";
		mensaje = "Saludando desde ClaseHermanoMayor";
		saludar(mensaje);
	}

	private void saludar(String mensage) {
		System.out.println(mensaje);
	}

	private void saludar(String titulo, String mensage) {
		System.out.println(titulo);
		System.out.println(mensaje);
	}
}