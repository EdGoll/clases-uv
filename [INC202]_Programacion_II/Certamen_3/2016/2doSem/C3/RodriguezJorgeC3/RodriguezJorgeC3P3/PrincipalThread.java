import java.util.Random;

public class PrincipalThread {

   public static void main(String[] args) {
       
       Autobus a = new Autobus(45);

       ThreadEntrada te = new ThreadEntrada(a);
       ThreadSalida ts = new ThreadSalida(a);

       te.start();
       ts.start();
   }
}
