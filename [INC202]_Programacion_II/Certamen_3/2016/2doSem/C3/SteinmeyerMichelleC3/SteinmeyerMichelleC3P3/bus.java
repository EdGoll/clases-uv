
import java.util.Random;
public class bus {
    protected int asientos= 45;
    protected int disponible = 45; 
    Random ran = new Random();
    
    public bus(int d){ 
        asientos = disponible = d;
    }

    public synchronized void suben(){
        
            try{
                System.out.println("Subiendo pasajero/s");
                while(asientos == 0){
                    System.out.println("Esperando");
                    wait();
                }
                disponible -= ran.nextInt(10)+1;
                notifyAll();
                System.out.println("Pasajero sentado");
                Thread.sleep(ran.nextInt(((5)+1)*100));
            }catch(InterruptedException ex){ 

            }
            System.out.println("");
        }
    

    public synchronized void bajan(){
        try{
            System.out.println("Bajando pasajero/s");
            while(asientos == disponible ){
                System.out.println("Esperando");
                wait();
            }
            disponible+= ran.nextInt(10)+1;
            notifyAll();
            System.out.println("Bajo pasajero");
            Thread.sleep(ran.nextInt(((5)+1)*1000));
        }catch(InterruptedException ex){
            
        }
    }
}
