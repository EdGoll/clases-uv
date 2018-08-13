public class ThreadGuerrero extends Thread {

    protected Personaje rival;
    private Combate comb;
    private Personaje p;

    public ThreadGuerrero(Personaje p, Personaje rival, Combate comb) {
        this.rival = rival;
        this.p=p;
        this.comb = comb;
    }


    public void run() {
        while (true) {
        	try {
				comb.combatirGuerrero(p, rival);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
        }
    }
}
