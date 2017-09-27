
public class Threadbajada extends Thread implements Runnable {
    private int pasajeros;
    public int suma;
    private int i;
    public Threadbajada(){
        
    }
    
    public synchronized void run(){
       while(true){
           if(suma==0){
               System.out.println("bus vacio,esperando a que suban");
               try {
                   Thread.sleep(3000);
               } catch (Exception ex) {
               }
               
           }
            long start = System.currentTimeMillis();
            pasajeros = +((int)(Math.random()*(10-1)+1));
            System.out.println("bajan"+pasajeros+" pasajeros" );
            suma = suma-pasajeros;
            try{
				Thread.sleep((int) (Math.random()*(1000-5000)+5000));
                               
			}			
			catch(InterruptedException e) {
			}	
			long end = System.currentTimeMillis();
			long res = end- start;
			System.out.println("Segundos: " +res/1000);
            i++;            
            
        }
       
    }
            
    
}
    
