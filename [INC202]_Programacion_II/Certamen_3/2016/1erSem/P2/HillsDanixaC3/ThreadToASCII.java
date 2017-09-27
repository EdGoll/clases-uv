
public class ThreadToASCII extends Thread{
		 
		  private String palabraATraducir;
		  
		  public ThreadToASCII(String palabra)
		  {
		    palabraATraducir = palabra ;
		  }
		  
		  public void run()
		  {
		    String palabra = palabraATraducir.toUpperCase();
		    for (int i=0; i < palabra.length(); i++){
		      char caracter = palabra.charAt(i);
		      int caracterAscii = caracter;
		      System.out.println (caracter + "- " + "&#" + caracterAscii + ";");
		      
		    }
		  }
		  
		}