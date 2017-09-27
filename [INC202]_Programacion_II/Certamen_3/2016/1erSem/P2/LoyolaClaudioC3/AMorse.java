import java.util.ArrayList;
public class AMorse{
    private String Palabra;
    protected String[ ][ ] codigoMorse = new String[43][2];
    public AMorse(){
        this.Palabra = Palabra;
        codigoMorse[0][0] = "A";
        codigoMorse[0][1] = ".-";
        codigoMorse[1][0] = "B";
        codigoMorse[1][1] = "-...";
        codigoMorse[2][0] = "C";
        codigoMorse[2][1] = "-.-.";
        codigoMorse[3][0] = "CH";
        codigoMorse[3][1] = "----";
        codigoMorse[4][0] = "D";
        codigoMorse[4][1] = "-..";
        codigoMorse[5][0] = "E";
        codigoMorse[5][1] = ".";
        codigoMorse[6][0] = "F";
        codigoMorse[6][1] = "..-.";
        codigoMorse[7][0] = "G";
        codigoMorse[7][1] = "--.";
        codigoMorse[8][0] = "H";
        codigoMorse[8][1] = "....";
        codigoMorse[9][0] = "I";
        codigoMorse[9][1] = "..";
        codigoMorse[10][0] = "J";
        codigoMorse[10][1] = ".---";
        codigoMorse[11][0] = "K";
        codigoMorse[11][1] = "-.-";
        codigoMorse[12][0] = "L";
        codigoMorse[12][1] = ".-..";
        codigoMorse[13][0] = "M";
        codigoMorse[13][1] = "--";
        codigoMorse[14][0] = "N";
        codigoMorse[14][1] = "-.";
        codigoMorse[15][0] = "Ñ";
        codigoMorse[15][1] = "--.--";
        codigoMorse[16][0] = "O";
        codigoMorse[16][1] = "---";
        codigoMorse[17][0] = "P";
        codigoMorse[17][1] = ".--.";
        codigoMorse[18][0] = "Q";
        codigoMorse[18][1] = "--.-";
        codigoMorse[19][0] = "R";
        codigoMorse[19][1] = ".-.";
        codigoMorse[20][0] = "S";
        codigoMorse[20][1] = "...";
        codigoMorse[21][0] = "T";
        codigoMorse[21][1] = "-";
        codigoMorse[22][0] = "U";
        codigoMorse[22][1] = "..-";
        codigoMorse[23][0] = "V";
        codigoMorse[23][1] = "...-";
        codigoMorse[24][0] = "W";
        codigoMorse[24][1] = ".--";
        codigoMorse[25][0] = "X";
        codigoMorse[25][1] = "-..-";
        codigoMorse[26][0] = "Y";
        codigoMorse[26][1] = "-.--";
        codigoMorse[27][0] = "Z";
        codigoMorse[27][1] = "--..";
        codigoMorse[28][0] = "0";
        codigoMorse[28][1] = "-----";
        codigoMorse[29][0] = "1";
        codigoMorse[29][1] = ".----";
        codigoMorse[30][0] = "2";
        codigoMorse[30][1] = "..---";
        codigoMorse[31][0] = "3";
        codigoMorse[31][1] = "...--";
        codigoMorse[32][0] = "4";
        codigoMorse[32][1] = "....-";
        codigoMorse[33][0] = "5";
        codigoMorse[33][1] = ".....";
        codigoMorse[34][0] = "6";
        codigoMorse[34][1] = "-....";
        codigoMorse[35][0] = "7";
        codigoMorse[35][1] = "--...";
        codigoMorse[36][0] = "8";
        codigoMorse[36][1] = "---..";
        codigoMorse[37][0] = "9";
        codigoMorse[37][1] = "----.";       
    }
    public String Transformacion(String Palabra){
        this.Palabra = Palabra;
        String palabraTraducida = "";
        String letra = "";
        boolean bool = false;
        
        int i = 0;
        int j = 0;
        while(i < Palabra.length()){
            bool = false;
            letra += Palabra.charAt(i);
            j = 0;
            while(j < 38 && bool == false){
                if(letra.equalsIgnoreCase(codigoMorse[j][0])){
                    palabraTraducida += codigoMorse[j][1] + " ";
                    letra = "";
                    bool = true;
                }      
                j++;
            }
            i++;
        }      
        return palabraTraducida;
    }
}
