public class AMorse {
	String translate2="";
		
			String[] alfabeto = {
				"A", "B", "C", "D", "E", "F", "G", "H", "I", "J", "K", "L", "M",
				"N", "O", "P", "Q", "R", "S", "T", "U", "V", "W", "X", "Y", "Z", " ", "1", "2",
				"3", "4", "5", "6", "7", "8", "9", "0"};

				String codigoMorse[] = {
					".-","-...",
					"-.-.","-..",
					".","..-.",
					"--.","....",
					"..",".---",
					"-.-",".-..",
					"--","-.",
					"---",".--.",
					"--.-",".-.",
					"...","-",
					"..-","...-",
					".--","-..-",
					"-.--","--..",
					".----","..---",
					"...--","....-",
					".....","-....",
					"--...","---..",
					"----.","-----",
					".-.-.-"};
				
				
		public  String  traducirAMorse(String palabra){
			translate2 = "";
	   		String pal;
	   		for(int j=0; j<palabra.length();j++){
	   				pal= String.valueOf(palabra.charAt(j));
	   				pal= pal.toUpperCase();
					for(int i=0; i<codigoMorse.length ;i++){
						if(pal.equals(alfabeto[i])){
							translate2+=codigoMorse[i]+" ";
						}
					}
				
				}
			return translate2;
		}
				
		

}
