
import java.io.IOException;

public class ThreadToASCII extends Thread {

    private String name;
    View v;

    public ThreadToASCII(String name, View v) {
        this.name = name;
        this.v = v;
    }

    @Override
    public void run() {
        for (;;) {
            try {
                ascii();
                try {
                    Thread.sleep(500);
                } catch (Exception ex) {
                }
            } catch (IOException e) {
            }

        }
    }

    public void ascii() throws IOException {
        v.agregarLinea(Convertir.aASCII(RandomWord.generate()));
    }

}
