import java.util.HashMap;
import java.util.Map;

public class AAscii {

    //Declaracion de variables
    private Map<Character, String> letra = new HashMap<>();
    private String palabra;

    //Se crea el constructor con parametro de entrada
    public AAscii(String palabra) {
        //Se mapea para realizar la traduccion 
        letra.put('A', "&#65 ");
        letra.put('B', "&#66 ");
        letra.put('C', "&#67 ");
        letra.put('D', "&#68 ");
        letra.put('E', "&#69 ");
        letra.put('F', "&#70 ");
        letra.put('G', "&#71 ");
        letra.put('H', "&#72 ");
        letra.put('I', "&#73 ");
        letra.put('J', "&#74 ");
        letra.put('K', "&#75 ");
        letra.put('L', "&#76 ");
        letra.put('M', "&#77 ");
        letra.put('N', "&#78 ");
        letra.put('O', "&#79 ");
        letra.put('P', "&#80 ");
        letra.put('Q', "&#81 ");
        letra.put('R', "&#82 ");
        letra.put('S', "&#83 ");
        letra.put('T', "&#84 ");
        letra.put('U', "&#85 ");
        letra.put('V', "&#86 ");
        letra.put('W', "&#87 ");
        letra.put('X', "&#88 ");
        letra.put('Y', "&#89 ");
        letra.put('Z', "&#90 ");
        letra.put('0', "&#48 ");
        letra.put('1', "&#49 ");
        letra.put('2', "&#50 ");
        letra.put('3', "&#51 ");
        letra.put('4', "&#52 ");
        letra.put('5', "&#53 ");
        letra.put('6', "&#54 ");
        letra.put('7', "&#55 ");
        letra.put('8', "&#56 ");
        letra.put('9', "&#57 ");
        this.palabra = palabra;//Se instancia la variable con el parametro de ingreso del constructor
    }

    //Metodo sincronizado para que la otra hebra no pueda hacer uso de ella 
    public synchronized String cambioAscii() {

        String palabraTraducida = "";//Se declara variable
        palabra = palabra.toUpperCase();//Se realiza cambio de la palabra en minusculas a mayusculas
        for (int i = 0; i < palabra.length(); i++) {
            String frase = letra.get(palabra.charAt(i));//Recorre la palabra caracter por caracter luego busca el caracter en el mapa 
            palabraTraducida = frase + palabraTraducida;//Va guardando los caracter mapeados 
            notifyAll();//Se notifica que ya se puede utilizar el metodo 
        }
        return palabraTraducida;//Retorna la palabra traducida
    }
}