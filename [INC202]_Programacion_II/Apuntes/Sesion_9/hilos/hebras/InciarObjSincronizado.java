package hebras;
public class InciarObjSincronizado {
    public static void main(String[] args) {
        Compartido compartido = new Compartido();
        
        Thread t1 = new Concurrente("RVV", "** RVV **", compartido);
        Thread t2 = new Concurrente("EMA", "** EMA **", compartido);
        Thread t3 = new Concurrente("MAX", "** MAX **", compartido);

        t1.start();
        t2.start();
        t3.start();
    }
    
}
