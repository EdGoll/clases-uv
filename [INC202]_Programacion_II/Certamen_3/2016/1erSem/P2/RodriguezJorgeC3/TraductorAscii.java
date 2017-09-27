

import java.util.HashMap;



public class TraductorAscii {
private HashMap<Character, String> translations;
	
	public TraductorAscii() {
		//Inicializamos el conjunto vacio
		translations = new HashMap<Character, String>();
		//Añadimos todos los caracteres disponibles y sus cadenas correspondientes en morse
		translations.put('A', "65");
		translations.put('B', "66");
		translations.put('C', "67");
		translations.put('D', "68");
		translations.put('E', "69");
		translations.put('F', "70");
		translations.put('G', "71");
		translations.put('H', "72");
		translations.put('I', "73");
		translations.put('J', "74");
		translations.put('K', "75");
		translations.put('L', "76");
		translations.put('M', "77");
		translations.put('N', "78");
		
		translations.put('O', "79");
		translations.put('P', "80");
		translations.put('Q', "81");
		translations.put('R', "82");
		translations.put('S', "83");
		translations.put('T', "84");
		translations.put('U', "85");
		translations.put('V', "86");
		translations.put('W', "87");
		translations.put('X', "88");
		translations.put('Y', "89");
		translations.put('Z', "90");
		translations.put('1', "49");
		translations.put('2', "50");
		translations.put('3', "51");
		translations.put('4', "52");
		translations.put('5', "53");
		translations.put('6', "54");
		translations.put('7', "55");
		translations.put('8', "56");
		translations.put('9', "57");
		translations.put('0', "48");
		
	}

     
	
	public String translateWord(String word) {
		//String auxiliar para almacenar la traduccion de la palabra
		String aux = "";
		//Bucle de recorrido de la palabra
		for (int i = 0; i<word.length(); i++) {
			//Obtenemos el valor en morse del caracter i
			String code = translations.get(word.charAt(i));
			//Si el resultado no es nulo se añade a nuestra solucion
			if (code!=null)
				aux += code;
			else {
				System.err.println("El parametro a traducir no es una palabra o el caracter '" + word.charAt(i) + "' no existe en el alfabeto.");
				return null;
			}
		}
		
		return aux;
	}
	
	
	
}
    

