
public class ThreadToASCII extends Thread {
    
    private String t;
    private View v;
    private String palabra;
    
    public ThreadToASCII( String palabra, View v){
       
      
        this.palabra=palabra;
        this.v=v;
    }
    
    @Override
    public void run() {
    	Traduccion t = new Traduccion (palabra);
        while(true) {
            t.TASCII();
        }
    }
}