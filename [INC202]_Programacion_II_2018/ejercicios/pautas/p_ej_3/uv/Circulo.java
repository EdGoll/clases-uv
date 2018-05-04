package uv;

public class Circulo extends Figura {
	
	public double radio;
	public double pi=3.14167;

	@Override
	public double calcularArea() {
		return pi * valor*valor;
	}

	@Override
	public double calcularPerimetro() {
		return 2*pi*valor;
	}

}
