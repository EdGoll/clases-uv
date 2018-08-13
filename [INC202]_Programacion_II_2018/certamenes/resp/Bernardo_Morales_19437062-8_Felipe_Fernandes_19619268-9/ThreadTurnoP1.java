

public class ThreadTurnoP1 extends Thread{

	private Peleadores peleador = new Peleadores();
	
	public ThreadTurnoP1(Peleadores peleador) {
		this.peleador=peleador;
	}
	
	public void run() {
		while(peleador.g.getEnergia() > 0 || peleador.m.getEnergia() > 0) {
			try {
				peleador.turnoGuerrero();
				ThreadTurnoP1.sleep(3000);
			}catch(InterruptedException ex) {
			}
		}
	}
}
