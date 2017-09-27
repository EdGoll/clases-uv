
import static java.lang.Thread.sleep;
import java.util.logging.Level;
import java.util.logging.Logger;

public class ThreadToASCII extends Thread {

    public Susurrador su;
    public View.palabra viewAP;
    String palabaTraducida;
    public boolean terminar = false;

    public ThreadToASCII(Susurrador su, View.palabra viewAP) {   //Constructor del hilo que recibe la clase Susurrador y la subclase View.palabra
        this.su = su;
        this.viewAP = viewAP;
    }

    @Override
    public void run() {

        while (!terminar) {
            try {
                sleep((1 + (int) (Math.random() * 5)) * 1000);      //el run llama al recurso compartido, transforma todas sus letras a mayuscula y luego 
                su.AAscii(RandomWord.generate().toUpperCase());     //a traves de un metodo get, se extrae la palabra traducida desde el susurrador  (su)
                this.palabaTraducida = su.getTradu();               //Se hace propia la  palabra traducida desde Susurrador
                viewAP.agregarTexto(palabaTraducida + "\n");        //Se envia al metodo que agrega la palabra traducida al jtextarea
                                                                    /// Se imprime en consola
            } catch (InterruptedException ex) {
            }
        }

    }

}
