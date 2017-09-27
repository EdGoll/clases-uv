

import java.io.IOException;



public class ThreadAscii extends Thread {
    private String line;
    private View b;
    
    public ThreadAscii(View b){
        this.b=b;
    }
    
    @Override
    public void run(){
        for(;;){
            line=ASCII.trad(RandomWord.generate());
            try{
                escribir();               
                sleep(40);
            }catch(Exception e){
                
            }
        }
    }
    public void escribir() throws IOException{
        b.write(line);
    }
}

class ThreadMorse extends Thread {
    private String lin;
    private View a;
    
    public ThreadMorse(View a){
        this.a=a;
    }
    
    @Override
    public void run(){
        for(;;){
            lin = TMorse.codec(RandomWord.generate());
            
            try{
                escribir();
                sleep(40);
            }catch(Exception e){
                
            }
        }
    } 
    public void escribir() throws IOException{
        a.write(lin);
    }
}