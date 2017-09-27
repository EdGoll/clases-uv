
public class Traduccion {

    protected String palabra = RandomWord.generate();
    
    public Traduccion (String palabra){
        this.palabra=palabra;
    }
    
    public synchronized void TMorse() {
        String caracter = palabra+" =/";
        try{
   
       //	palabra.Write("Traducciom Morse: " + t.ascii(random.generate().toUpperCase()));
        	
            for(int i = 0; i < palabra.length(); i++){
                System.out.println(palabra.charAt(i));
                if(palabra.charAt(i) == 'A'){
                    caracter = caracter+".-/";
                }else if(palabra.charAt(i) == 'B'){
                    caracter = caracter+"-.../";
                }else if(palabra.charAt(i) == 'C'){
                    caracter = caracter+"-.-./";
                }else if(palabra.charAt(i) == 'D'){
                    caracter = caracter+"-../";
                }else if(palabra.charAt(i) == 'E'){
                    caracter = caracter+"./";
                }else if(palabra.charAt(i) == 'F'){
                    caracter = caracter+"..-./";
                }else if(palabra.charAt(i) == 'G'){
                    caracter = caracter+"- -./";
                }else if(palabra.charAt(i) == 'H'){
                    caracter = caracter+"..../";
                }else if(palabra.charAt(i) == 'I'){
                    caracter = caracter+"../";
                }else if(palabra.charAt(i) == 'J'){
                    caracter = caracter+".- - -/";
                }else if(palabra.charAt(i) == 'K'){
                    caracter = caracter+"-.-/";
                }else if(palabra.charAt(i) == 'L'){
                    caracter = caracter+".-../";
                }else if(palabra.charAt(i) == 'M'){
                    caracter = caracter+"- -/";
                }else if(palabra.charAt(i) == 'N'){
                    caracter = caracter+"-./";
                }else if(palabra.charAt(i) == 'O'){
                    caracter = caracter+"- - -/";
                }else if(palabra.charAt(i) == 'P'){
                    caracter = caracter+".- -./";
                }else if(palabra.charAt(i) == 'Q'){
                    caracter = caracter+"- -.-/";
                }else if(palabra.charAt(i) == 'R'){
                    caracter = caracter+".-./";
                }else if(palabra.charAt(i) == 'S'){
                    caracter = caracter+".../";
                }else if(palabra.charAt(i) == 'T'){
                    caracter = caracter+"-/";
                }else if(palabra.charAt(i) == 'U'){
                    caracter = caracter+"..-/";
                }else if(palabra.charAt(i) == 'V'){
                    caracter = caracter+"...-/";
                }else if(palabra.charAt(i) == 'W'){
                    caracter = caracter+".- -/";
                }else if(palabra.charAt(i) == 'X'){
                    caracter = caracter+"-..-/";
                }else if(palabra.charAt(i) == 'Y'){
                    caracter = caracter+"-.- -/";
                }else if(palabra.charAt(i) == 'Z'){
                    caracter = caracter+"- -../";
                }else if(palabra.charAt(i) == '0'){
                    caracter = caracter+"- - - - -/";
                }else if(palabra.charAt(i) == '1'){
                    caracter = caracter+".- - - -/";
                }else if(palabra.charAt(i) == '2'){
                    caracter = caracter+"..- - -/";
                }else if(palabra.charAt(i) == '3'){
                    caracter = caracter+"...- -/";
                }else if(palabra.charAt(i) == '4'){
                    caracter = caracter+"....-/";
                }else if(palabra.charAt(i) == '5'){
                    caracter = caracter+"...../";
                }else if(palabra.charAt(i) == '6'){
                    caracter = caracter+"-..../";
                }else if(palabra.charAt(i) == '7'){
                    caracter = caracter+"- -.../";
                }else if(palabra.charAt(i) == '8'){
                    caracter = caracter+"- - -../";
                }else if(palabra.charAt(i) == '9'){
                    caracter = caracter+"- - - -./";
                }
            }
        }catch (Exception ex){
            System.out.println(ex);
        }
        System.out.println(caracter);
    }
    
    public synchronized void TASCII() {
        String caracter = palabra+" =/";
        try{
            for(int i = 0; i < palabra.length(); i++){
                System.out.println(palabra.charAt(i));
                if(palabra.charAt(i) == '0'){
                    caracter = caracter+"&#48/";
                }else if(palabra.charAt(i) == '1'){
                    caracter = caracter+"&#49/";
                }else if(palabra.charAt(i) == '2'){
                    caracter = caracter+"&#50/";
                }else if(palabra.charAt(i) == '3'){
                    caracter = caracter+"&#51/";
                }else if(palabra.charAt(i) == '4'){
                    caracter = caracter+"&#52/";
                }else if(palabra.charAt(i) == '5'){
                    caracter = caracter+"&#53/";
                }else if(palabra.charAt(i) == '6'){
                    caracter = caracter+"&#54/";
                }else if(palabra.charAt(i) == '7'){
                    caracter = caracter+"&#55/";
                }else if(palabra.charAt(i) == '8'){
                    caracter = caracter+"&#56/";
                }else if(palabra.charAt(i) == '9'){
                    caracter = caracter+"&#57/";
                }else if(palabra.charAt(i) == 'A'){
                    caracter = caracter+"&#65/";
                }else if(palabra.charAt(i) == 'B'){
                    caracter = caracter+"&#66/";
                }else if(palabra.charAt(i) == 'C'){
                    caracter = caracter+"&#67/";
                }else if(palabra.charAt(i) == 'D'){
                    caracter = caracter+"&#68/";
                }else if(palabra.charAt(i) == 'E'){
                    caracter = caracter+"&#69/";
                }else if(palabra.charAt(i) == 'F'){
                    caracter = caracter+"&#70/";
                }else if(palabra.charAt(i) == 'G'){
                    caracter = caracter+"&#71/";
                }else if(palabra.charAt(i) == 'H'){
                    caracter = caracter+"&#72/";
                }else if(palabra.charAt(i) == 'I'){
                    caracter = caracter+"&#73/";
                }else if(palabra.charAt(i) == 'J'){
                    caracter = caracter+"&#74/";
                }else if(palabra.charAt(i) == 'K'){
                    caracter = caracter+"&#75/";
                }else if(palabra.charAt(i) == 'L'){
                    caracter = caracter+"&#76/";
                }else if(palabra.charAt(i) == 'M'){
                    caracter = caracter+"&#77/";
                }else if(palabra.charAt(i) == 'N'){
                    caracter = caracter+"&#78/";
                }else if(palabra.charAt(i) == 'O'){
                    caracter = caracter+"&#79/";
                }else if(palabra.charAt(i) == 'P'){
                    caracter = caracter+"&#80/";
                }else if(palabra.charAt(i) == 'Q'){
                    caracter = caracter+"&#81/";
                }else if(palabra.charAt(i) == 'R'){
                    caracter = caracter+"&#82/";
                }else if(palabra.charAt(i) == 'S'){
                    caracter = caracter+"&#83/";
                }else if(palabra.charAt(i) == 'T'){
                    caracter = caracter+"&#84/";
                }else if(palabra.charAt(i) == 'U'){
                    caracter = caracter+"&#85/";
                }else if(palabra.charAt(i) == 'V'){
                    caracter = caracter+"&#86/";
                }else if(palabra.charAt(i) == 'W'){
                    caracter = caracter+"&#87/";
                }else if(palabra.charAt(i) == 'X'){
                    caracter = caracter+"&#88/";
                }else if(palabra.charAt(i) == 'Y'){
                    caracter = caracter+"&#89/";
                }else if(palabra.charAt(i) == 'Z'){
                    caracter = caracter+"&#90/";
                }
            }
            notifyAll();
        }catch (Exception ex){
            System.out.println(ex);
        }
        System.out.println(caracter);
    }
}
