


public class ThreadAsci implements Runnable {
	private String nombre;

	private int i;
    private String AAscii;
	
	public ThreadAsci(String nombre){
		this.nombre = nombre;
	}

    ThreadAsci(String hebra_, View aThis) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }


	@Override
	public void run() {
		for(;;){
			System.out.println(AAscii+" : "+i);
			i++;
		}
	}

    void start() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}

 

