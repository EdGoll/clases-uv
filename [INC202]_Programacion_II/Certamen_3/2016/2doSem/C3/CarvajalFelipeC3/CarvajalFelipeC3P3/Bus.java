import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.Random;

public class Bus {
    private int Personas = 0;
    public void setPersonas(int cantidad){
        Personas = cantidad;
    }
    public int getPersonas(){
        return Personas;
    }
    
     synchronized void Subir(){
        
        System.out.println("////////Subieron////////");
        int cantidad = (new Random().nextInt(9)+1);
        if((Personas + cantidad > 45) && Personas <45){
            cantidad = 45-(Personas);
            Personas = 45;
            System.out.println("Subieron: "+ cantidad);
            System.out.println("Hay Personas: "+ Personas);
            notifyAll();
            
        }
        else if(Personas==45){
            try {
                wait();
                System.out.println("El bus esta Lleno");
            } catch (InterruptedException ex) {
                Logger.getLogger(Bus.class.getName()).log(Level.SEVERE, null, ex);
            }
            
        }
        else{           
            notifyAll();
            Personas += cantidad;
            System.out.println("Subieron: "+ cantidad);
            System.out.println("Hay Personas: "+ Personas);
        }
        

        
    }
    
    synchronized void Bajar(){
        System.out.println("/////////Bajan/////////");
        Random rand = new Random();
        int cantidad = rand.nextInt(9)+1;
        if(Personas-cantidad < 0 && Personas >= 0){
            cantidad = (cantidad - Personas);
            Personas = 0;
            notifyAll();
       
        }
        else if(Personas == 0){
            try {
                wait();
                System.out.println("El bus esta vacio");
            } catch (InterruptedException ex) {
                Logger.getLogger(Bus.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        else{
             Personas -= cantidad;
             notifyAll();
        }
             System.out.println("Bajaron: "+ cantidad);
             System.out.println("Quedan: "+ Personas);
        }
}