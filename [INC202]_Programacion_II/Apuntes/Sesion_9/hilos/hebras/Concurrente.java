package hebras;
public class Concurrente extends Thread {
    private Compartido compartido;
    private String valor;
    
    public Concurrente(String nombre, String valor, Compartido compartido) {
        super(nombre);
        this.valor = valor;
        this.compartido = compartido;
    }
    
    public void run(){
        for(int i = 0; i < 3; i++){
            synchronized(compartido){
                System.out.println(this.getName() + " : Colaca el valor : " + valor);
                compartido.setValor(valor);
                System.out.println(this.getName() + " : Obteniendo Valor : " + compartido.getValor());
            }
        }
    }
}
