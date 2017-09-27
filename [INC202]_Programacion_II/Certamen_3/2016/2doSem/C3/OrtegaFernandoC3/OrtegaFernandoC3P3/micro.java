
public class micro {

    private int gente = 0;
    private int temp = 0;

    public synchronized void entrar(int paradero) { 
        temp += paradero;
        try {
            while (temp >= 46) {
                wait();
            }
            gente += paradero;
            System.out.println("entraron " + paradero +" Personas y hay: " + gente+" personas en la micro");
            notifyAll();
        } catch (InterruptedException ex) {
        }
    }

    public synchronized void salir(int paradero) {
        temp -= paradero;
        try {
            while (temp <= 0) {
                wait();
            }
            gente -= paradero;
            System.out.println("salieron " + paradero +" personas y hay:  " + gente+" personas en la micro");
            notifyAll();
        } catch (InterruptedException ex) {
        }
    }

   /* private int getSaldo() {
        return saldo;
    }
*/
}
