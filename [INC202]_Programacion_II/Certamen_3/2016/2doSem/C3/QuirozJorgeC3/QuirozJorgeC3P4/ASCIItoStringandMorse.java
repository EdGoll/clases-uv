public class ASCIItoStringandMorse{
	private String entradausuario, salidaString, salidaMorse;

	private char[] alfabetooccidental={'A','B','C','D','E','F','G','H','I','J','K','L','M','N','O','P','Q','R','S','T','U','V','W','X','Y','Z','0','1','2','3','4','5','6','7','8','9'};
	private String[] alfabetomorse={".-","-...","-.-.","-..",".","..-.","--.","....","..",".---","-.-",".-..","--","-.","---",".--.","--.-",".-.","...","-","..-","...-",".--","-..-","-.--","--..","-----",".----","..---","...--","....-",".....","-....","--...","---..","----."};
	private String[] alfabetoASCII={"&#65","&#66","&#67","&#68","&#69","&#70","&#71","&#72","&#73","&#74","&#75","&#76","&#77","&#78","&#79","&#80","&#81","&#82","&#83","&#84","&#85","&#86","&#87","&#88","&#89","&#90","&#48","&#49","&#50","&#51","&#52","&#53","&#54","&#55","&#56","&#57"};


	public ASCIItoStringandMorse(String entradausuario){
		this.entradausuario=entradausuario;
	}

	public String getResultado(){
		transformacionString(entradausuario);
		transformacionMorse(entradausuario);
		return String.format("Texto ingresado: %s\nFormato: ASCII\n----------\nLetra/numero: %s\nMorse: %s\n",entradausuario,salidaString,salidaMorse);
	}

	public void transformacionString(String codigoASCII){
		salidaString="No se reconoce el valor";
		for(int i=0;i<alfabetomorse.length;i++){
			if(codigoASCII.equals(alfabetoASCII[i])){
				salidaString=String.valueOf(alfabetooccidental[i]);
			}
		}
	}

	public void transformacionMorse(String codigoASCII){
		salidaMorse="No se reconoce el valor";
		for(int i=0;i<alfabetomorse.length;i++){
			if(codigoASCII.equals(alfabetoASCII[i])){
				salidaMorse=alfabetomorse[i];
			}
		}
	}

}