public class ThreadMago extends Thread {


    protected Personaje rival;
    private Combate comb;
    private Personaje p;

    public ThreadMago(Personaje p, Personaje rival, Combate comb) {
        this.rival = rival;
        this.p=p;
        this.comb = comb;
    }


    public void run() {
        while (true) {
        	try {
				comb.combatirMago(p,rival);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
        }
    }
}
