

import java.util.Random;

public class ThreadSubir extends Thread{
	Bus bus;
	Random random;
	int numPasajeros;
	public ThreadSubir(Bus bus) {
		this.bus = bus;
	}
	
	@Override
	public void run(){
		random = new Random();
		
			try {
				numPasajeros = random.nextInt(8)+1;
				if ((numPasajeros + bus.getPasajeros())<=45) {
					bus.subirPasajeros(numPasajeros);
				}
				ThreadSubir.sleep((long) (1 + (int)(Math.random() * 5)) * 1000);
			} catch (Exception e) {
				System.out.println(e);
			}		
		
	}
}
