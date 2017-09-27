

public class ToMorse {
	
    private static String[] codigoMorse = { ".-", "-...", "-.-.", "-..", ".", "..-.", "--.",
            "....", "..", ".---", "-.-", ".-..", "--", "-.","---", ".--.",
            "--.-", ".-.", "...", "-", "..-", "...-", ".--", "-..-",
            "-.--", "--..", ".----", "..---", "...--", "....-", ".....",
            "-....", "--...", "---..", "----.", "-----" };
    private static char[] abecedario = { 'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J',
            'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V',
            'W', 'X', 'Y', 'Z', '1', '2', '3', '4', '5', '6', '7', '8',
            '9', '0' };
    //metodo que codifica en codigo morse
	public static String toMorse(String texto){            
		String textoMay = "";
		String morse ="";
		for (int i = 0; i < texto.length(); i++) {
			textoMay += Character.toUpperCase(texto.charAt(i));
		}
		char letras;
			for (int i = 0; i < textoMay.length(); i++) {
				letras = textoMay.charAt(i);
				//letras=Character.toUpperCase(letras);
				for (int j = 0; j < abecedario.length; j++) {
					if (letras == abecedario[j]) {
						morse+= codigoMorse[j]+" ";	
					}
				}
			}
		return "\n Morse:  "+morse+"\n";
	}
	
	
}

