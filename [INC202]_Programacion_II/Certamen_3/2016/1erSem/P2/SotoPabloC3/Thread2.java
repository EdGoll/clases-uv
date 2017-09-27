



import javax.swing.JFrame;


public class Thread2 implements Runnable{
    
    View r2;
    RandomWord rdl;
    
    public Thread2(View rw, RandomWord rd){
        
        this.r2=rw;
        this.rdl=rd;
        
    }
    
    
    
    @Override
    public void run(){
        
        while(true){
            try{
                Thread.sleep((long) (1 + (int) (Math.random() * 5)) *1000);
                r2.th1(" " +AMorse(rdl.generate().toUpperCase()));
                
            }catch(InterruptedException ex){
                
            }
        }
        
    }
    
    private String AMorse(String morse){
        
         String lineaMorse="";
         for(int i=0;i<morse.length();i++){
             switch(morse.charAt(i)){
                  case 'A':
                     lineaMorse = lineaMorse + " .- ";
                     break;

                 case 'B':
                     lineaMorse = lineaMorse + " -... ";
                     break;

                 case 'C':
                     lineaMorse = lineaMorse + " -.-. ";
                     break;

                 case 'D':
                     lineaMorse = lineaMorse + " -.. ";
                     break;

                 case 'E':
                     lineaMorse = lineaMorse + " . ";
                     break;

                 case 'F':
                     lineaMorse = lineaMorse + " ..-. ";
                     break;
                     
                 case 'G':
                     lineaMorse = lineaMorse + " --. ";
                     break;

                 case 'H':
                     lineaMorse = lineaMorse + " .... ";
                     break;

                 case 'I':
                     lineaMorse = lineaMorse + " .. ";
                     break;

                 case 'J':
                     lineaMorse = lineaMorse + " .--- ";
                     break;

                 case 'K':
                     lineaMorse = lineaMorse + " -.- ";
                     break;

                 case 'L':
                     lineaMorse = lineaMorse + " .-.. ";
                     break;

                 case 'M':
                     lineaMorse = lineaMorse + " -- ";
                     break;

                 case 'N':
                     lineaMorse = lineaMorse + " -. ";
                     break;

                 case 'O':
                     lineaMorse = lineaMorse + " --- ";
                     break;

                 case 'P':
                     lineaMorse = lineaMorse + " .--. ";
                     break;

                 case 'Q':
                     lineaMorse = lineaMorse + " --.- ";
                     break;

                 case 'R':
                     lineaMorse = lineaMorse + " .-. ";
                     break;

                 case 'S':
                     lineaMorse = lineaMorse + " ... ";
                     break;

                 case 'T':
                     lineaMorse = lineaMorse + " - ";
                     break;

                 case 'U':
                     lineaMorse = lineaMorse + " ..- ";
                     break;

                 case 'V':
                     lineaMorse = lineaMorse + " ...- ";
                     break;

                 case 'W':
                     lineaMorse = lineaMorse + " .-- ";
                     break;

                 case 'X':
                     lineaMorse = lineaMorse + " -..- ";
                     break;

                 case 'Y':
                     lineaMorse = lineaMorse + " -.-- ";
                     break;

                 case 'Z':
                     lineaMorse = lineaMorse + " --.. ";
                     break;

                 case '1':
                     lineaMorse = lineaMorse + " .---- ";
                     break;

                 case '2':
                     lineaMorse = lineaMorse + " ..--- ";
                     break;

                 case '3':
                     lineaMorse = lineaMorse + " ...-- ";
                     break;

                 case '4':
                     lineaMorse = lineaMorse + " ....- ";
                     break;

                 case '5':
                     lineaMorse = lineaMorse + " ..... ";
                     break;

                 case '6':
                     lineaMorse = lineaMorse + " -.... ";
                     break;

                 case '7':
                     lineaMorse = lineaMorse + " --... ";
                     break;

                 case '8':
                     lineaMorse = lineaMorse + " ---.. ";
                     break;

                 case '9':
                     lineaMorse = lineaMorse + " ----. ";
                     break;

                 case '0':
                     lineaMorse = lineaMorse + " ----- ";
                     break;

                 case ':':
                     lineaMorse = lineaMorse + " ---... ";
                     break;

                 case ',':
                     lineaMorse = lineaMorse + " --..-- ";
                     break;

                 case ';':
                     lineaMorse = lineaMorse + " -.-.-. ";
                     break;

                 case '"':
                     lineaMorse = lineaMorse + " .-..-. ";
                     break;

                 case '.':
                     lineaMorse = lineaMorse + " .-.-.- ";
                     break;

                 case '?':
                     lineaMorse = lineaMorse + " ..--.. ";
                     break;

                 case '!':
                     lineaMorse = lineaMorse + "-.-.-- ";
                     break;
                 case ' ':
                     lineaMorse = lineaMorse + " / ";
                     break;
             }
         }
       
        
        
        return lineaMorse;
    }
    
}
