package Ej_04;

public class CalculoFactorial {

	private int factorial;
	private int sumaFactorial;

	public int getSumaFactorial() {
		return sumaFactorial;
	}

	public void setSumaFactorial(int sumaFactorial) {
		this.sumaFactorial = sumaFactorial;
	}

	public void calcularSumasFactoriales(Integer numero) {
		System.out.println("num:"+numero);
		for(int i =numero; i>=0;i--) {
			//System.out.println(i);
			sumaFactorial += this.calcularFactorial(i);
		}
	}

	private int calcularFactorial(Integer numero) {
		int factorial =1;
		if(numero!=0) {
			while ( numero!=0) {
				  factorial *= numero;
				  numero--;
			}
		}
		return factorial;
	}


	
}
