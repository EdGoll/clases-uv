public class ThreadMago extends Thread {
    
    private final  Combate combate;
    
    private final NumeroAleatorio numA;
    
    public ThreadMago(Combate combate){
        this.numA = new NumeroAleatorio();
        this.combate=combate;
        
    }

    @Override
    
    public void run(){
        
    
        while(true){
                        
            try {
                ThreadMago.sleep((long) (1 + numA.getNumero(1)));
                combate.jugadaMago(numA.getNumero(4));
            } catch (InterruptedException ex) {
            }
        }
    }
    
}
