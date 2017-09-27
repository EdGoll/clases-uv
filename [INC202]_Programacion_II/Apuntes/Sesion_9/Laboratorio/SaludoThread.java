
public class SaludoThread extends Thread {
    public SaludoThread(String nombre){
        super(nombre);
    }
    public void run(){
        System.out.println(getName() + " : iniciando ...");
        
        for(int i = 0; i < 10000000; i++) { // diez millones
            if ((i % 1000000) == 0){ // un millon
                System.out.println(getName() + " : HOLA ... ");
            }
        }
        
        System.out.println(getName() + " : finalizando ...");
    }
}