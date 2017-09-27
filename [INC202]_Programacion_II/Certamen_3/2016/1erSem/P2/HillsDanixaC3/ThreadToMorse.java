
public class ThreadToMorse extends Thread{
	private String [] letras={"A","B","C","CH","D","E","F","G","H","I","J","K","L","M","N","Ñ","O","P","Q","R","S","T","U","V","W","X","Y","Z","0","1","2","3","4","5","6","7","8","9"};
	private String [] morse={".-","-...","-.-.","---- ","-..",".","..-.","--.","....","..",".---","-.-",".-..","--","-.","--.--","---",".--.","--.-",".-.","...","-","..-","...-",".--","-..-","-.--","--..","-----",".----","..---","...--","....-",".....",".....","--...", "---..","----."};
	private String palabraATraducir;
	   
	  public ThreadToMorse(String palabra)
	  {
	       palabraATraducir = palabra ;
	  }
	  
	  public void run()
	  {
	    String palabra = palabraATraducir.toUpperCase();
	    int cont=0;
	    for (int i=0; i < palabra.length(); i++){
	      char caracter = palabra.charAt(i);
	   
	      for(int j=0;j<letras.length;j++){ 
	          if(palabra.equals(letras[j])){
	        	  String  r= morse[j];
	        	 break;
	          
	          }
	          
	          int caractermorse = caracter;
    	     
           
	        
	    }
	  }
	}
}