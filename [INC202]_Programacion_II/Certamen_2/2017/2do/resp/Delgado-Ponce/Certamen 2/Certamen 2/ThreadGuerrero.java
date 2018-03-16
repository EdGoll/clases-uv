

public class ThreadGuerrero extends Thread {

    private final Combate combate;
    private JFAbrirArchivo bb = new JFAbrirArchivo();

    public ThreadGuerrero(Combate combate) {
        this.combate = combate;
    }

    public void run() {
    	
       do {
            try {
                ThreadGuerrero.sleep(1000);
                combate.A_Guerrero();
               
            } catch (Throwable e) {
            	
				e.printStackTrace();
			}
        }
       while (combate.energiaMago > 0 && combate.energiaGuerrero  > 0 ); {
    	
    	   combate.ganador();
    	   
    	   new JFAbrirArchivo().setVisible(true);
       }
    }
}



