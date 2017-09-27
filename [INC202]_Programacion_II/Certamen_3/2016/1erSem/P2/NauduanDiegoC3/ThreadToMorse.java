
public class ThreadToMorse extends Thread{
    
    private final View vw;
    
    public ThreadToMorse(View vw){
        this.vw = vw;
    }
    
    @Override
    public void run(){
        while(true){
            try {
                ThreadToMorse.sleep((long) (1 + (int) (Math.random() * 2)) * 1000);
                vw.escribir(Traduccion.aMorse(RandomWord.generate()));
            }catch (InterruptedException ex) {
            } 
        }
    }
}

