
public class traductor2 implements Runnable{

	String palabra="";

	public traductor2(String palabra) {
		super();
		this.palabra = palabra;
	}

	@Override
	public synchronized void run() {
		
		String aAscii= traductor.Aascii(palabra); 
		
	}

}
