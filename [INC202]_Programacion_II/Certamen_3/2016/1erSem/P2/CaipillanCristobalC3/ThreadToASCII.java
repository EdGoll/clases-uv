



public class ThreadToASCII extends Thread{
	private String palabra;
	
	String palabraTraducida;
	View a;
	public int i;
	
	public ThreadToASCII( View a){
		
		this.a = a;
	}

	@Override
	
	public void run() {
		
		
		ToASCII ascii=new ToASCII();
		
		
		for(;;){
			palabraTraducida="";
			palabra =RandomWord.generate();
			try {
					
					 palabraTraducida =ascii.traducirAASCII(palabra);
					 llamar();
				
				
			} catch (Exception e) {
			}
			
			i++;
		}

	}
	 public void llamar() throws Exception{
		 a.llamar(palabraTraducida);
	 }
}
