public class Autobus {

    private int asientos;
    private int asientosDisp;
    private int pasajerosEsp;

    public Autobus(int n) {
        asientos = n;
        asientosDisp = n;
    }

    public synchronized void subir() {
        pasajerosEsp = ((int) ((Math.random() * 9) + 1));
        System.out.println("Estan esperando " + pasajerosEsp + " pasajeros");
        try {
            while (asientosDisp == 0) {
                System.out.println("No hay asientos disponibles, el autobus no paro\n");
                wait();
            }
            System.out.println("Subiendo pasajeros");
            asientosDisp -= pasajerosEsp;
            if (asientosDisp < 0) {
                System.out.println("Solo subieron " + (asientosDisp + pasajerosEsp) + " pasajeros");
                asientosDisp = 0;
            }
            Thread.sleep((long) (1 + (Math.random() * 4) * 1000));
            System.out.println("Asientos disponibles: " + asientosDisp);
            System.out.println("");
            notifyAll();
        } catch (InterruptedException ex) {
            System.out.println(ex.getMessage());
        }
    }

    public synchronized void bajar() {
        pasajerosEsp = ((int) ((Math.random() * 9) + 1));
        if ((pasajerosEsp + asientosDisp) > asientos) {
            pasajerosEsp = asientos - asientosDisp;
        }
        System.out.println("Bajaran " + pasajerosEsp + " pasajeros");
        try {
            while (asientosDisp == asientos) {
                System.out.println("No hay pasajeros en el autobus\n");
                wait();
            }
            System.out.println("Bajando pasajeros");
            asientosDisp += pasajerosEsp;
            Thread.sleep((long) (1 + (Math.random() * 4) * 1000));
            System.out.println("Asientos disponibles: " + asientosDisp);
            System.out.println("");
            notifyAll();
        } catch (InterruptedException e) {
            System.out.println(e.getMessage());
        }
    }
}
