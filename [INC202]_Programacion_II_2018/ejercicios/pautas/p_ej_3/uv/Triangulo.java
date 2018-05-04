package uv;

public class Triangulo extends Figura{
	

	@Override
	public double calcularArea() {
		return (3*valor*valor)/4;
	}

	@Override
	public double calcularPerimetro() {
		return 3*valor;
	}

}
