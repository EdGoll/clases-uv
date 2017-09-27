public class toMorse {  //Dos arreglos, en donde el equivalente en el alfabeto está en el mismo índice...
    private char[] alfab = {'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z','0','1','2','3','4','5','6','7','8','9'};  //tamaño 36
    private String[] mors = {".-","-...","-.-.","-..",".","..-.","--.","....","..",".---","-.-",".-..","--","-.","---",".--.","--.-",".-.","...","-","..-","...-",".--","-..-","-.--","--..","-----",".----","..---","...--","....-",".....","-....","--...","---...","----."}; //tamaño 36
    public String aMorse(String palabra){
        String resultante ="\n";    //Inicializamos con el salto de línea.
        palabra = palabra.toUpperCase();
        for(int i = 0; i < palabra.length(); i++){
            for(int j = 0; j < 36; j++){    //36 es el largo del alfabeto en alfab y mors.
                if(alfab[j]==palabra.charAt(i)){    //Si se encuentra coincidencia con alfab...
                    resultante = resultante + mors[j]+" ";  //Se busca asigna el equivalente por índice del arreglo.
                }
            }
        }
        System.out.println(resultante);
        return resultante;
    }
}
