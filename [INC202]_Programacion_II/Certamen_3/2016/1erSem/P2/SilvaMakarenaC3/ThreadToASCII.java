import javax.swing.JTextArea;

public class ThreadToASCII extends Thread {
    private JTextArea mostrar;

    public ThreadToASCII(JTextArea mostrar) {
        this.mostrar = mostrar;       
    }
    
    @Override
    public void run(){
        while(true){
            try{
                Thread.sleep(1000);
                this.traducirA();
                
           }catch(Exception e){}
        }
    }
    public synchronized void traducirA(){   //De igual forma que la otra hebra, debe compartir el recurso de RandomWord
        String palabra = null;
        View toTextArea = new View();
        toASCII ta = new toASCII();
        palabra = RandomWord.generate();
        palabra = ta.aAscii(palabra);
        mostrar.append(palabra);    
        toTextArea.setOut(mostrar);
    }
}
