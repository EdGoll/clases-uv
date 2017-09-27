public class Amorse {
	
	
		char[] alfabeto={'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M',
			'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z', '1', '2',
			'3', '4', '5','6', '7', '8', '9', '0'};
	
		String morseCode[] = {".-","-...","-.-.","-..",".","..-.","--.","....","..",".---",
		"-.-",".-..","--","-.","---",".--.","--.-",".-.","...","-","..-","...-",".--","-..-",
		"-.--","--..", ".----","..---","...--","....-",".....","-....","--...","---..","----.",
		"-----"};
	public String traductorAmorse(String word){
			char a;
			String translateAM="";
			for(int i= 0; i<word.length() ;i++){
				a= word.charAt(i);
				a=Character.toUpperCase(a);
				for (int j = 0; j < alfabeto.length; j++) {
					if (a==alfabeto[j]){
						translateAM+=morseCode[j];
					}
				}			
			}
			return translateAM;
		}
	}