
public class ThreadToMorse extends Thread{
    View v ;
    String aux;
    Traductor t = new Traductor();
        public ThreadToMorse(View v){
	this.v = v;
	}

    	@Override
	public void run() {
            try{
             aux = t.Morse();
             v.escribir(aux);

             sleep(2000);
            }catch(InterruptedException ex){}
	}
}
