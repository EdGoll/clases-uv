//Hector Toro 19.268.713-6

public class ThreadToASCII extends Thread{
	View interfaz;
	String nombre;
	public ThreadToASCII( View interfaz){
		this.interfaz = interfaz;
	}
	
	@Override
	public void run(){
		while(true){
			try {
				ThreadToASCII.sleep((long) (1 + (int)(Math.random() * 5)) * 300);
				setValor(ToASCII.toASCII(View.generar()));
			} catch (Exception e) {
				System.out.println(e);
			}
			
		}	
	}
	public void setValor(String nombre) throws Exception{
		this.nombre= nombre;
		interfaz.setValor(nombre);
	 }
}
