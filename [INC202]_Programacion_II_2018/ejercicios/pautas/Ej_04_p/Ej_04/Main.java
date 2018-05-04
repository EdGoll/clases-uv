package Ej_04;

public class Main {
	public static void main(String[] args) {
		
		NumAleatorio numAleatorio = new NumAleatorio(10); //primeros mil nums		
		CalculoFactorial calculoFac = new CalculoFactorial();
		Calculo calculo = new Calculo();
		Integer numIt = numAleatorio.crearNumeroAleatorio();
		System.out.println("CantIt:"+numIt);		
		calculoFac.calcularSumasFactoriales(numIt);	
		System.out.println("resultado: "+calculoFac.getSumaFactorial());
		
		for(int i=0;i < numIt;i++) {
			Integer nuevoNum = numAleatorio.crearNumeroAleatorio();
			calculo.evaluarNumero(nuevoNum);
		}
		
		System.out.println("Numero de iteraciones: "+numIt);
		calculo.mostrarResultados();
		
	}
}
	