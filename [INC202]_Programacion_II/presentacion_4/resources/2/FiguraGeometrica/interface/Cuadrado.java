public class Cuadrado implements FiguraGeometrica {
	
	private double lado;

	public Cuadrado(double lado) {
		this.lado = lado;
	}

	@Override
	public double perimetro() {
		return (lado * 4);
	}

	@Override
	public double area() {
		return (lado * lado);
	}

	@Override
	public String toString() {
		return String.format("Perimetro = %f y Area = %f", perimetro(), area());
	}

}