public class Aascii {
	RandomWord rn= new RandomWord();
	
	char[] alfabeto={'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M',
			'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z', '1', '2',
			'3', '4', '5','6', '7', '8', '9', '0'};

	String[] asciiCode={"&#65;","&#66;","&#67;","&#68;","&#69;","&#70;","&#71;","&#72;","&#73;","&#74;",
			"&#75;","&#76;","&#77;","&#78;","&#79;","&#80;","&#81;","&#82;","&#83;","&#84;","&#85;","&#86;",
			"&#87;","&#88;","&#89;","&#90;","&#49;","&#50;","&#51;","&#52;","&#53;","&#54;","&#55;",
			"&#56;","&#57;","&#48;"};
	
	
	public String mtrad(String word){
		
		
		char a;
		String translate="";
		for(int i= 0; i<word.length() ;i++){
			a= word.charAt(i);
			a=Character.toUpperCase(a);
			for (int j = 0; j < alfabeto.length; j++) {
				if (a==alfabeto[j]){
					translate+=asciiCode[j];
				}
			}				
		}
		return translate;
	}
}
