package hebras;

public class Colocar implements Runnable {
    private String nombre;
    private Compartido compartido;
    
    public Colocar(String nombre, Compartido compartido) {
        this.nombre = nombre;
        this.compartido = compartido;
    }
    
    public void run() {
        for(int i = 0; i < 3; i++){
            System.out.println(nombre + " : Colocando valor " + nombre + "_" + i);
            compartido.setValor(nombre + "_" + i);
        }
        System.out.println(nombre + " : Finalizando COLOCAR ...");
    }
}