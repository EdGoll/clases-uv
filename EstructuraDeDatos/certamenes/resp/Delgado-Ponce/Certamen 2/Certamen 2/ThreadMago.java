public class ThreadMago extends Thread {

    private final Combate combate;
    private JFAbrirArchivo bb = new JFAbrirArchivo();
    public ThreadMago(Combate combate) {
        this.combate = combate;
    }
    
    public void run() {
        
		do {
            try {
            	ThreadMago.sleep((long) (1000));
            	combate.A_Mago();
            	
            } catch (InterruptedException ex) {
            	
            } catch (Throwable e) {
           
				e.printStackTrace();
			}
        }while ((combate.energiaMago > 0 && combate.energiaGuerrero  > 0 ));{
        	combate.ganador();
        	new JFAbrirArchivo().setVisible(true);
        }		
    }
}