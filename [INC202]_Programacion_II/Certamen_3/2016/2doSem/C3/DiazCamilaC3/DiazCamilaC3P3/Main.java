


public class Main {

    public static void main(String[] args) {    
        Autobus bus=new Autobus();
        HiloSubirPasajeros sp = new HiloSubirPasajeros(bus);
        HiloBajarPasajeros bp = new HiloBajarPasajeros(bus);
        sp.start();
        bp.start();
        
    }
    
}
