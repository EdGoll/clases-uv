//Hector Toro 19.268.713-6

public class ThreadToMorse extends Thread{
	View interfaz;
	String nombre;
	public ThreadToMorse( View interfaz){
		this.interfaz = interfaz;
	}
	
	@Override
	public void run(){
		while (true) {
			try {
				ThreadToMorse.sleep((long) (1 + (int)(Math.random() * 5)) * 300);
				setValor(ToMorse.toMorse(View.generar()));
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
