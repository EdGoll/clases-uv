public class ThreadToMorse extends Thread{
    
    private WordToTransform wordtotransform;
    private View v;
    private String trad;

    public ThreadToMorse(WordToTransform wordtotransform, View v){
       this.wordtotransform = wordtotransform;
       this.v= v;
    }

    @Override
    public void run() {
        while(true){
            
            try {
                wordtotransform.toMorse();
                trad = wordtotransform.getTrad();
                v.out.append(trad + System.getProperty("line.separator"));
                Thread.sleep(2000);
            } catch (InterruptedException e) {
            }
                       

        }
    }  
}
