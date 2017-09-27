public class ThreadToASCII extends Thread {
	private Aascii ascii = new Aascii();
	private View view = new View();

	public ThreadToASCII(View view){
		this.view = view;

	}

		@Override
		public void run(){
			String palabraRandom = RandomWord.generate(); // se genera palabra random

			palabraRandom=RandomWord.mejorarPalabraRandom(palabraRandom); //Le agrega Mayuscula a la palabra
			

			if(RandomWord.aprove){
					System.out.println("VALIDO: "+palabraRandom);
					palabraRandom= palabraRandom.toLowerCase(); //Se pasa a minuscula
					char[] palabraArreglo = palabraRandom.toCharArray(); 

					palabraRandom = ascii.traducirPalabra(palabraArreglo); // se guarda la traduccion en palabra
					view.ingresarPalabra(palabraRandom); //Parte Magica

					System.out.println("Ingresando Palabra");

			}

					



			try{sleep(2000);}catch(Exception ex){}
			



	}
	
}
