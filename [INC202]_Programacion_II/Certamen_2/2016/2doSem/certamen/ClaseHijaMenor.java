public final class ClaseHijaMenor extends ClaseHijaMayor {
	public ClaseHijaMenor() {
		super.saludar();
	}

	@Override
	public void saludar() {
		System.out.println("Saludando desde ClaseHijaMenor");
	}

	public static void main(String[] args) {
		ClaseHijaMenor cHija = new ClaseHijaMenor();
		cHija.saludar();
	}
}