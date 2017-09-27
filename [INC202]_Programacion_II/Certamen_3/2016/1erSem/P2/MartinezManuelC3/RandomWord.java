import java.util.*;

public class RandomWord { //vamos a forzar a que las palabras tengan letras mayusculas y numeros!
	static boolean aprove = false;
	static String[] mayusculas = new String[]{
        "A","B","C","D","E","F","D","H","I",
        "J","K","L","M","N","O","P","Q","R",
        "S","T","U","V","W","Y","Z"};

  public static synchronized String generate(){
  	View view = new View();
    String randomStrings;
    Random random = new Random();
    char[] word = new char[random.nextInt(8)+3];
    int casos;
    
  
    

    for(int j=0;j< word.length;j++){
    	casos = (int)((Math.random()*3)+1); //Casos
    	
    	if(casos==1) {
    		word[j]=(char)('1'+(Math.random()*7)+1); //33% de que salga numero

    	} else {
    		word[j]=(char)('a'+random.nextInt(25)); //67% de que salga minuscula
    	}
      
    }

    return new String(word);
  }

  public static String mejorarPalabraRandom(String palabraRandom){

        palabraRandom+="Q";//truquito
        
        if((int)(Math.random()*2)==1){ //50% de que posea una mayuscula
            palabraRandom += mayusculas[(int)((Math.random()*25)+1)]; //Mayuscula Aleatoria
            aprove = true;

        }
        return palabraRandom;
    }



}