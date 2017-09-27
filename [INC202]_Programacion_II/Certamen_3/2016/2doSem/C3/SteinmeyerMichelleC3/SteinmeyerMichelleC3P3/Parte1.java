

public class Parte1 {
    
    public static void main(String[] args) {
        bus Bus = new bus(45);
        
        ThreadSuben ts = new ThreadSuben(Bus);
        ThreadBajan tb = new ThreadBajan(Bus);
        
        ts.start();
        tb.start();
        
    }
    
}
