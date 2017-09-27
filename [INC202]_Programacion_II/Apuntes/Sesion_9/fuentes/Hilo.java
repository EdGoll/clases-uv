public class Hilo  extends Thread {
    private boolean finalizar = false;
    public void run(){
        while (!finalizar){
            try {
                System.out.println(getName() + " : Ejecutando el thread ... ");
                sleep(1000);
            } catch (InterruptedException ex){
                System.out.println(getName() + " : ME DESPERTARON");
            }
        }
    }
    
    public void finalizar(){finalizar = true;};
}
