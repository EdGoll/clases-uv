public class AutoBus {

    private final int MAX_PASAJEROS = 45;
    private final int MIN_PASAJEROS = 0;
    private int pasajeros = 0;


    public synchronized void subida(int pasajeros_sub) {
        try {
            while(pasajeros > MAX_PASAJEROS){
                
                //setPasajeros(45);                
                wait();
            }
            pasajeros += pasajeros_sub;
            while(pasajeros > MAX_PASAJEROS){
                System.out.println("------------AUTOBUS-LLENO----------------");
                pasajeros = 45;
                wait();
            }

            System.out.println("------------PARADA-DE-AUTOBUS------------");
            System.out.println("Subida de pasajeros: " + pasajeros_sub);
            System.out.println( "Pasajeros en AutoBus: " + getPasajeros());
            System.out.println("-----------------------------------------");
            notifyAll();

        } catch (InterruptedException ex) {
        }
    }

    public synchronized void bajada(int pasajeros_baj) {
        try {
            while(pasajeros < MIN_PASAJEROS){ /*&& pasajeros >=MAX_PASAJEROS*/
                
                //setPasajeros(0);
                wait();
            }
            pasajeros -= pasajeros_baj;
            while(pasajeros < MIN_PASAJEROS){
                System.out.println("------------AUTOBUS-VACIO----------------");
                pasajeros = 0;
                wait();
            }
            System.out.println("------------PARADA DE AUTOBUS------------");
            System.out.println("Bajada de pasajeros: " + pasajeros_baj);
            System.out.println("Pasajeros en AutoBus: " + getPasajeros());
            System.out.println("-----------------------------------------");
            notifyAll();
        } 
        catch (InterruptedException ex) {
        }
    }

    private int getPasajeros() {
        return pasajeros;
    }

    private void setPasajeros(int pasajeros){
        this.pasajeros = pasajeros;
    }
}
