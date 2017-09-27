public class threadMorse extends Thread {
    View vi= new View();
    AMorse am = new AMorse();
    private int i = 0;
	@Override
	public void run() {
                        for(;;)
                        System.out.println(am.Transformacion(vi.generar()));

	}	 
}