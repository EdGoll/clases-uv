public class threadToMorse extends Thread{

    private  Convert convertir;
    
    public threadToMorse(Convert convertir){
        this.convertir = convertir;
    }
    
    
    @Override
    public void run() {
        
        while(true){
            try{
                threadToMorse.sleep(500);
                convertir.translateWord(RandomWord.generate());
                
            }
            catch (InterruptedException ex){
            }
        
        }
    }
       
}
