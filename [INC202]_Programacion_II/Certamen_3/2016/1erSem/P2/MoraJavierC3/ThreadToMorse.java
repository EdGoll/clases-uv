public class ThreadToMorse extends Thread {
	
	public View vista;
	
	public ThreadToMorse(String nombreProc, View vista) {
		super(nombreProc);
		this.vista = vista;
	}
	
	@Override
	public void run(){
		while(true){		
			try {
				agregarLinea(Conversiones.ConvertToMorse(peticion()));
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}
	
	public void agregarLinea(String linea) throws Exception{
		vista.agregarLinea(linea);
	}
	
	public String peticion(){
		return vista.peticion();
	}

}
