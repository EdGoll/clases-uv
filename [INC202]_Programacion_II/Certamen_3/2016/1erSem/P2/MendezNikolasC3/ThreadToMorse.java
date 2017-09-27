
public class ThreadToMorse extends Thread{
	public static toMorse tomorse;
	
	public void run(){	
		
		for(;;) {
				tomorse = new toMorse(RandomWord.generate());
			}
	}
}
