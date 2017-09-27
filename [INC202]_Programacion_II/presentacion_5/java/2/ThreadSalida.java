public class ThreadSalida extends Thread {

    protected Parking parking;

    public ThreadSalida(Parking parking) {
        this.parking = parking;
    }

    @Override
    public void run() {
        while (true) {
            parking.sale();
        }
    }
}
