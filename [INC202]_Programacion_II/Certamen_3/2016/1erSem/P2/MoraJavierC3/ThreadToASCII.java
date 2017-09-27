public class ThreadToASCII extends Thread {

	public View vista;
	
	public ThreadToASCII(String nombreProc, View vista) {
		super(nombreProc);
		this.vista = vista;
	}
	
	@Override
	public void run(){
		while(true){		
			try {
				agregarLinea(Conversiones.ConvertToASCII(peticion()));
			} catch (Exception e) {
				System.out.println("ERROR: "+e);
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
