import java.io.IOException;

import Interfaz.Tabla;

public class Inicializadora {

	public static void main(String[] args) throws IOException {
		Pelea p = new Pelea();
		Archivos ar = new Archivos();
		ThreadGuerrero tg = new ThreadGuerrero(p,ar);
		ThreadMago tm = new ThreadMago(p,ar);
		Tabla aplicacion =  new Tabla();
		
		tg.start();
		tm.start();
		ar.Ataquesg();
		ar.Ataquesm();
		try {
            tg.join();
            tm.join();
        } catch (InterruptedException ex) {
        
        }
		
				
	}

}
