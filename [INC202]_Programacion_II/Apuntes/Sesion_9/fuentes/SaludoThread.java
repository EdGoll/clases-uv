public class SaludoThread extends Thread {
    public SaludoThread(String nombre){
        super(nombre);
    }
    public void run(){
        System.out.println(getName() + " : iniciando ...");
        for(int i = 0; i < 10000000; i++){
            if ((i % 1000000) == 0){
                System.out.println(getName() + " : dice hola ...");
            }
            //yield();
        }
        System.out.println(getName() + " : finalizando ...");
    }
}
