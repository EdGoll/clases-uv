

public class ThreadToASCII extends Thread{
    View v ;
    String aux;
    Traductor t = new Traductor();
        public ThreadToASCII(View v){
	this.v = v;
	}

    @Override
	public void run() {
        try{

             aux = t.ASCII().toUpperCase();
             v.escribir(aux);

              sleep(2000);
        }catch(InterruptedException ex){}
	}
}
