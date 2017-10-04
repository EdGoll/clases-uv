public class ThreadSalida extends Thread {

    protected Parking parking;

    public ThreadSalida(Parking parking) {
        this.parking = parking;
    }


    public void run() {
        while (true) {
            parking.sale();
        }
    }
}
