public class PrincipalAutobus {
	
	public static void main (String args[]) {
		Autobuses ab= new Autobuses();
		
		ThreadAutobusSubirPasajero tasp= new ThreadAutobusSubirPasajero(ab);
		ThreadAutobusDejarPasajero tadp= new ThreadAutobusDejarPasajero(ab);
		
		tasp.start();
		tadp.start();
		
		try{
				tasp.join();
				tadp.join();
		}
		catch (InterruptedException ex){}
	}
}

