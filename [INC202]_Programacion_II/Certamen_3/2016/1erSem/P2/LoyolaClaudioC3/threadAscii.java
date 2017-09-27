public class threadAscii extends Thread {
    View vi= new View();
    Aascii as = new Aascii();
	@Override
	public void run() {
                       for(;;)                       
                        System.out.println(as.ascii(vi.generar()));	
	}	 
}
