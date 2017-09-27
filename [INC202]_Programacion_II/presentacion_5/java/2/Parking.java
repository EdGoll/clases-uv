public class Parking {

    protected int espacios;
    protected int capacidad;

    public Parking(int n) {
        capacidad = espacios = n;
    }

    public synchronized void entra() {
        try {
            System.out.println("Entrando");
            while (espacios == 0) {
                System.out.println("Esperando");
                wait();
            }
            espacios--;
            notifyAll();
            System.out.println("Entro");
        } catch (InterruptedException ex) {

        }
    }

    public synchronized void sale() {
        try {
            System.out.println("Saliendo");
            while (espacios == capacidad) {
                System.out.println("Esperando");
                wait();
            }
            espacios++;
            notifyAll();
            System.out.println("Salio");
        } catch (InterruptedException ex) {

        }
    }
}
