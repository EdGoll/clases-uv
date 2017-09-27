


import java.util.Random;

public class bus {

    protected int espacios;
    protected int capacidad;

    public bus(int n) {

        capacidad = espacios = n;
    }

    public synchronized void entra() {
        int p_entran;
        Random rnd = new Random();
        try {
            System.out.println("Entrando");
            while (espacios == 0) {
                System.out.println("Esperando");
                wait();
            }
            p_entran=rnd.nextInt(10) + 1;
            // Si quedan espacios "negativos" vuelve a realizar en random
            while ( (espacios - (p_entran)) < 0 ){
                p_entran=rnd.nextInt(10) + 1;
                
            }
            espacios = espacios - (p_entran);

            notifyAll();
            System.out.println("Entro");
            System.out.println("-Espacios libres: "+espacios);

        } catch (InterruptedException ex) {

        }
    }

    public synchronized void sale() {
        int p_salen;
        Random rnd = new Random();
        System.out.println("Saliendo");
        try {
            while (capacidad == espacios) {
                System.out.println("Esperando");
                wait();
            }
            
            p_salen=rnd.nextInt(10) + 1;
            // Si entras "más" personas que la capacidad, se vuelve a realizar la suma
            while( (espacios + p_salen) > capacidad){
                p_salen=rnd.nextInt(10) + 1;
                
            }
            espacios= espacios + p_salen;
            
            notifyAll();
            System.out.println("Salio");
            System.out.println("-Espacios libres: "+ espacios);

        } catch (InterruptedException ex) {

        }
    }
}
