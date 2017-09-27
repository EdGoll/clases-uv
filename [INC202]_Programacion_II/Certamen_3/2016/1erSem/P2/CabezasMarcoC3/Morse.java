public class Morse extends RandomWord{

	
	
	public Morse(String usarLinea) {
	    String letra;
	    String caracterMorse;
	    String transformarS = "";

	    for (int j = 0; j < usarLinea.length(); j++){
	       
	        letra = usarLinea.charAt(j) + ""; 
	        System.out.println(usarLinea.charAt(j));
	        caracterMorse = convertir(letra);

	       if (caracterMorse.equals(" ")){
	    	    transformarS= transformarS + "  /  ";
	       } 

	       else{
	       transformarS = transformarS + caracterMorse;

	       if (!caracterMorse.equals(" ")){
	                transformarS = transformarS + " ";
	       }   
	     }           
	    }
	    System.out.println(transformarS);
	    
	    
	    
	}
	
	 public String convertir (String decodificar){  
	        String morse = decodificar;  

	        if (decodificar.equalsIgnoreCase("a"))  
	            morse = ".-";  
	        if (decodificar.equalsIgnoreCase("b"))  
	            morse = "-...";  
	        if (decodificar.equalsIgnoreCase("c"))  
	            morse = "-.-.";  
	        if (decodificar.equalsIgnoreCase("d"))  
	            morse = "-..";  
	        if (decodificar.equalsIgnoreCase("e"))  
	            morse = ".";  
	        if (decodificar.equalsIgnoreCase("f"))  
	            morse = "..-.";  
	        if (decodificar.equalsIgnoreCase("g"))  
	            morse = "--.";  
	        if (decodificar.equalsIgnoreCase("h"))  
	            morse = "....";  
	        if (decodificar.equalsIgnoreCase("i"))  
	            morse = "..";  
	        if (decodificar.equalsIgnoreCase("j"))  
	            morse = ".---";  
	        if (decodificar.equalsIgnoreCase("k"))  
	            morse = "-.-";  
	        if (decodificar.equalsIgnoreCase("l"))  
	            morse = ".-..";  
	        if (decodificar.equalsIgnoreCase("m"))  
	            morse = "--";  
	        if (decodificar.equalsIgnoreCase("n"))  
	            morse = "-.";  
	        if (decodificar.equalsIgnoreCase("o"))  
	            morse = "---";  
	        if (decodificar.equalsIgnoreCase("p"))  
	            morse = ".--.";  
	        if (decodificar.equalsIgnoreCase("q"))  
	            morse = "--.-";  
	        if (decodificar.equalsIgnoreCase("r"))  
	            morse = ".-.";  
	        if (decodificar.equalsIgnoreCase("s"))  
	            morse = "...";  
	        if (decodificar.equalsIgnoreCase("t"))  
	            morse = "-";  
	        if (decodificar.equalsIgnoreCase("u"))  
	            morse = "..-";  
	        if (decodificar.equalsIgnoreCase("v"))  
	            morse = "...-";  
	        if (decodificar.equalsIgnoreCase("w"))  
	            morse = ".--";  
	        if (decodificar.equalsIgnoreCase("x"))  
	            morse = "-..-";  
	        if (decodificar.equalsIgnoreCase("y"))  
	            morse = "-.--";  
	        if (decodificar.equalsIgnoreCase("z"))  
	            morse = "--..";  
	        if (decodificar.equalsIgnoreCase("0"))  
	            morse = "-----";  
	        if (decodificar.equalsIgnoreCase("1"))  
	            morse = ".----";  
	        if (decodificar.equalsIgnoreCase("2"))  
	            morse = "..---";  
	        if (decodificar.equalsIgnoreCase("3"))  
	            morse = "...--";  
	        if (decodificar.equalsIgnoreCase("4"))  
	            morse = "....-";  
	        if (decodificar.equalsIgnoreCase("5"))  
	            morse = ".....";  
	        if (decodificar.equalsIgnoreCase("6"))  
	            morse = "-....";  
	        if (decodificar.equalsIgnoreCase("7"))  
	            morse = "--...";  
	        if (decodificar.equalsIgnoreCase("8"))  
	            morse = "---..";  
	        if (decodificar.equalsIgnoreCase("9"))  
	            morse = "----.";  
	        if (decodificar.equalsIgnoreCase("."))  
	            morse = ".-.-";  
	        if (decodificar.equalsIgnoreCase(","))  
	            morse = "--..--";  
	        if (decodificar.equalsIgnoreCase("?"))  
	            morse = "..--..";  
	        System.out.println("morse: "+morse);
	   return morse;  
	 }  
}	

