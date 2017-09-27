public class Conversiones {

	private static String[] alfASCII = {"&#65;","&#66;","&#67;","&#68;","&#69;","&#70;","&#71;","&#72;","&#73;","&#74;","&#75;","&#76;","&#77;","&#78;","&#79;","&#80;","&#81;","&#82;","&#83;","&#84;","&#85;","&#86;","&#87;","&#88;","&#89;","&#90;","&#48;","&#49;","&#50;","&#51;","&#52;","&#53;","&#54;","&#55;","&#56;","&#57;"};
	private static char[] alfabeto = {'A','B','C','D','E','F','G','H','I','J','K','L','M','N','O','P','Q','R','S','T','U','V','W','X','Y','Z','0','1','2','3','4','5','6','7','8','9'};
	private static String[] alfMorse = {".-","-...","-.-.","-..",".","..-.","--.","....","..",".---","-.-",".-..","--","-.","---",".--.","--.-",".-.","...","-","..-","...-",".--","-..-","-.--","--..","-----",".----","..---","...--","....-",".....","-...","--...","---..","----."};
	
	
	public static String ConvertToMorse(String palabra){
		palabra = palabra.toUpperCase();
		String traducido = "";
		for(int j=0;j<palabra.length();j++){
			char letra = palabra.charAt(j);
			for(int i=0; i<alfMorse.length;i++){
				if(letra == alfabeto[i]){
					traducido += alfMorse[i];
					if(j!= palabra.length()-1){
						traducido += " ";
					}
					break;
				}
			}
		}
		return traducido;
	}
	
	public static String ConvertToASCII(String palabra){
		palabra = palabra.toUpperCase();
		String traducido = "";
		for(int j=0;j<palabra.length();j++){
			char letra = palabra.charAt(j);
			for(int i=0; i<alfASCII.length;i++){
				if(letra == alfabeto[i]){
					traducido += alfASCII[i];
					break;
				}
			}
		}
		return traducido;
	}
	

}
