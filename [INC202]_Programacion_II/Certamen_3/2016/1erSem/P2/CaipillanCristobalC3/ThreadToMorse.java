



public class ThreadToMorse extends Thread{

	private String palabra;
	String palabraTraducida;
	View a;
	public int i;
	
	public ThreadToMorse( View a){
		
		this.a = a;
	}

	@Override
	public void run() {


		AMorse morse=new AMorse();
		for(;;){
			palabra =RandomWord.generate();
			try {
				
				palabraTraducida = morse.traducirAMorse(palabra);
				
				llamar();
				
				
			} catch (Exception e) {
			}
			
			i++;
		}
	}
	 public void llamar() 	throws Exception{
		 a.llamar(palabraTraducida);
	 }
}
