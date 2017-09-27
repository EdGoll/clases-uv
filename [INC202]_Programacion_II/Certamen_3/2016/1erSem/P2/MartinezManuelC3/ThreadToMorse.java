import java.util.*;
public class ThreadToMorse extends Thread {
	//private RandomWord rw = null;
	private View view=null;
	private AMorse amorse = new AMorse();

	public ThreadToMorse(View view){
		this.view = view;

	}

	
	@Override
	public void run(){
		try{
			String palabraRandom = RandomWord.generate(); // se genera palabra random

			palabraRandom=RandomWord.mejorarPalabraRandom(palabraRandom); //Tiene un 20% de tener una letra Mayuscula alfinal
			if(RandomWord.aprove){

					System.out.println("Palabra: "+palabraRandom);
					palabraRandom= palabraRandom.toLowerCase(); //Se pasa a Minuscula
					//System.out.println("Palabra Random:  "+ palabraRandom);
					char[] palabraArreglo = palabraRandom.toCharArray(); 

					palabraRandom = amorse.traducirPalabra(palabraArreglo); // se guarda la traduccion en palabra
					view.ingresarPalabra(palabraRandom); //Parte Magica

					System.out.println("Ingresando Palabra");
			}

					

			

			sleep(2000);
			

		}catch(Exception ex){}
	}
}