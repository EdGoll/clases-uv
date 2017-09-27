

public class Bus extends Thread{
	private int pasajeros;
	ThreadSubir subir = new ThreadSubir(this);
	ThreadBajar bajar = new ThreadBajar(this);
	
	public void run() {
		while(true){
			subir.run();
			bajar.run();
		}
	}
	public int getPasajeros() {
		return pasajeros;
	}
	public void setPasajeros(int pasajeros) {
		this.pasajeros = pasajeros;
		
	}
	
	synchronized void subirPasajeros(int pasajeros){
		System.out.println("suben "+ pasajeros + "  pasajeros");
		 setPasajeros(pasajeros + this.pasajeros);
		System.out.println("Hay :   " + getPasajeros() );
	}
	synchronized void bajarPasajeros(int pasajeros){
		System.out.println("Bajan "+ pasajeros + "  pasajeros");
		setPasajeros(this.pasajeros-pasajeros);
		System.out.println("Hay :   " + getPasajeros() );
	}
}
