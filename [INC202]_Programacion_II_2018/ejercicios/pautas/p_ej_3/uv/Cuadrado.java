package uv;

public class Cuadrado extends Figura {
	
	@Override
	public double calcularArea() {
		return valor*valor;
	}

	@Override
	public double calcularPerimetro() {
		return 4*valor;
	}

}
