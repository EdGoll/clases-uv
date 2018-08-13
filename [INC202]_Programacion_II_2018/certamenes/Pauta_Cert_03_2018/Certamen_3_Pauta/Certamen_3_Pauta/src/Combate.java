public class Combate {

    protected int espaciosDisponibles;
    protected int capacidad;


    public synchronized void combatirMago(Personaje p,Personaje rival) throws InterruptedException {
    	p.atacar(rival);
    	notifyAll();
    	wait();
    }
    
    public synchronized void combatirGuerrero(Personaje p,Personaje rival) throws InterruptedException {
    	p.atacar(rival);
    	notifyAll();
    	wait();
    }

}
