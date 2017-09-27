
public class ThreadToASCII extends Thread {

    private  View view;
    Transformar t = new Transformar();
    public   RandomWord r=new RandomWord();
     long sleep = 1000; // Espera de 1 segundo 
    public ThreadToASCII(View view) {
     this.view=view;  
    
   

    }
     

    @Override
    public void run() {
        while (true) {
            try {
                String p= r.generate().toUpperCase();
                Thread.sleep(sleep);
                view.Write("Ascii: " + p + " = " + t.ascii(p));
            } catch (Exception e) {
            }
        }
    }



    
}
