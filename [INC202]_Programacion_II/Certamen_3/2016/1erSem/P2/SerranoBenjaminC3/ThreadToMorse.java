import java.util.logging.Level;
import java.util.logging.Logger;

public class ThreadToMorse extends Thread {

    private String palabra;
    View vw;

    public ThreadToMorse(View vw) {

        this.palabra = RandomWord.generate();
        this.vw = vw;
    }

    @Override
    public void run() {
        while(true){
            TraductorMorse tm = new TraductorMorse(palabra);
            String palabraTraducida = tm.traducirPalabra();
            vw.out.append(palabraTraducida + System.getProperty("line.separator"));
        }
    }
}