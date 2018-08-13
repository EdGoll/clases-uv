

public class Batalla {

	public static void main(String[] args) {
		
		Peleadores pl = new Peleadores();
		ThreadTurnoP1 t1 = new ThreadTurnoP1(pl);
		ThreadTurnoP2 t2 = new ThreadTurnoP2(pl);
		
		t1.start();
		t2.start();
		try {
			t1.join();
			t2.join();
		}catch(InterruptedException ex) {
		}
		
	}
}
