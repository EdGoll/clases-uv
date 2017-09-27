public abstract class FiguraGeometrica {
	
	private double perimetro;
	private double area;

	public abstract void perimetro();

	public abstract void area();

	public double getPerimetro() {
		return perimetro;
	}

	public void setPerimetro(double perimetro) {
		this.perimetro = perimetro;
	}

	public double getArea() {
		return area;
	}

	public void setArea(double area) {
		this.area = area;
	}

	@Override
	public String toString(){
		return String.format("Perimetro = %f y Area = %f", perimetro, area);
	} 
}