
//Yian Vera Soto, Programacion 2, evaluacion 1  

import java.util.Random;

public class Lista{

	public int[] listaA;
	public int[] listaB;
	private final int minAlum = 1;

	public void llenadoListaA(){

		Alumno totalsLista = new Alumno();
		int x=totalsLista.alumnosEnAsignatura();
		int i=0, rango=x;
		
		Random rnd = new Random();										
		int numeroRandomicoA;										
		numeroRandomicoA = (int)(rnd.nextDouble() * x + minAlum);

		int totalA = numeroRandomicoA;

		listaA = new int[totalA];

		listaA[i]=(int)(Math.random()*rango);
		for(i=1; i<totalA; i++){
    		listaA[i]=(int)(Math.random()*rango);
    		for(int j=0; j<i; j++){
        		if(listaA[i]==listaA[j]){
           			i--;
        		}
    		}
		}
	}

	public void llenadoListaB(){

		Alumno totalslistb = new Alumno();
		int y = totalslistb.alumnosEnAsignatura();//totalLista
		listaB = new int[y-listaA.length];

		int count=1;
		for (int i=0;i <= listaB.length-1;i++){

			for(int j = 0 ; j<= listaA.length-1; j++){

				if (count == listaA[j]){
					listaB[i]= i+1;

				}
				count++;
			}

			count=1;
		}	
	}

	public void mostrarListas(char tipo){
		if (tipo == 'A'){
			for (int r=0; r<=listaA.length-1;r++){
				System.out.println( listaA[r]);
			}
		}else if(tipo == 'B'){
				for (int t=0; t<=listaB.length-1;t++){
				System.out.println( listaB[t]);
				}
			}	
	}
}
