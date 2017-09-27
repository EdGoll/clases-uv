

public class toASCII {
	
	
		public toASCII(String userString) 
		{
				String currentChar;
			    String getASCIIchar;
			    String convertedString = "";

			    for (int i = 0; i < userString.length(); i++)
			    {
			        currentChar = userString.charAt(i) + ""; 
			        getASCIIchar = convert(currentChar);
			        if (getASCIIchar.equals(" "))
			        {
			            convertedString = convertedString + "  /  ";
			        } 
			        else 
			        {
			            convertedString = convertedString + getASCIIchar;
			            if (!getASCIIchar.equals(" ")) 
			            {
			                convertedString = convertedString + " ";
			            }   
			        }           
			    }
		
			    Main.gui.escribir(convertedString+"\n"); //esto me agrega al text area el string decodificado
			   // Main.gui.t1.getGraphics();
			}
			 private static String convert (String toEncode)  
			    {  
			        String ascii = toEncode;  

			        if (toEncode.equalsIgnoreCase("a"))  
			            ascii = "&#65";  
			        if (toEncode.equalsIgnoreCase("b"))  
			            ascii = "&#66";  
			        if (toEncode.equalsIgnoreCase("c"))  
			            ascii = "&#67";  
			        if (toEncode.equalsIgnoreCase("d"))  
			            ascii = "&#68";  
			        if (toEncode.equalsIgnoreCase("e"))  
			            ascii = "&#69";  
			        if (toEncode.equalsIgnoreCase("f"))  
			            ascii = "&#70";  
			        if (toEncode.equalsIgnoreCase("g"))  
			            ascii = "&#71";  
			        if (toEncode.equalsIgnoreCase("h"))  
			            ascii = "&#72";  
			        if (toEncode.equalsIgnoreCase("i"))  
			            ascii = "&#73";  
			        if (toEncode.equalsIgnoreCase("j"))  
			            ascii = "&#74";  
			        if (toEncode.equalsIgnoreCase("k"))  
			            ascii = "&#75";  
			        if (toEncode.equalsIgnoreCase("l"))  
			            ascii = "&#76";  
			        if (toEncode.equalsIgnoreCase("m"))  
			            ascii = "&#77";  
			        if (toEncode.equalsIgnoreCase("n"))  
			            ascii = "&#78";  
			        if (toEncode.equalsIgnoreCase("o"))  
			            ascii = "&#79";  
			        if (toEncode.equalsIgnoreCase("p"))  
			            ascii = "&#80";  
			        if (toEncode.equalsIgnoreCase("q"))  
			            ascii = "&#81";  
			        if (toEncode.equalsIgnoreCase("r"))  
			            ascii = "&#82";  
			        if (toEncode.equalsIgnoreCase("s"))  
			            ascii = "&#83";  
			        if (toEncode.equalsIgnoreCase("t"))  
			            ascii = "&#84";  
			        if (toEncode.equalsIgnoreCase("u"))  
			            ascii = "&#85";  
			        if (toEncode.equalsIgnoreCase("v"))  
			            ascii = "&#86";  
			        if (toEncode.equalsIgnoreCase("w"))  
			            ascii = "&#87";  
			        if (toEncode.equalsIgnoreCase("x"))  
			            ascii = "&#88";  
			        if (toEncode.equalsIgnoreCase("y"))  
			            ascii = "&#89";  
			        if (toEncode.equalsIgnoreCase("z"))  
			            ascii = "&#90";  
			        if (toEncode.equalsIgnoreCase("0"))  
			            ascii = "&#48";  
			        if (toEncode.equalsIgnoreCase("1"))  
			            ascii = "&#49";  
			        if (toEncode.equalsIgnoreCase("2"))  
			            ascii = "&#50";  
			        if (toEncode.equalsIgnoreCase("3"))  
			            ascii = "&#51";  
			        if (toEncode.equalsIgnoreCase("4"))  
			            ascii = "&#52";  
			        if (toEncode.equalsIgnoreCase("5"))  
			            ascii = "&#53";  
			        if (toEncode.equalsIgnoreCase("6"))  
			            ascii = "&#54";  
			        if (toEncode.equalsIgnoreCase("7"))  
			            ascii = "&#55";  
			        if (toEncode.equalsIgnoreCase("8"))  
			            ascii = "&#56";  
			        if (toEncode.equalsIgnoreCase("9"))  
			            ascii = "&#57";  
			    
			        return ascii;  
			    }  
		

	}

