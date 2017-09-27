import java.io.IOException;

public class ThreadToASCII extends Thread{
	View vIntf;
	private String nombre;
	private int i;
	String traduccion;
	
	public ThreadToASCII(String nombre, View intf){
		this.nombre= nombre;
		this.vIntf= vIntf;
		
		
	}
	@Override
	public void run(){
		for(;;){
			traduccion="";
			traduccion.
			Aascii aascii= new Aascii();
			System.out.println(nombre +" "+i);
			try{
				escribir1();
				try{
					Thread.sleep(1000);
				}catch(Exception e){
					
				}
			}catch(IOException e){	
			
			}
			i++;
		}
	}
	
	public void escribir1() throws IOException{
		vIntf.escribir(nombre+" : "+i);
	}
}