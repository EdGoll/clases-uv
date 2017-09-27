public class BusMain{
	public static void main(String[] arg){
	Bus b = new Bus(45);
	SubirThread su = new SubirThread(b);
	BajarThread ba = new BajarThread(b);

	su.start();
	ba.start();

	}
}