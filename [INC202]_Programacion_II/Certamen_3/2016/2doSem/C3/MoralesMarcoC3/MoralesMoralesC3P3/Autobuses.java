public class Autobuses {
	private int capacidadPasajeros= 45;
	private int pasajerosDentro=0;
	
	public synchronized void subirPasajero(int pasajerosSube){
			try{
					while(pasajerosDentro >= capacidadPasajeros || pasajerosDentro + pasajerosSube >= capacidadPasajeros){
						wait();
					}
					pasajerosDentro += pasajerosSube;
					System.out.println("Subieron "+ pasajerosSube + " pasajeros. Pasajeros dentro:" + getPasajeros());
					notifyAll();
			}
			catch (InterruptedException ex){}
	}
	public synchronized void dejarPasajero(int pasajerosBajan){
			try{
					while(pasajerosDentro <= 0 || pasajerosDentro-pasajerosBajan <=0 ){
							wait();
					}
					pasajerosDentro-= pasajerosBajan;
					System.out.println("Bajaron  "+ pasajerosBajan +" pasajeros. Pasajeros dentro:" + getPasajeros());
					notifyAll();
			}
			catch (InterruptedException ex){}
	}
	public int getPasajeros(){
			return pasajerosDentro;
	}
}

