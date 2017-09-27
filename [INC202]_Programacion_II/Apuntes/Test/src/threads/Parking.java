package threads;

public class Parking {

    private static int CAPACIDAD_TOTAL = 5;
    private static int numVehiculos = 0;

    public synchronized void entrar() {
        try {
            System.out.println("INTENTADO ENTRAR VEHICULO " + (numVehiculos + 1));
            while (numVehiculos >= CAPACIDAD_TOTAL) {
                System.out.println("ESPERANDO A QUE SALGA UN VEHICULO...");
                wait();
            }
            System.out.println("INGRESO " + (numVehiculos + 1));
            numVehiculos++;
        } catch (InterruptedException ex) {
        }
    }

    public synchronized void salir() {
        numVehiculos--;
        System.out.println("SACANDO AUTOMOVIL");
        notifyAll();
    }

    public synchronized int consultar() {
        return numVehiculos;
    }
}
