
public class Pelea {	
	
	Guerrero g = new Guerrero("Guerrero", 150, "arma");
	Mago m = new Mago("Mago", 100, "hechizo");
	

		public synchronized void ataqueGuerrero() {
			try {
				if(m.energia>0) {
					System.out.println("El guerrero ataca\n");
					m.energia = m.energia - g.combatir();						
					System.out.println("La energia del mago es: "+m.energia);
					System.out.println("Energia de el propia: "+g.energia+"\n");
				
				}								
				notify();
				wait();
			}catch(Exception e) {			
			}
		}
	
		public synchronized void ataqueMago() {
			try {
				if(g.energia>0) {
					System.out.println("El mago ataca\n");	
					g.energia = g.energia - m.encantar();			
					System.out.println("La energia del guerrero es: "+g.energia);
					System.out.println("Energia de el propia: "+m.energia+"\n");
				
				}												
				notify();
				wait();			
			}catch(Exception e) {			
			}	
		}
		public void ganador() {
			if(m.getEnergia()<=0) {
					System.out.print( "El ganador es el: "+g.getNombre()+"\n");
			}else {
				if(g.getEnergia()<=0) {
					System.out.print( "El ganador es el: "+m.getNombre()+"\n");					
				}
			}
		}
		
}

	
