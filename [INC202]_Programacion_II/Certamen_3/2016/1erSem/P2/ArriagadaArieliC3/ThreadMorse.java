
import java.io.IOException;
import javax.imageio.IIOException;
import javax.naming.InterruptedNamingException;


public class ThreadMorse extends Thread {
	private String nombre;
	View b;
	private int i;
    private String AMorse;

    ThreadMorse(String string) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
	
	public ThreadMorse(String nombre, View b){
		this.nombre = nombre;
		this.b = b;
	}

	@Override
	public void run() {
		for(;;){
			System.out.println(AMorse+i);
			try {
				escribir();
				try{
				Thread.sleep(1000);}
				catch (Exception e) {
					// TODO: handle exception
				}
			} catch (IOException e) {
			}
			i++;
		}
	}
	 public void escribir() throws IOException{
		 b.escribir(AMorse+" : "+i);
	 }
	 
}