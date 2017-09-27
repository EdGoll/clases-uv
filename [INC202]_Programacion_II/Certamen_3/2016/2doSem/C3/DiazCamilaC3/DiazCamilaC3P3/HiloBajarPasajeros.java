

public class HiloBajarPasajeros extends Thread{
    
     Autobus Autobus;
    
    public  HiloBajarPasajeros(Autobus autobus){
        this.Autobus=autobus;
    }
    
    @Override
    public void run(){
        while(true){           
            try{
                Thread.sleep((Autobus.Random(5))*1000);
                Autobus.BajarPasajeros();              
            }catch(Exception e){}            
        }
    }
    

}
