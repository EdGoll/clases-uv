
import java.util.logging.Level;
import java.util.logging.Logger;

public class ThreadToMorse extends Thread{
    
    Conversor conv;
    View view;
    private String palabra,albel;
    private static String  traduccion;
    
    public ThreadToMorse(View view){
        this.view=view;
    }
    
    @Override
        public void run(){
            while(true){
                try {
                    Thread.sleep(50);
                } catch (InterruptedException ex) {
                    Logger.getLogger(ThreadToMorse.class.getName()).log(Level.SEVERE, null, ex);
                }
                palabra = view.palabra();
                conv = new Conversor();
                albel = conv.mayuscula(palabra);
                traduccion = conv.conv_morse(albel);
                view.morse(traduccion);
                
            }
        }
}
