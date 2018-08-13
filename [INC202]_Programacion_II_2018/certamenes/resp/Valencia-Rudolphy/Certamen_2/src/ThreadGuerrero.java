import java.io.IOException;

public class ThreadGuerrero extends Thread{

	private final Pelea pelea ;
	private final Archivos archivos;

	
	public ThreadGuerrero(Pelea pelea, Archivos archivos) {
		this.pelea=pelea;
		this.archivos=archivos;
	}
	
	public void run() {		
		
		 do {
			try {				
			ThreadGuerrero.sleep((long) (3000));
			pelea.ataqueGuerrero();
			
			archivos.Ataquesg();
			}catch(InterruptedException ex) {
				
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}while(pelea.m.energia>0 && pelea.g.energia>0);
			pelea.ganador();
		}
	

			
}
