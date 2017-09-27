
public class traductor3 implements Runnable{

	String palabra="";

	public traductor3(String palabra) {
		super();
		this.palabra = palabra;
	}
	
	@Override
	public synchronized void run() {
		
		String aMorse= traductor.Amorse(palabra);
		
	}

}
