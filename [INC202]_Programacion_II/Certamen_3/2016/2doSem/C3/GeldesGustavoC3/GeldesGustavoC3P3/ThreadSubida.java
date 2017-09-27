
public class ThreadSubida extends Thread implements Runnable{
    private int pasajeros;
    public static int suma=0;
    private int i;
    public ThreadSubida(){
        
    }
  
    public synchronized void run(){
       while(true){
                if(suma==45){
                    System.out.println("Bus lleno, esperando a bajar gente");
                    try {
                        Thread.sleep(3000);
                    } catch (Exception ex) {
                        
                    }
                }
            long start = System.currentTimeMillis();
            pasajeros = +((int)(Math.random()*(10-1)+1));
            System.out.println("Suben "+pasajeros+" pasajeros" );
            suma = pasajeros+suma;
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
