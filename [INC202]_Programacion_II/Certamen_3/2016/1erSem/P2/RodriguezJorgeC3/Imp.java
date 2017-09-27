

public class Imp {

    
       
   
    public synchronized void morse(String word) {
     
        word= RandomWorld.generate();
        TraductorMorse tm = new  TraductorMorse();
        tm.translateWord(word);
        notifyAll();
    
    }
    
    public synchronized  void ascii(String word){
    
        word= RandomWorld.generate();
        TraductorMorse tm = new  TraductorMorse();
        tm.translateWord(word);
        notifyAll();
    }
}
