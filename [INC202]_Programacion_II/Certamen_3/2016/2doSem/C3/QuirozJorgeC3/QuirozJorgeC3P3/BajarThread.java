import java.util.Random;

public class BajarThread extends Thread{
	private Bus b;
	Random r = new Random();

	public BajarThread(Bus b){
		this.b=b;
	}

	@Override
	public void run(){
		while (true){ 
			try{
				b.bajar((r.nextInt(9))+1);
				Thread.sleep((r.nextInt(5)+1)*1000);
			}
			catch (InterruptedException ex){
			System.out.println(ex.getMessage());
		} 
	}
}
}