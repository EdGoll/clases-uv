public class Principal {
	
	public static void main(String[] args) {
		FiguraGeometrica fg = new Cuadrado(2f);
		fg.perimetro();
		fg.area();
		System.out.println(fg);
	}
}