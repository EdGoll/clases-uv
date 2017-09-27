public class Cuadrado extends FiguraGeometrica {
	
	private double lado;

	public Cuadrado(double lado) {
		this.lado = lado;
	}

	@Override
	public void perimetro() {
		setPerimetro(lado * 4); 
	}

	@Override
	public void area() {
		setArea(lado * lado);
	}
}