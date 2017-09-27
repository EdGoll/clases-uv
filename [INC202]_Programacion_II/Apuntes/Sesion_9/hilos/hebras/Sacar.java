package hebras;

public class Sacar implements Runnable {
    private String nombre;
    private Compartido compartido;

    public Sacar(String nombre, Compartido compartido) {
        this.nombre = nombre;
        this.compartido = compartido;
    }
    
    public void run() {
        //for(int i = 0; i < 3; i++){
            System.out.println(nombre + " : Obteniendo valor " + compartido.getValor() + " : " + Thread.currentThread().getName() );
        //}
        System.out.println(nombre + " : Finalizando SACAR ...");
    }
}