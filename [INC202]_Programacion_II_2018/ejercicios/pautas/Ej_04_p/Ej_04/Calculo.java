package Ej_04;

public class Calculo {
	private int par;
	private int sumaPar;
	private int primo;
	private int sumaPrimo;

	public void evaluarNumero(Integer numero) {
		this.evaluarSiEsPar(numero);
		this.evaluarSiEsPrimo(numero);
	}

	private void evaluarSiEsPar(Integer numero) {
		if (numero % 2 == 0) {
			System.out.println(numero +" Es Par");
			par++;
			this.sumaPar += numero;
		}
	}

	private void evaluarSiEsPrimo(Integer numero) {
		int contador = 2;
		  boolean primo=true;
		  while ((primo) && (contador!=numero)){
		    if (numero % contador == 0) {
		      primo = false;
		    }
		    contador++;
		  }
		  if(primo) {
			  System.out.println(numero +" Es Primo");
			  this.primo++;
			  this.sumaPrimo += numero;
		  }
	}

	public void mostrarResultados() {
		System.out.println("Total de N°s Pares Generados: "+ this.par);
		System.out.println("Su suma es: "+ this.sumaPar);
		System.out.println("Total de N°s Primos Generados: "+ this.primo);
		System.out.println("Su suma es: "+ this.sumaPrimo);
	}
	
}
