
public class ThreadToMorse extends Thread {

    private  View view;
  
    long sleep = 1000; //Espera de 1 segundo
     public  RandomWord r=new RandomWord();
    public ThreadToMorse(View view) {
        this.view = view;
        
    }
    Transformar t = new Transformar();
    

    @Override
    public void run() {
        
        while (true) {
            try {
                String p= r.generate().toUpperCase();
                Thread.sleep(sleep);
                view.Write("Morse: "+p +" = "+ t.morse(p));
            } catch (Exception e) {
            }
        }
    }



    

}
