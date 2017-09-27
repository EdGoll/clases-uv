import java.io.IOException;

public class ThreadToMorse extends Thread{	
		
	View vInt;
	private String nom;
	private int i;
	
		public ThreadToMorse(String nom, View vInt){
			this.nom= nom;
			this.vInt= vInt;
				
		}
		@Override
		public void run(){
			for(;;){
				System.out.println(nom+" : "+i);
				Amorse amorse = new Amorse();
				
				try {
					escribir();
					try{
					Thread.sleep(1000);
					}catch (Exception e) {
						// TODO: handle exception
					}
				} catch (Exception e) {
				}
				i++;
			}
		}
		public void escribir() throws IOException{
			 vInt.escribir(nom+" : "+vInt);
			
		 } 
}
		 
	