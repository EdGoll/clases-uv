
import java.io.IOException;



public class ThreadToASCII extends Thread {
               View vista2;
               String suma;
               
               int j = 0;
               public ThreadToASCII(View vista){
                   this.vista2 = vista;
               }
               private int i;
      public String metodo(){
         String RanWord = RandomWord.generate();
               String test = RanWord.toUpperCase();
               char[] palabra = test.toCharArray();
      while(j<=palabra.length-1){
        if(palabra[j] == 'A'){
            suma+="&#65;";
        }else if(palabra[j] =='B'){
          suma+="&#66;";
        }else if(palabra[j] == 'C'){
          suma+="&#67;";
        }else if(palabra[j] == 'D'){
          suma+="&#68;";
        }else if(palabra[j] == 'E'){
          suma+="&#69;";
        }else if(palabra[j] == 'F'){
          suma+="&#70;";
        }else if(palabra[j] == 'G'){
          suma+="&#71";
        }else if(palabra[j] == 'H'){
          suma+="&#72;";
        }else if(palabra[j] == 'I'){
          suma+="&#73;";
        }else if(palabra[j] == 'J'){
          suma+="&#74;";
        }else if(palabra[j] == 'K'){
          suma+="&#75;";
        }else if(palabra[j] == 'L'){
          suma+="&#76;";
        }else if(palabra[j] == 'M'){
          suma+="&#77;";
        }else if(palabra[j] == 'N'){
          suma+="&#78;";
        }else if(palabra[j] == 'O'){
          suma+="&#79;";
        }else if(palabra[j] == 'P'){
          suma+="&#80;";
        }else if(palabra[j] == 'Q'){
          suma+="81";
        }else if(palabra[j] == 'R'){
         suma+="&#82;";
        }else if(palabra[j] == 'S'){
          suma+="&#83;";
        }else if(palabra[j] == 'T'){
          suma+="&#84;";
        }else if(palabra[j] == 'U'){
          suma+="&#85;";
        }else if(palabra[j] == 'V'){
          suma+="&#86;";
        }else if(palabra[j] == 'W'){
          suma+="&#87;";
        }else if(palabra[j] == 'X'){
          suma+="&#88;";
        }else if(palabra[j] == 'Y'){
          suma+="&#89;";
        }else if(palabra[j] == 'Z'){
          suma+="&#90;";
        }else if(palabra[j] == '0'){
          suma+="&#48;";
        }else if(palabra[j] == '1'){
          suma+="&#49;";
        }else if(palabra[j] == '2'){
          suma+="&#50;";
        }else if(palabra[j] == '3'){
          suma+="&#51;";
        }else if(palabra[j] == '4'){
          suma+="&#52;";
        }else if(palabra[j] == '5'){
          suma+="&#53;";
        }else if(palabra[j] == '6'){
          suma+="&#54;";
        }else if(palabra[j] == '7'){
          suma+="&#55;";
        }else if(palabra[j] == '8'){
          suma+="&#56;";
        }else if(palabra[j] == '9'){
          suma+="&#57;";
        }
        System.out.print(suma);
        j++;
        
      }
      return suma;
     }
      
      @Override   
           public void run(){
               metodo();
               for(;;){
			try {
				escribir();
                                
                        }        
                        catch(IOException e){
                        }        
               }

        }
           public void escribir() throws IOException{
		 vista2.escribir(suma);
               }
}

