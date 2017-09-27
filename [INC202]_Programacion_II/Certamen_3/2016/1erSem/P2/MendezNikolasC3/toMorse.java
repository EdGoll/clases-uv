

public class toMorse {
	public toMorse(String userString) 
	{
			String currentChar;
		    String getMorseChar;
		    String convertedString = "";

		    for (int i = 0; i < userString.length(); i++)
		    {
		        currentChar = userString.charAt(i) + ""; 
		        getMorseChar = convert(currentChar);
		        if (getMorseChar.equals(" "))
		        {
		            convertedString = convertedString + "  /  ";
		        } 
		        else 
		        {
		            convertedString = convertedString + getMorseChar;
		            if (!getMorseChar.equals(" ")) 
		            {
		                convertedString = convertedString + " ";
		            }   
		        }           
		    }
	
		    Main.gui.escribir(convertedString+"\n");//append(convertedString+"\n");//esto me agrega al text area el string decodificado
		   // Main.gui.t1.getGraphics();
		}
		 private static String convert (String toEncode)  
		    {  
		        String morse = toEncode;  

		        if (toEncode.equalsIgnoreCase("a"))  
		            morse = ".-";  
		        if (toEncode.equalsIgnoreCase("b"))  
		            morse = "-...";  
		        if (toEncode.equalsIgnoreCase("c"))  
		            morse = "-.-.";  
		        if (toEncode.equalsIgnoreCase("d"))  
		            morse = "-..";  
		        if (toEncode.equalsIgnoreCase("e"))  
		            morse = ".";  
		        if (toEncode.equalsIgnoreCase("f"))  
		            morse = "..-.";  
		        if (toEncode.equalsIgnoreCase("g"))  
		            morse = "--.";  
		        if (toEncode.equalsIgnoreCase("h"))  
		            morse = "....";  
		        if (toEncode.equalsIgnoreCase("i"))  
		            morse = "..";  
		        if (toEncode.equalsIgnoreCase("j"))  
		            morse = ".---";  
		        if (toEncode.equalsIgnoreCase("k"))  
		            morse = "-.-";  
		        if (toEncode.equalsIgnoreCase("l"))  
		            morse = ".-..";  
		        if (toEncode.equalsIgnoreCase("m"))  
		            morse = "--";  
		        if (toEncode.equalsIgnoreCase("n"))  
		            morse = "-.";  
		        if (toEncode.equalsIgnoreCase("o"))  
		            morse = "---";  
		        if (toEncode.equalsIgnoreCase("p"))  
		            morse = ".--.";  
		        if (toEncode.equalsIgnoreCase("q"))  
		            morse = "--.-";  
		        if (toEncode.equalsIgnoreCase("r"))  
		            morse = ".-.";  
		        if (toEncode.equalsIgnoreCase("s"))  
		            morse = "...";  
		        if (toEncode.equalsIgnoreCase("t"))  
		            morse = "-";  
		        if (toEncode.equalsIgnoreCase("u"))  
		            morse = "..-";  
		        if (toEncode.equalsIgnoreCase("v"))  
		            morse = "...-";  
		        if (toEncode.equalsIgnoreCase("w"))  
		            morse = ".--";  
		        if (toEncode.equalsIgnoreCase("x"))  
		            morse = "-..-";  
		        if (toEncode.equalsIgnoreCase("y"))  
		            morse = "-.--";  
		        if (toEncode.equalsIgnoreCase("z"))  
		            morse = "--..";  
		        if (toEncode.equalsIgnoreCase("0"))  
		            morse = "-----";  
		        if (toEncode.equalsIgnoreCase("1"))  
		            morse = ".----";  
		        if (toEncode.equalsIgnoreCase("2"))  
		            morse = "..---";  
		        if (toEncode.equalsIgnoreCase("3"))  
		            morse = "...--";  
		        if (toEncode.equalsIgnoreCase("4"))  
		            morse = "....-";  
		        if (toEncode.equalsIgnoreCase("5"))  
		            morse = ".....";  
		        if (toEncode.equalsIgnoreCase("6"))  
		            morse = "-....";  
		        if (toEncode.equalsIgnoreCase("7"))  
		            morse = "--...";  
		        if (toEncode.equalsIgnoreCase("8"))  
		            morse = "---..";  
		        if (toEncode.equalsIgnoreCase("9"))  
		            morse = "----.";  
		        if (toEncode.equalsIgnoreCase("."))  
		            morse = ".-.-";  
		        if (toEncode.equalsIgnoreCase(","))  
		            morse = "--..--";  
		        if (toEncode.equalsIgnoreCase("?"))  
		            morse = "..--..";
		        return morse;  
		    }  
	}


