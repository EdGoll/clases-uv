
public class ThreadToASCII extends Thread{

    private final View vw;
    
    public ThreadToASCII(View vw){
        this.vw = vw;
    }
     
    @Override
    public void run(){
        while(true){
            try {
                ThreadToASCII.sleep((long) (1 + (int) (Math.random() * 2)) * 1000);
                vw.escribir(Traduccion.aASCII(RandomWord.generate()));
            }catch (InterruptedException ex) {
            }
        }
    }
}

