


public class Certamen3 {

 
    public static void main(String[] args) {
        Bus user = new Bus();
        SubiryBajar Subir = new SubiryBajar(true, user);
        SubiryBajar Bajar = new SubiryBajar(false, user);
        
        Thread Sub = new Thread(Subir);
        Thread Baj = new Thread(Bajar);
        Sub.start();
        Baj.start();
    }
    
}