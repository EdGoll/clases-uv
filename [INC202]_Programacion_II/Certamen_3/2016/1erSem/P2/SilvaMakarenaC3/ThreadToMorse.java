import javax.swing.JTextArea;

public class ThreadToMorse extends Thread {
    private JTextArea mostrar;

    public ThreadToMorse(JTextArea mostrar) {
        this.mostrar = mostrar;
    }


    @Override
    public void run(){
        while(true){
            try{
                Thread.sleep(1000); 
                this.traducirM();   
                
            }catch(Exception e){}
        }
    }
    public synchronized void traducirM(){   //Sincronizada, comparte el recurso de RandomWord con el ThreadToASCII
        String palabra= null;
        View toTextArea = new View();
        toMorse tm = new toMorse();     
        palabra = RandomWord.generate();    
        palabra = tm.aMorse(palabra);       //Se llama al método de la clase traductora.
        mostrar.append(palabra);            //Se concatena traducción...
        toTextArea.setOut(mostrar);         //Se settea en el JTextField de la ventana de la aplicación.
    }
}
