
import java.io.IOException;

public class ThreadToMorse extends Thread {
    private String name;
    View v;

    public ThreadToMorse(String name, View v) {
        this.name = name;
        this.v = v;
    }

    @Override
    public void run() {
        for(;;){

            try{                
                morse();
                try {
                    Thread.sleep(500);
                } catch (Exception ex) {}
            } catch (IOException e) {}        
        }
    }
    
    public void morse() throws IOException{
        v.agregarLinea(Convertir.aMorse(RandomWord.generate()));
    }    
        
     
 }
    
    
    
   
