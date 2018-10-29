import java.util.ArrayList;
import java.util.List;

public class Combate {
	Guerrero javi = new Guerrero("javi", 150);
	Mago felipe = new Mago("felipe", 100);
	List<String> lineas1 = new ArrayList<String>();
	List<String> lineas2 = new ArrayList<String>();
	FuenteDeDatos archivo = new FuenteDeDatos();
	
	public synchronized void jugadaGuerrero(int aleatorio1) {
    	try {
    		System.out.println("Guerrero atacando");
    		int energiaMago = felipe.getEnergia();
    		String arma = javi.combatir(aleatorio1);
    		if(arma.equals("Golpe Directo")) {
    			System.out.println(javi.getNombre() +  " ataca con : " + arma);
    			energiaMago = (energiaMago - 20);
    			System.out.println(felipe.getNombre() + " pierde 20 de energia");
    			felipe.setEnergia(energiaMago);
    			String danioI = "Guerrero;Golpe Directo;20";
    			String danioR = "Mago;20";
    			lineas1.add(danioI);
    			lineas2.add(danioR);
    			//wait();
    			notifyAll();
    		}else {
    			if(arma.equals("Giro Letal")) {
    				System.out.println(javi.getNombre() +  " ataca con : " + arma);
    				energiaMago = (energiaMago - 30);
    				System.out.println(felipe.getNombre() + " pierde 30 de energia");
    				felipe.setEnergia(energiaMago);
    				String danioI = "Guerrero;Giro Letal;30";
        			String danioR = "Mago;30";
        			lineas1.add(danioI);
        			lineas2.add(danioR);
    				//wait();
    				notifyAll();
    			}else {
    				if(arma.equals("Super Arma")){
    					System.out.println(javi.getNombre() +  " ataca con : " + arma);
    					energiaMago = (energiaMago - 70);
    					System.out.println(felipe.getNombre() + " pierde 70 de energia");
    					felipe.setEnergia(energiaMago);
    					String danioI = "Guerrero;Super Arma;70";
    	    			String danioR = "Mago;70";
    	    			lineas1.add(danioI);
    	    			lineas2.add(danioR);
    					//wait();
    					notifyAll();
    				}else {
    					System.out.println(javi.getNombre() + " pierde turno ");
    					//wait();
    					notifyAll();
    				}
    			}
    		}
    		//notifyAll();
    		while(energiaMago <= 0 || javi.getEnergia() <= 0) {
    			wait();
    		}
    	}catch(InterruptedException ex) {
    		
    	}
    }
    
    public synchronized void jugadaMago(int aleatorio2) {
    	try {
    		System.out.println("Mago atacando");
    		int energiaG = javi.getEnergia();
    		String poder = felipe.encantar(aleatorio2);
    		if(poder.equals("Llamarada")) {
    			System.out.println(felipe.getNombre() +  " ataca con : " + poder);
    			energiaG = (energiaG - 20);
    			System.out.println(javi.getNombre() + " pierde 20 de energia");
    			javi.setEnergia(energiaG);
    			String danioI = "Mago;Llamarada;20";
    			String danioR = "Guerrero;20";
    			lineas1.add(danioI);
    			lineas2.add(danioR);
    			//wait();
    			notifyAll();
    		}else {
    			if(poder.equals("Incendio")) {
    				System.out.println(felipe.getNombre() +  " ataca con : " + poder);
    				energiaG = (energiaG - 35);
    				System.out.println(javi.getNombre() + " pierde 35 de energia");
    				javi.setEnergia(energiaG);
    				String danioI = "Mago;Incendio;35";
        			String danioR = "Guerrero;35";
        			lineas1.add(danioI);
        			lineas2.add(danioR);
    				//wait();
    				notifyAll();
    			}else {
    				if(poder.equals("Explosion")){
    					System.out.println(felipe.getNombre() +  " ataca con : " + poder);
    					energiaG = (energiaG - 60);
    					System.out.println(javi.getNombre() + " pierde 60 de energia");
    					javi.setEnergia(energiaG);
    					String danioI = "Mago;Explosion;60";
    	    			String danioR = "Guerrero;60";
    	    			lineas1.add(danioI);
    	    			lineas2.add(danioR);
    					//wait();
    					notifyAll();
    				}else {
    					System.out.println(felipe.getNombre() + " pierde turno ");
    					//wait();
    					notifyAll();
    				}
    			}
    		}
    		while(energiaG <= 0 || felipe.getEnergia() <= 0) {
    			wait();
    		}
    	}catch(InterruptedException ex) {
    		
    	}
    }
    
    public void archivos() {
    	archivo.escribirArchivo("ataque.csv", lineas1, true);
    	archivo.escribirArchivo("danio.csv", lineas2, true);
    };
}