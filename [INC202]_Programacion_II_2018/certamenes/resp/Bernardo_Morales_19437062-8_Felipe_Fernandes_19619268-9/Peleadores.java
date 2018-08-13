

public class Peleadores {

	Mago m = new Mago("Ivan",100,"piromansia");
	Guerrero g = new Guerrero("Hans",150,"espada");
	Suerte s = new Suerte();
	int dc;
	int turno = 0;
	public synchronized void turnoMago() {
		try {
			while(turno == 0) {
				wait();
			}
			int at = s.getNumero(4);
			int sp = s.getNumero(2);
			if(at < 3)m.setEnergia(m.getEnergia() - m.consumirEnergia(2));
			if(at == 2)m.setEnergia(m.getEnergia() + m.alimentarse(m.encantar(at,sp)));
			dc = m.encantar(at,sp);
			System.out.println(m.toString());
			g.setEnergia(g.getEnergia() - dc);
			turno=0;
			notifyAll();
		}catch(InterruptedException ex) {
		}
	}
	
	public synchronized void turnoGuerrero() {
		try {
			while(turno == 1) {
				wait();
			}
			int at = s.getNumero(4);
			if(at == 2) {
				g.setEnergia(g.getEnergia()-g.consumirEnergia(g.combatir(at)));
			}
			dc = g.combatir(at);
			System.out.println(g.toString());
			m.setEnergia(m.getEnergia() - dc);
			turno=1;
			notifyAll();
		} catch(InterruptedException ex) {
		}
	}
}
