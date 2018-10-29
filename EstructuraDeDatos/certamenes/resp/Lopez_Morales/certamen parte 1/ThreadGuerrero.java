public class ThreadGuerrero extends Thread{
    
    private final  Combate combate;
    
    private final NumeroAleatorio numA;
    
    public ThreadGuerrero(Combate combate){
        this.numA = new NumeroAleatorio();
        this.combate=combate;
        
    }

    @Override
    
    public void run(){
        
    
        while(true){
                        
            try {
                ThreadGuerrero.sleep((long) (1 + numA.getNumero(1)));
                combate.jugadaGuerrero(numA.getNumero(4));
            } catch (InterruptedException ex) {
            }
        }
    }
    
}
