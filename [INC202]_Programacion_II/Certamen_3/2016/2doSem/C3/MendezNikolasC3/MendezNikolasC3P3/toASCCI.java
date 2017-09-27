

	public class toASCCI {
				
		public static String toAscci(String userString) 
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
			   
			    return convertedString; //string decodificado
			   
			}
			 public static String convert (String toEncode)  
			    {  
			        String ascii = toEncode;  

			        if (toEncode.equalsIgnoreCase("A"))  
			            ascii = "&#65";  
			        if (toEncode.equalsIgnoreCase("B"))  
			            ascii = "&#66";  
			        if (toEncode.equalsIgnoreCase("C"))  
			            ascii = "&#67";  
			        if (toEncode.equalsIgnoreCase("D"))  
			            ascii = "&#68";  
			        if (toEncode.equalsIgnoreCase("E"))  
			            ascii = "&#69";  
			        if (toEncode.equalsIgnoreCase("F"))  
			            ascii = "&#70";  
			        if (toEncode.equalsIgnoreCase("G"))  
			            ascii = "&#71";  
			        if (toEncode.equalsIgnoreCase("H"))  
			            ascii = "&#72";  
			        if (toEncode.equalsIgnoreCase("I"))  
			            ascii = "&#73";  
			        if (toEncode.equalsIgnoreCase("J"))  
			            ascii = "&#74";  
			        if (toEncode.equalsIgnoreCase("K"))  
			            ascii = "&#75";  
			        if (toEncode.equalsIgnoreCase("L"))  
			            ascii = "&#76";  
			        if (toEncode.equalsIgnoreCase("M"))  
			            ascii = "&#77";  
			        if (toEncode.equalsIgnoreCase("N"))  
			            ascii = "&#78";  
			        if (toEncode.equalsIgnoreCase("O"))  
			            ascii = "&#79";  
			        if (toEncode.equalsIgnoreCase("P"))  
			            ascii = "&#80";  
			        if (toEncode.equalsIgnoreCase("Q"))  
			            ascii = "&#81";  
			        if (toEncode.equalsIgnoreCase("R"))  
			            ascii = "&#82";  
			        if (toEncode.equalsIgnoreCase("S"))  
			            ascii = "&#83";  
			        if (toEncode.equalsIgnoreCase("T"))  
			            ascii = "&#84";  
			        if (toEncode.equalsIgnoreCase("U"))  
			            ascii = "&#85";  
			        if (toEncode.equalsIgnoreCase("V"))  
			            ascii = "&#86";  
			        if (toEncode.equalsIgnoreCase("W"))  
			            ascii = "&#87";  
			        if (toEncode.equalsIgnoreCase("X"))  
			            ascii = "&#88";  
			        if (toEncode.equalsIgnoreCase("Y"))  
			            ascii = "&#89";  
			        if (toEncode.equalsIgnoreCase("Z"))  
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
