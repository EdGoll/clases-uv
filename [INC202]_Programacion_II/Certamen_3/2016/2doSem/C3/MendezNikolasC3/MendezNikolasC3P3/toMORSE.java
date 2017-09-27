

import java.util.StringTokenizer;

public class toMORSE {
	
	public static String toMorse(String userString) 
	{
		String word;
	    String convertedString = "";
	    StringTokenizer st = new StringTokenizer(userString," ");
	    while(st.hasMoreTokens()){
	    	word=st.nextToken();
	    if(!word.equals("/")){
	    convertedString+=convert(word);
	    }else
	    	{
	    	 convertedString+=" ";
	    	}
	    }
		     
		  return convertedString;//string decodificado
		   
		}
	private static String convert (String toDecode)  
    {  
        String text = toDecode;  

        if (toDecode.equalsIgnoreCase(".-"))  
        	text = "A";  
        if (toDecode.equalsIgnoreCase("-..."))  
        	text = "B";  
        if (toDecode.equalsIgnoreCase("-.-."))  
        	text = "C";  
        if (toDecode.equalsIgnoreCase("-.."))  
        	text = "D";  
        if (toDecode.equalsIgnoreCase("."))  
        	text = "E";  
        if (toDecode.equalsIgnoreCase("..-."))  
        	text = "F";  
        if (toDecode.equalsIgnoreCase("--."))  
        	text = "G";  
        if (toDecode.equalsIgnoreCase("...."))  
        	text = "H";  
        if (toDecode.equalsIgnoreCase(".."))  
        	text = "I";  
        if (toDecode.equalsIgnoreCase(".---"))  
        	text = "J";  
        if (toDecode.equalsIgnoreCase("-.-"))  
        	text = "K";  
        if (toDecode.equalsIgnoreCase(".-.."))  
        	text = "L";  
        if (toDecode.equalsIgnoreCase("--"))  
        	text = "M";  
        if (toDecode.equalsIgnoreCase("-."))  
        	text = "N";  
        if (toDecode.equalsIgnoreCase("---"))  
        	text = "O";  
        if (toDecode.equalsIgnoreCase(".--."))  
        	text = "P";  
        if (toDecode.equalsIgnoreCase("--.-"))  
        	text = "Q";  
        if (toDecode.equalsIgnoreCase(".-."))  
        	text = "R";  
        if (toDecode.equalsIgnoreCase("..."))  
        	text = "S";  
        if (toDecode.equalsIgnoreCase("-"))  
        	text = "T";  
        if (toDecode.equalsIgnoreCase("..-"))  
        	text = "U";  
        if (toDecode.equalsIgnoreCase("...-"))  
        	text = "V";  
        if (toDecode.equalsIgnoreCase(".--"))  
        	text = "W";  
        if (toDecode.equalsIgnoreCase("-..-"))  
        	text = "X";  
        if (toDecode.equalsIgnoreCase("-.--"))  
        	text = "Y";  
        if (toDecode.equalsIgnoreCase("--.."))  
        	text = "Z";  
        if (toDecode.equalsIgnoreCase("-----"))  
        	text = "0";  
        if (toDecode.equalsIgnoreCase(".----"))  
        	text = "1";  
        if (toDecode.equalsIgnoreCase("..---"))  
        	text = "2";  
        if (toDecode.equalsIgnoreCase("...--"))  
        	text = "3";  
        if (toDecode.equalsIgnoreCase("....-"))  
        	text = "4";  
        if (toDecode.equalsIgnoreCase("....."))  
        	text = "5";  
        if (toDecode.equalsIgnoreCase("-...."))  
        	text = "6";  
        if (toDecode.equalsIgnoreCase("--..."))  
        	text = "7";  
        if (toDecode.equalsIgnoreCase("---.."))  
        	text = "8";  
        if (toDecode.equalsIgnoreCase("----."))  
        	text = "9";  
		        
		        return text;  
		    }  
	}
