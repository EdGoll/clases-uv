public class AnioBisiesto {

	private int anioActual = 2016;
	
	public boolean isBisiesto(int anio) {
		boolean band = false;
		if (anio % 4 == 0) {
			if (anio % 100 == 0) {
				if (anio % 400 == 0) {
					band = true;
				} else {
					band = false;
				}
			} else {
				band = true;
			}
		} else {
			band = false;
		}
		return band;
	}
	
	public void mostrar() {
		int count = 0;
		while(count < 20) {
			if(isBisiesto(anioActual)) {
				System.out.println(anioActual);
				count++;
			}
			anioActual--;
		}
	}
	
	public static void main(String[] args) {
		AnioBisiesto ab = new AnioBisiesto();
		ab.mostrar();
	}
}