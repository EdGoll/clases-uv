//Hector Toro 19.268.713-6

public class ToASCII {
	
	private static char[] abecedario={'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M',
			'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z','0', '1', '2',
			'3', '4', '5','6', '7', '8', '9' };
	private static String[] codigoASCII={"&#65;","&#66;","&#67;","&#68;","&#69;","&#70;","&#71;","&#72;","&#73;","&#74;",
			"&#75;","&#76;","&#77;","&#78;","&#79;","&#80;","&#81;","&#82;","&#83;","&#84;","&#85;","&#86;",
			"&#87;","&#88;","&#89;","&#90;","&#48;","&#49;","&#50;","&#51;","&#52;","&#53;","&#54;","&#55;",
			"&#56;","&#57;"};
    //metodo que codifica el archivo en codigo ASCII
	public static String toASCII(String texto){            
		String textoMay = "";
		String ascii ="";
		for (int i = 0; i < texto.length(); i++) {
			textoMay += Character.toUpperCase(texto.charAt(i));
		}
		char letras;
			for (int i = 0; i < texto.length(); i++) {
				letras = texto.charAt(i);
				letras=Character.toUpperCase(letras);
				for (int j = 0; j < abecedario.length; j++) {
					if (letras == abecedario[j]) {
						ascii+= codigoASCII[j];	
					}
				}
			}
		//System.out.println("[ASCII]El texto es "+texto +"\nY quedo asi  : "+ascii);
		return " Original:  "+textoMay+"\n ASCII:  "+ascii+"\n_________________________________";
	}
}
