import java.util.Random;

public class SubirThread extends Thread{
	private Bus b;
	Random r = new Random();

	public SubirThread(Bus b){
		this.b=b;
	}

	@Override
	public void run(){
		while (true){ 
			try{
				b.subir((r.nextInt(9))+1);
				Thread.sleep((r.nextInt(5)+1)*1000);
			}
			catch (InterruptedException ex){
			System.out.println(ex.getMessage());
		} 
	}
}
}