public class StringToASCIIandMorse{
	private String entradausuario,salidaASCII,salidaMorse, match1, match2;

	private char[] alfabetooccidental={'A','B','C','D','E','F','G','H','I','J','K','L','M','N','O','P','Q','R','S','T','U','V','W','X','Y','Z','0','1','2','3','4','5','6','7','8','9'};
	//private char[] alfabetominusculas={'a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p','q','r','s','t','u','v','w','x','y','z','0','1','2','3','4','5','6','7','8','9'};
	private String[] alfabetomorse={".-","-...","-.-.","-..",".","..-.","--.","....","..",".---","-.-",".-..","--","-.","---",".--.","--.-",".-.","...","-","..-","...-",".--","-..-","-.--","--..","-----",".----","..---","...--","....-",".....","-....","--...","---..","----."};
	private String[] alfabetoASCII={"&#65","&#66","&#67","&#68","&#69","&#70","&#71","&#72","&#73","&#74","&#75","&#76","&#77","&#78","&#79","&#80","&#81","&#82","&#83","&#84","&#85","&#86","&#87","&#88","&#89","&#90","&#48","&#49","&#50","&#51","&#52","&#53","&#54","&#55","&#56","&#57"};

	public StringToASCIIandMorse(String entradausuario){
		this.entradausuario=entradausuario;
	}

	public String getResultado(){
		salidaMorse="";
		salidaASCII="";
		if (entradausuario.length()>1){
		for (int i=0;i<entradausuario.length();i++){
			salidaMorse=salidaMorse.concat(transformacionMorse(String.valueOf(entradausuario.charAt(i)))+"   ");
			salidaASCII=salidaASCII.concat(transformacionASCII(String.valueOf(entradausuario.charAt(i)))+"   ");
		}
		}
		else{
			salidaMorse=transformacionMorse(entradausuario);
			salidaASCII=transformacionASCII(entradausuario);
		}
		

		return String.format("Texto ingresado: %s\nFormato: Letra o Numero\n----------\nASCII: %s\nMorse: %s",entradausuario,salidaASCII,salidaMorse);
	}

	public String transformacionMorse(String stringuser){
		salidaMorse="No se reconoce el valor";
		for(int i=0;i<alfabetomorse.length;i++){
			if(stringuser.equals(String.valueOf(alfabetooccidental[i]))){
				match1=alfabetomorse[i];
			}
			//if(stringuser.equals(String.valueOf(alfabetominusculas[i]))){
			//	salidaMorse=alfabetomorse[i];
			//}
		}
		return match1;
	}

	public String transformacionASCII(String stringuser){
		salidaASCII="No se reconoce el valor";
		for(int i=0;i<alfabetomorse.length;i++){
			//if(stringuser.equals(String.valueOf(alfabetominusculas[i]))){
			//	salidaASCII="Intente con mayuscula";
			//}
			if(stringuser.equals(String.valueOf(alfabetooccidental[i]))){
				match2=alfabetoASCII[i];
			}
		}
		return match2;
	}

}