


/**
 *
 * @author JOJE
 */
//extends Thread

public class Procesos extends Thread {
    public Procesos(String aux){
        super(aux);
    }
    
   
    public void run(){
        System.out.println("a");
    }
    
    
    
}

//codigo para sacar codigo ascii facilmente
/*
for (int x=0;x<sCadena.length();x++)
  System.out.println(sCadena.charAt(x) + " = " + sCadena.codePointAt(x));*/

/*
public class ThreadToMorse implements Runnable {
	
		
	public ThreadToMorse(String nombre){
		
	}

	@Override
	public void run() {
		
		public static String convierte (String letra)  
    {  
        String morse = palabra2;  

        if (letra.equalsIgnoreCase("a"))  
            morse = ".-";  
        if (letra.equalsIgnoreCase("b"))  
            morse = "-...";  
        if (letra.equalsIgnoreCase("c"))  
            morse = "-.-.";  
        if (letra.equalsIgnoreCase("d"))  
            morse = "-..";  
        if (letra.equalsIgnoreCase("e"))  
            morse = ".";  
        if (letra.equalsIgnoreCase("f"))  
            morse = "..-.";  
        if (letra.equalsIgnoreCase("g"))  
            morse = "--.";  
        if (letra.equalsIgnoreCase("h"))  
            morse = "....";  
        if (letra.equalsIgnoreCase("i"))  
            morse = "..";  
        if (letra.equalsIgnoreCase("j"))  
            morse = ".---";  
        if (letra.equalsIgnoreCase("k"))  
            morse = "-.-";  
        if (letra.equalsIgnoreCase("l"))  
            morse = ".-..";  
        if (letra.equalsIgnoreCase("m"))  
            morse = "--";  
        if (letra.equalsIgnoreCase("n"))  
            morse = "-.";  
        if (letra.equalsIgnoreCase("o"))  
            morse = "---";  
        if (letra.equalsIgnoreCase("p"))  
            morse = ".--.";  
        if (letra.equalsIgnoreCase("q"))  
            morse = "--.-";  
        if (letra.equalsIgnoreCase("r"))  
            morse = ".-.";  
        if (letra.equalsIgnoreCase("s"))  
            morse = "...";  
        if (letra.equalsIgnoreCase("t"))  
            morse = "-";  
        if (letra.equalsIgnoreCase("u"))  
            morse = "..-";  
        if (letra.equalsIgnoreCase("v"))  
            morse = "...-";  
        if (letra.equalsIgnoreCase("w"))  
            morse = ".--";  
        if (letra.equalsIgnoreCase("x"))  
            morse = "-..-";  
        if (letra.equalsIgnoreCase("y"))  
            morse = "-.--";  
        if (letra.equalsIgnoreCase("z"))  
            morse = "--..";  
        if (letra.equalsIgnoreCase("0"))  
            morse = "-----";  
        if (letra.equalsIgnoreCase("1"))  
            morse = ".----";  
        if (letra.equalsIgnoreCase("2"))  
            morse = "..---";  
        if (letra.equalsIgnoreCase("3"))  
            morse = "...--";  
        if (letra.equalsIgnoreCase("4"))  
            morse = "....-";  
        if (letra.equalsIgnoreCase("5"))  
            morse = ".....";  
        if (letra.equalsIgnoreCase("6"))  
            morse = "-....";  
        if (letra.equalsIgnoreCase("7"))  
            morse = "--...";  
        if (letra.equalsIgnoreCase("8"))  
            morse = "---..";  
        if (letra.equalsIgnoreCase("9"))	
		
	}
}
*/
