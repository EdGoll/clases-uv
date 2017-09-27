import java.util.Random;

public class Autobus {
    
    private final int aTotales = 45;
    private int aDisponibles=45, pasajerosIN, pasajerosOUT;
    private Random rnd = new Random();
    
    
    public synchronized void subirPasajeros(){
        
        try{
            pasajerosIN = (rnd.nextInt(10)+1);
            while(aDisponibles==aTotales && (aDisponibles-pasajerosIN>=0)){
                Thread.sleep((rnd.nextInt(5)+1)*1000);
                aDisponibles -= pasajerosIN;
                
                System.out.println("Suben: "+pasajerosIN+" pasajeros");
                System.out.println("Asientos Disponibles: "+aDisponibles);
                
            }
            notifyAll();
        }catch(InterruptedException ex){
            System.out.println(ex.getMessage());
        }
    }
    
    
    public synchronized void bajarPasajeros(){
        
        try{
            pasajerosOUT = (rnd.nextInt(10)+1);
            
            while(aDisponibles!=aTotales && (aDisponibles+pasajerosOUT<=45)){
                Thread.sleep((rnd.nextInt(5)+1)*1000);
                aDisponibles += pasajerosOUT;
                
                System.out.println("Bajan: "+pasajerosOUT+" pasajeros");
                System.out.println("Disponibles: "+aDisponibles);
                
            }
            notifyAll();
        }catch(InterruptedException ex){
            System.out.println(ex.getMessage());
        }
    }
}

