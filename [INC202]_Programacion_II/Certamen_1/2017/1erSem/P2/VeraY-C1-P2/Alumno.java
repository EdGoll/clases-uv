//Yian Vera Soto, Programacion 2, evaluacion 1. 

import java.util.Random;

public class Alumno{

	public int[] listaTotal; //Lista total de alumnos cursando la asignatura.
	private final int minAlumnos = 40;
	public int totalAlumnos;

	public int randAlumnos(){ 
		
		Random rnd = new Random();										//
		int numeroRandomico;											//Genera un numero randomico entre 40 y 100
		numeroRandomico = (int)(rnd.nextDouble() * 60 + minAlumnos);	// 
		return numeroRandomico;
	}

	public void llenadoListaTotal(){

		listaTotal = new int[randAlumnos()];
		
		int i=0, cantidad=listaTotal.length, rango=100;

		listaTotal[i]=(int)(Math.random()*rango);
		for(i=1; i<cantidad; i++){
    		listaTotal[i]=(int)(Math.random()*rango);
    		for(int j=0; j<i; j++){
        		if(listaTotal[i]==listaTotal[j]){
            		i--;
        		}
    		}
		}
		for(int k=0; k<cantidad; k++){
    		System.out.print((k+1)+"- ID: "+listaTotal[k]+"\n"); //Muestra por pantalla a los alumnos junto su ID
		}
	}


	public int alumnosEnAsignatura(){  //numero total de alumnos en la asignatura.

		totalAlumnos= listaTotal.length;
		return totalAlumnos;
	}

}