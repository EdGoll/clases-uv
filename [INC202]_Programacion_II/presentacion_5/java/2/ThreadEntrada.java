public class ThreadEntrada extends Thread {

    protected Parking parking;

    public ThreadEntrada(Parking parking) {
        this.parking = parking;
    }


    public void run() {
        while (true) {
            parking.entra();
        }
    }
}
