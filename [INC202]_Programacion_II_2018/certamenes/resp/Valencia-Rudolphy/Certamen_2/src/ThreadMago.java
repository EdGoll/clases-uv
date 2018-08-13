import java.io.IOException;

public class ThreadMago extends Thread{
	private final Pelea pelea;
	private final Archivos archivos;

	public ThreadMago(Pelea pelea, Archivos archivos) {
		this.pelea=pelea;
		this.archivos=archivos;
	}
	
	public void run() {
			do{
				try {
					ThreadMago.sleep((long) (3000));
					pelea.ataqueMago();
					
					archivos.Ataquesm();
				}catch(InterruptedException ex) {
		
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}while(pelea.g.energia>0 && pelea.m.energia>0);
				pelea.ganador();
			
	}
}
