
public class ASCII extends RandomWord{

	
	
	public ASCII(String usarLinea) {
	    String letra;
	    String caracterAscii;
	    String transformarS = "";

	    for (int j = 0; j < usarLinea.length(); j++){
	       
	        letra = usarLinea.charAt(j) + ""; 
	        System.out.println(usarLinea.charAt(j));
	        caracterAscii = convertir(letra);

	       if (caracterAscii .equals(" ")){
	    	    transformarS= transformarS + "  /  ";
	       } 

	       else{
	       transformarS = transformarS + caracterAscii;

	       if (!caracterAscii.equals(" ")){
	                transformarS = transformarS + " ";
	       }   
	     }           
	    }
	    System.out.println(transformarS);
	    
	    
	    
	}
	
	 public String convertir (String decodificar){  
	        String ascii = decodificar;  

	        if (decodificar.equalsIgnoreCase("a"))  
	            ascii = "&#65;";  
	        if (decodificar.equalsIgnoreCase("b"))  
	        	ascii = "&#66";  
	        if (decodificar.equalsIgnoreCase("c"))  
	        	ascii = "&#67";  
	        if (decodificar.equalsIgnoreCase("d"))  
	        	ascii = "&#68";  
	        if (decodificar.equalsIgnoreCase("e"))  
	        	ascii = "&#69";  
	        if (decodificar.equalsIgnoreCase("f"))  
	        	ascii = "&#70";  
	        if (decodificar.equalsIgnoreCase("g"))  
	        	ascii = "&#71";  
	        if (decodificar.equalsIgnoreCase("h"))  
	        	ascii = "&#72";  
	        if (decodificar.equalsIgnoreCase("i"))  
	        	ascii= "&#73";  
	        if (decodificar.equalsIgnoreCase("j"))  
	        	ascii = "&#74";  
	        if (decodificar.equalsIgnoreCase("k"))  
	        	ascii = "&#75";  
	        if (decodificar.equalsIgnoreCase("l"))  
	        	ascii = "&#76";  
	        if (decodificar.equalsIgnoreCase("m"))  
	        	ascii= "&#77";  
	        if (decodificar.equalsIgnoreCase("n"))  
	        	ascii = "&#78";  
	        if (decodificar.equalsIgnoreCase("o"))  
	        	ascii = "&#79";  
	        if (decodificar.equalsIgnoreCase("p"))  
	        	ascii= "&#80";  
	        if (decodificar.equalsIgnoreCase("q"))  
	        	ascii = "&#81";  
	        if (decodificar.equalsIgnoreCase("r"))  
	        	ascii = "&#82";  
	        if (decodificar.equalsIgnoreCase("s"))  
	        	ascii = "&#83";  
	        if (decodificar.equalsIgnoreCase("t"))  
	        	ascii = "&#84";  
	        if (decodificar.equalsIgnoreCase("u"))  
	        	ascii = "&#85";  
	        if (decodificar.equalsIgnoreCase("v"))  
	        	ascii = "&#86";  
	        if (decodificar.equalsIgnoreCase("w"))  
	        	ascii = "&#87";  
	        if (decodificar.equalsIgnoreCase("x"))  
	        	ascii = "&#88";  
	        if (decodificar.equalsIgnoreCase("y"))  
	        	ascii = "&#89";  
	        if (decodificar.equalsIgnoreCase("z"))  
	        	ascii = "&#90";  
	        if (decodificar.equalsIgnoreCase("0"))  
	        	ascii = "&#48";  
	        if (decodificar.equalsIgnoreCase("1"))  
	        	ascii = "&#49";  
	        if (decodificar.equalsIgnoreCase("2"))  
	        	ascii = "&#50";  
	        if (decodificar.equalsIgnoreCase("3"))  
	        	ascii = "&#51";  
	        if (decodificar.equalsIgnoreCase("4"))  
	        	ascii = "&#52";  
	        if (decodificar.equalsIgnoreCase("5"))  
	        	ascii = "&#53";  
	        if (decodificar.equalsIgnoreCase("6"))  
	        	ascii = "&#54";  
	        if (decodificar.equalsIgnoreCase("7"))  
	        	ascii = "&#55";  
	        if (decodificar.equalsIgnoreCase("8"))  
	        	ascii = "&#56";  
	        if (decodificar.equalsIgnoreCase("9"))  
	        	ascii = "&#57";  
	        if (decodificar.equalsIgnoreCase("."))  
	        	ascii = "&#58";  
	        if (decodificar.equalsIgnoreCase(","))  
	        	ascii = "&#59";  
	        if (decodificar.equalsIgnoreCase("?"))  
	        	ascii = "&#60";  
	        System.out.println("ascii: "+ascii);
	   return ascii;  
	 }  
}	

