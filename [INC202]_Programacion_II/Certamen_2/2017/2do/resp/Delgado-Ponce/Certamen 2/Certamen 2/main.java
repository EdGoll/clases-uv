public class main {

    public static void main(String[] args)  {

    	Combate Co = new Combate();
    	NumeroAleatorio eleccion = new NumeroAleatorio();
    	
    	
        ThreadGuerrero tag = new ThreadGuerrero(Co);
        ThreadMago tam = new ThreadMago(Co);
      
        //ELECCION DEL PERSONAJE QUE COMIENZA DE FORMA ALEATORIA.
        int a = eleccion.getNumero(2);
        if(a == 1) {
        	 tam.start();
             tag.start();
        }else {
        tag.start();
        tam.start();
        
        }
	        
	    try {
	        tag.join();
	        tam.join();
	          
        }catch(InterruptedException ex) {
	        	
        }
    }
}
