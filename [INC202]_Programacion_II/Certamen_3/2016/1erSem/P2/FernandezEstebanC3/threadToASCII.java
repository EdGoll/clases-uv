public class threadToASCII extends Thread {
    
    private  Convert convertir;
    
    public threadToASCII(Convert convertir){
        this.convertir = convertir;
    }
    
    
    @Override
    public void run() {
        
        while(true){
            try{
                threadToASCII.sleep(500);
                convertir.translateASCII(RandomWord.generate());
                
            }
            catch (InterruptedException ex){
            }
        
        }
    }
    
}
