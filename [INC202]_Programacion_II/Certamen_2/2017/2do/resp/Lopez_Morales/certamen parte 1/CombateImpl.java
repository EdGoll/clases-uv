
public class CombateImpl {
	public static void main(String[] args) {
		Combate combate = new Combate();
		
		ThreadGuerrero tg = new ThreadGuerrero(combate);
		ThreadMago tm = new ThreadMago(combate);
		
		tg.start();
		tm.start();
		combate.archivos();
	}
}
