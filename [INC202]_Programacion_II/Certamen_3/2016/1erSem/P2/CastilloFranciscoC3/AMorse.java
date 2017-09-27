import java.util.HashMap;
import java.util.Map;

public class AMorse {

    //Se declaran las variables 
    private Map<Character, String> letra = new HashMap<>();
    private String palabra;

    //Se crea el constructor con parametro de entrada
    public AMorse(String palabra) {
        //Se mapea para realizar la traduccion
        letra.put('A', ".- ");
        letra.put('B', "-... ");
        letra.put('C', "-.-. ");
        letra.put('D', "-.. ");
        letra.put('E', ". ");
        letra.put('F', "..-. ");
        letra.put('G', "--. ");
        letra.put('H', ".... ");
        letra.put('I', ".. ");
        letra.put('J', ".--- ");
        letra.put('K', "-.- ");
        letra.put('L', ".-.. ");
        letra.put('M', "-- ");
        letra.put('N', "-. ");
        letra.put('O', "--- ");
        letra.put('P', ".--. ");
        letra.put('Q', "--.- ");
        letra.put('R', ".-. ");
        letra.put('S', "... ");
        letra.put('T', "- ");
        letra.put('U', "..- ");
        letra.put('V', "...- ");
        letra.put('W', ".-- ");
        letra.put('X', "-..- ");
        letra.put('Y', "-.-- ");
        letra.put('Z', "--.. ");
        letra.put('1', ".---- ");
        letra.put('2', "..--- ");
        letra.put('3', "...-- ");
        letra.put('4', "....- ");
        letra.put('5', "..... ");
        letra.put('6', "-.... ");
        letra.put('7', "--... ");
        letra.put('8', "---.. ");
        letra.put('9', "----. ");
        letra.put('0', "----- ");
        this.palabra = palabra;//Se instancia la variable con el parametro de ingreso del constructor
    }

    //Metodo sincronizado para que la otra hebra no pueda hacer uso de ella
    public synchronized String cambioMorse() {

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