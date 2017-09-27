
import java.util.logging.Level;
import java.util.logging.Logger;

public class ThreadToMorse extends Thread {

    public Susurrador su;
    private View.palabra viewAP;
    private String palabaTraducida;
    
    public ThreadToMorse(Susurrador su, View.palabra viewAP) {  //Constructor del hilo que recibe la clase Susurrador y la subclase View.palabra
        this.su = su;
        this.viewAP=viewAP;
    }

    @Override
    public void run() {
        while (true) {
            try {
                sleep(((long)1+ (int) (Math.random() * 5)) * 1000); //el run llama al recurso compartido, transforma todas sus letras a mayuscula y luego 
                su.AMorse(RandomWord.generate().toUpperCase());     //a traves de un metodo get, se extrae la palabra traducida desde el susurrador  (su)
                this.palabaTraducida=su.getTradu();                 //Se hace propia la  palabra traducida desde Susurrador
                viewAP.agregarTexto(palabaTraducida+"\n");          //Se envia al metodo que agrega la palabra traducida al jtextarea
                System.out.println(su.getTradu());                  /// Se imprime en consola
                
            } catch (InterruptedException ex) {

            }
        }
    }
    
    

}


/* + "\n"*/