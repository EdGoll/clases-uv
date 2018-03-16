public class Parking {

    protected int espaciosDisponibles;
    protected int capacidad;

    public Parking(int n) {
        capacidad = espaciosDisponibles = n;
    }

    public synchronized void entra() {
        try {
            System.out.println("Entrando");
            while (espaciosDisponibles == 0) {
                System.out.println("Esperando");
                wait();
            }
            espaciosDisponibles--;
            notifyAll();
            System.out.println("Entro");
        } catch (InterruptedException ex) {

        }
    }

    public synchronized void sale() {
        try {
            System.out.println("Saliendo");
            while (espaciosDisponibles == capacidad) {
                System.out.println("Esperando");
                wait();
            }
            espaciosDisponibles++;
            notifyAll();
            System.out.println("Salio");
        } catch (InterruptedException ex) {

        }
    }
}
