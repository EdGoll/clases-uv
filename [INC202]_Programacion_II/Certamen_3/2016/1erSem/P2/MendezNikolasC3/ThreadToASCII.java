

public class ThreadToASCII extends Thread {
	public static toASCII asc;
	
	public void run(){
		
		for(;;) {
				asc = new toASCII(RandomWord.generate());
			}
	}
}
