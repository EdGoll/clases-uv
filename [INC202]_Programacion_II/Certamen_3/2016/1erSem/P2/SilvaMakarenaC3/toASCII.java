public class toASCII {  //Dos arreglos, en donde el equivalente en el alfabeto está en el mismo índice...
    private char[] alfab = {'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z','0','1','2','3','4','5','6','7','8','9'};  //tamaño 36
    private String[] ascii = {"&#65;","&#66;","&#67;","&#68;","&#69;","&#70;","&#71;","&#72;","&#73;","&#74;","&#75;","&#76;","&#77;","&#78;","&#79;","&#80;","&#81;","&#82;","&#83;","&#84;","&#85;","&#86;","&#87;","&#88;","&#89;","&#90;","&#48;","&#49;","&#50;","&#51;","&#52;","&#53;","&#54;","&#55;","&#56;","&#57;"};
    public String aAscii(String palabra){
        String resultante = "\n";
        palabra = palabra.toUpperCase();
        for(int i = 0; i < palabra.length(); i++){
            for(int j = 0; j < 36; j++){    //36 es el largo del alfabeto en alfab y mors.
                if(alfab[j]==palabra.charAt(i)){
                    resultante = resultante + ascii[j];
                }
            }
        }
        resultante = resultante;
        System.out.println(resultante);
        return resultante;        
    }
}
