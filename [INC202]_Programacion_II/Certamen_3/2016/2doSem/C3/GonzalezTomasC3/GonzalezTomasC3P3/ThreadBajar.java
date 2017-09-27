

import java.util.Random;

public class ThreadBajar extends Thread{
	Bus bus;
	Random random;
	int numPasajeros;
	public ThreadBajar(Bus bus){
		this.bus = bus;
	}
	@Override
	public void run(){
		random = new Random();
			try {
				numPasajeros = random.nextInt(8)+1;
				if (bus.getPasajeros()>0 && numPasajeros<= bus.getPasajeros()) {
					bus.bajarPasajeros(numPasajeros);
				}
				ThreadSubir.sleep((long) (1 + (int)(Math.random() * 5)) * 1000);
			} catch (Exception e) {
				System.out.println(e);
			}
		}
	
}
