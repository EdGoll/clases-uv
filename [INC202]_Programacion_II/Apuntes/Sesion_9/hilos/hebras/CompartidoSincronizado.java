package hebras;

public class CompartidoSincronizado extends Compartido {
    private boolean listo = false;
    
    public synchronized void setValor(String valor){
        while (listo){
            try {
                System.out.println("Esperando para colocar ...");
                wait();
            } catch (InterruptedException ex) {
                ex.printStackTrace();
            }
        }
        super.setValor(valor);
        
        listo = true;
        System.out.println("Notificando Colocar Listo ...");
        notify();
    }
    
    public synchronized String getValor(){
        while (!listo){
            try {
                System.out.println("Esperando para Obtener ...");
                wait();
            } catch (InterruptedException ex) {
                ex.printStackTrace();
            }
        }
        
        listo = false;
        System.out.println("Notificando Obtener Listo ...");
        notifyAll();
        
        return super.getValor();
    }
}
