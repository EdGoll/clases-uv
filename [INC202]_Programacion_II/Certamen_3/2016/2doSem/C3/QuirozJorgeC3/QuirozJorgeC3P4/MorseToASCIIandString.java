public class MorseToASCIIandString {
	private String entradausuario,salidaString,salidaASCII;

	private char[] alfabetooccidental={'A','B','C','D','E','F','G','H','I','J','K','L','M','N','O','P','Q','R','S','T','U','V','W','X','Y','Z','0','1','2','3','4','5','6','7','8','9'};
	private String[] alfabetomorse={".-","-...","-.-.","-..",".","..-.","--.","....","..",".---","-.-",".-..","--","-.","---",".--.","--.-",".-.","...","-","..-","...-",".--","-..-","-.--","--..","-----",".----","..---","...--","....-",".....","-....","--...","---..","----."};
	private String[] alfabetoASCII={"&#65","&#66","&#67","&#68","&#69","&#70","&#71","&#72","&#73","&#74","&#75","&#76","&#77","&#78","&#79","&#80","&#81","&#82","&#83","&#84","&#85","&#86","&#87","&#88","&#89","&#90","&#48","&#49","&#50","&#51","&#52","&#53","&#54","&#55","&#56","&#57"};

	public MorseToASCIIandString(String entradausuario){
		this.entradausuario=entradausuario;
	}

	public String getResultado(){
		transformacionString(entradausuario);
		transformacionASCII(entradausuario);
		return String.format("Texto ingresado: %s\nFormato: Morse\n----------\nLetra/numero: %s\nASCII: %s\n",entradausuario,salidaString,salidaASCII);
	}

	public void transformacionString(String codigomorse){
		salidaString="No se reconoce el valor";
		for(int i=0;i<alfabetomorse.length;i++){
			if(codigomorse.equals(alfabetomorse[i])){
				salidaString=String.valueOf(alfabetooccidental[i]);
			}
		}
	}

	public void transformacionASCII(String codigomorse){
		salidaASCII="No se reconoce el valor";
		for(int i=0;i<alfabetomorse.length;i++){
			if(codigomorse.equals(alfabetomorse[i])){
				salidaASCII=alfabetoASCII[i];
			}
			
		}
	}
}