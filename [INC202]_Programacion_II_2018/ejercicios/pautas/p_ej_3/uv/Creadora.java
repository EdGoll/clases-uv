package uv;

public class Creadora {

	public static void main(String [] args) {
		Figura circulo = new Circulo();
		Figura cuadrado = new Cuadrado();
		Figura triangulo = new Triangulo();
		
		circulo.valor=3;
		cuadrado.valor=4;
		triangulo.valor=5;
		
		System.out.println(circulo.calcularArea());
		System.out.println(circulo.calcularPerimetro());
		System.out.println(cuadrado.calcularArea());
		System.out.println(cuadrado.calcularPerimetro());
		
	}
	
}
