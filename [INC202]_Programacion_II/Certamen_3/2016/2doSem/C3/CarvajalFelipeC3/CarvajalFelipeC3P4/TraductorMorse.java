
public class TraductorMorse {
   

    public String TransformMorseToASCII(String cad){
        String[] Palabra = cad.split("/");
        String ASCII = "";
        
        int x = 0;
        while(x < Palabra.length){
            if(Palabra[x].equals(".-")){
                System.out.println("A");
                ASCII+=("&#65");
            }
            else if(Palabra[x].equals("-...")){
                ASCII+=("&#66");
            }
            else if(Palabra[x].equals("-.-.")){
                ASCII+=("&#67");
            }
            else if(Palabra[x].equals("-..")){
                ASCII+=("&#68");
            }
            else if(Palabra[x].equals(".")){
                ASCII+=("&#69");
            }
            else if(Palabra[x].equals("..-.")){
                ASCII+=("&#70");
            }
            else if(Palabra[x].equals("--.")){
                ASCII+=("&#71");
            }
            else if(Palabra[x].equals("....")){
                ASCII+=("&#72");
            }
            else if(Palabra[x].equals("..")){
                ASCII+=("&#73");
            }
            else if(Palabra[x].equals(".---")){
                ASCII+=("&#74");
            }
            else if(Palabra[x].equals("-.-")){
                ASCII+=("&#75");
            }
            else if(Palabra[x].equals(".-..")){
                ASCII+=("&#76");
            }
            else if(Palabra[x].equals("--")){
                ASCII+=("&#77");
            }
            else if(Palabra[x].equals("-.")){
                ASCII+=("&#78");
            }
            else if(Palabra[x].equals("---")){
                ASCII+=("&#79");
            }
            else if(Palabra[x].equals(".--.")){
                ASCII+=("&#80");
            }
        //q
            else if(Palabra[x].equals("--.-")){
                ASCII+=("&#81");
            }
           
            else if(Palabra[x].equals(".-.")){
                ASCII+=("&#82");
            }
            else if(Palabra[x].equals("...")){
                ASCII+=("&#83");
            }
            else if(Palabra[x].equals("-")){
                ASCII+=("&#84");
            }
            else if(Palabra[x].equals("..-")){
                ASCII+=("&#85");
            }
            else if(Palabra[x].equals("...-")){
                ASCII+=("&#86");
            }
            else if(Palabra[x].equals(".--")){
                ASCII+=("&#87");
            }
            else if(Palabra[x].equals("-..-")){
                ASCII+=("&#88");
            }
            else if(Palabra[x].equals("-.--")){
                ASCII+=("&#89");
            }
            else if(Palabra[x].equals("--..")){
                ASCII+=("&#90");
            }
            //Numeros
            else if(Palabra[x].equals("-----")){
                ASCII+=("&#48");
            }
            else if(Palabra[x].equals(".----")){
                ASCII+=("&#49");
            }
            else if(Palabra[x].equals("..---")){
                ASCII+=("&#50");
            }
            else if(Palabra[x].equals("...--")){
                ASCII+=("&#51");
            }
            else if(Palabra[x].equals("....-")){
                ASCII+=("&#52");
            }
            else if(Palabra[x].equals(".....")){
                ASCII+=("&#53");
            }
            else if(Palabra[x].equals("-....")){
                ASCII+=("&#54");
            }
            else if(Palabra[x].equals("--...")){
                ASCII+=("&#55");
            }
            else if(Palabra[x].equals("---..")){
                ASCII+=("&#56");
            }
            else if(Palabra[x].equals("----.")){
                ASCII+=("&#57");
            }
            else if(Palabra[x].equals("")){
                ASCII+=(" ");
            }   
            x++;
        }
        System.out.println(ASCII);
        return ASCII;
    }
    
}
