
import java.io.IOException;

public class ThreadToMorse extends Thread{
               View vista;
               String suma;
               char[] palabra;
               int j = 0;
               public ThreadToMorse(View vista){
                   this.vista = vista;
               }
               private int i;
               
              
      public String metodo(){ 
        palabra = RandomWord.generate().toUpperCase().toCharArray();
      while(j<=palabra.length-1){
        if(palabra[j] == 'A'){
          suma+=".-";
        }else if(palabra[j] =='B'){
         suma+="-...";
        }else if(palabra[j] == 'C'){
          suma+="-.-.";
        }else if(palabra[j] == 'D'){
          suma+="-..";
        }else if(palabra[j] == 'E'){
          suma+=".";
        }else if(palabra[j] == 'F'){
          suma+="..-.";
        }else if(palabra[j] == 'G'){
          suma+="--.";
        }else if(palabra[j] == 'H'){
         suma+="...";
        }else if(palabra[j] == 'I'){
          suma+="..";
        }else if(palabra[j] == 'J'){
          suma+=".---";
        }else if(palabra[j] == 'K'){
          suma+="-.-";
        }else if(palabra[j] == 'L'){
          suma+=".-..";
        }else if(palabra[j] == 'M'){
          suma+="--";
        }else if(palabra[j] == 'N'){
         suma+="-.";
        }else if(palabra[j] == 'O'){
          suma+="---";
        }else if(palabra[j] == 'P'){
          suma+=".--.";
        }else if(palabra[j] == 'Q'){
          suma+="--.-";
        }else if(palabra[j] == 'R'){
          suma+=".-.";
        }else if(palabra[j] == 'S'){
          suma+="...";
        }else if(palabra[j] == 'T'){
          suma+="-";
        }else if(palabra[j] == 'U'){
          suma+="..-";
        }else if(palabra[j] == 'V'){
          suma+="...-";
        }else if(palabra[j] == 'W'){
          suma+=".--";
        }else if(palabra[j] == 'X'){
          suma+="-..-";
        }else if(palabra[j] == 'Y'){
          suma+="-.--";
        }else if(palabra[j] == 'Z'){
          suma+="--..";
        }else if(palabra[j] == '0'){
          suma+="-----";
        }else if(palabra[j] == '1'){
          suma+=".----";
        }else if(palabra[j] == '2'){
          suma+="..--";
        }else if(palabra[j] == '3'){
          suma+="...--";
        }else if(palabra[j] == '4'){
          suma+="....-";
        }else if(palabra[j] == '5'){
          suma+=".....";
        }else if(palabra[j] == '6'){
          suma+="-....";
        }else if(palabra[j] == '7'){
          suma+="--...";
        }else if(palabra[j] == '8'){
          suma+="---..";
        }else if(palabra[j] == '9'){
          suma+="----.";
        }
        System.out.print(suma);
        j++;
       
      }
     return suma;
   }
           @Override   
           public void run(){
               
               for(;;){
                metodo();
			try {
				escribir();
                        }        
                        catch(IOException e){
                        }        

               }

        }
           public void escribir() throws IOException{
		 vista.escribir(suma);
               }
}
