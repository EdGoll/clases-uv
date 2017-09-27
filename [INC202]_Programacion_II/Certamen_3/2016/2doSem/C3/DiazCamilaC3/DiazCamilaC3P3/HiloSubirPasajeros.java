

public class HiloSubirPasajeros extends Thread {
    
    Autobus Autobus;
    
    public  HiloSubirPasajeros(Autobus autobus){
        this.Autobus=autobus;
    }
    
    @Override
    public void run(){    
        while(true){
            try{
                Thread.sleep((Autobus.Random(5))*1000);
                Autobus.SubirPasajeros();                
           }catch(Exception e){}
            
        }    
    }
   
}
