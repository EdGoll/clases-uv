
import java.util.ArrayList;


public class TMorse {

    
    public String Decod(String a){
        String [ ] texto = a.split("\\ ");
        ArrayList<String> decod= new ArrayList<>();
        for(int i=0;i<=texto.length-1;i++){
            if (texto[i].equals(".-")){
                decod.add("A");
            }else 
                if (texto[i].equals("-...")){
                decod.add("B");
            }else 
                    if (texto[i].equals("-.-.")){
                decod.add("C");
            }else 
                        if(texto[i].equals("-..")){
                decod.add("D");
            }else 
                if(texto[i].equals(".")){
                decod.add("E");
            }else
                if(texto[i].equals("..-.")){
                decod.add("F");
            }else 
                    if(texto[i].equals("--.")){
                decod.add("G");
            }else 
                        if(texto[i].equals("....")){
                decod.add("H");
            }else 
                            if(texto[i].equals("..")){
                decod.add("I");
            }else 
                  if(texto[i].equals(".---")){
                decod.add("J");
            }
            else
                if(texto[i].equals("-.-")){
                decod.add("K");
            }
            else
                if(texto[i].equals(".-..")){
                decod.add("L");
            }
            else
                if(texto[i].equals("--")){
                decod.add("M");
            }
            else 
                if(texto[i].equals("-.")){
                decod.add("N");
            }
            else
                if(texto[i].equals("---")){
                decod.add("O");
            }
            else
                if(texto[i].equals(".--.")){
                decod.add("P");
            }
            else
                if(texto[i].equals("--.-")){
                decod.add("Q");
            }
            else
                if(texto[i].equals(".-.")){
                decod.add("R");
            }
            else
                if(texto[i].equals("...")){
                decod.add("S");
            }
            else
                if(texto[i].equals("-")){
                decod.add("T");
            }
            else
                if(texto[i].equals("..-")){
                decod.add("U");
            }
            else
                if(texto[i].equals("...-")){
                decod.add("V");
            }
            else
                if(texto[i].equals(".--")){
                decod.add("W");
            }
            else
                if(texto[i].equals("-..-")){
                decod.add("X");
            }
            else
                if(texto[i].equals("-.--")){
                decod.add("Y");
            }
            else
                if(texto[i].equals("--..")){
                decod.add("Z");
            }
            else
                if(texto[i].equals(".----")){
                decod.add("1");
            }
            else
                if(texto[i].equals("..---")){
                decod.add("2");
            }
            else
                if(texto[i].equals("...--")){
                decod.add("3");
            }
            else
                if (texto[i].equals("....-")){
                decod.add("4");
            }
            else
                if(texto[i].equals(".....")){
                decod.add("5");
            }
            else 
                if(texto[i].equals("-....")){
                decod.add("6");
            }
            else 
                if(texto[i].equals("--...")){
                decod.add("7");
            }
            else 
                if(texto[i].equals("---..")){
                decod.add("8");
            }
            else 
                if(texto[i].equals("----.")){
                decod.add("9");
            }
            else 
                if(texto[i].equals("-----")){
                decod.add("0");
            }
        }
        return decod.toString(); 
    }
}
