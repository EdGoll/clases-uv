public class ThreadAutobusSubirPasajero extends Thread{
	
	private final Autobuses autobuses;
	
	public ThreadAutobusSubirPasajero(Autobuses autobuses){
			this.autobuses=autobuses;
	}
	
	@Override
	public void run(){
			while(true){
					try{
						ThreadAutobusSubirPasajero.sleep((long) (1 + (int)(Math.random() * 5)) * 1000);
						autobuses.subirPasajero((int) (Math.random() * 10) + 1);
					}
					catch(InterruptedException ex){}
			}
	}
	
}

