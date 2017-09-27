import java.util.Random;

public class Autobus {

    protected int espacios;
    protected int capacidad;
    
    public Autobus(int n) {
        
        capacidad = espacios = n;
    }
    
    public synchronized void entra() {
        Random rnd = new Random();
        try {
           
            

            while (espacios == 0) {
                
                wait();
            }
            espacios--;
            Thread.sleep(((new Random()).nextInt(5) + 1)*1000);
            while(espacios != 0){
                capacidad = espacios + rnd.nextInt(10)+1;
                if(capacidad > 45){
                    capacidad = espacios - rnd.nextInt(10)+1;
                  
                }
                
               notifyAll();
                System.out.println(capacidad );
            }
        } catch (InterruptedException ex) {

        }
    }
    
    public synchronized void sale() {
        Random rnd = new Random();
        
        try {
            Thread.sleep(((new Random()).nextInt(5) + 1)*1000);
            while (capacidad == espacios) {
                
                wait();
            }
            espacios--;
            Thread.sleep(((new Random()).nextInt(5) + 1)*1000);
              while(espacios !=0){
              capacidad= espacios - rnd.nextInt(10)+1;
                
                if(capacidad >45 ){
                    capacidad = espacios - rnd.nextInt(10)+1;
                    
                }
                notifyAll();
                System.out.println(capacidad );

            }
        } catch (InterruptedException ex) {

        }
    }    
}
