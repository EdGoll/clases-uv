

public class ThreadTurnoP2 extends Thread{

	private Peleadores peleador = new Peleadores();
	
	public ThreadTurnoP2(Peleadores peleador) {
		this.peleador=peleador;
	}
	
	public void run() {
		while(peleador.g.getEnergia() > 0 || peleador.m.getEnergia() > 0) {
			try {
				peleador.turnoMago();
				ThreadTurnoP2.sleep(3000);
			}catch(InterruptedException ex) {
			}
		}
	}
}
