import java.util.Random;

public class ThreadAutobusDejarPasajero extends Thread {
	
	private Autobuses autobuses;
	
	public ThreadAutobusDejarPasajero(Autobuses autobuses){
			this.autobuses=autobuses;
	}
	
	@Override
	public void run(){
			while(true){
					try{
						Random r= new Random();
						ThreadAutobusDejarPasajero.sleep((long) (1 + (int)(Math.random() * 5)) * 1000);
						autobuses.dejarPasajero(r.nextInt(10)+1);
					}
					catch(InterruptedException ex){}
			}	
	}
	
}

