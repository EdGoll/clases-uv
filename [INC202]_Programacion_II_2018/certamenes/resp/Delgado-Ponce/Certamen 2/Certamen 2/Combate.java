import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Combate {
	
	//VARIABLES DE AYUDA
	protected int energiaMago = 100;
	protected int energiaGuerrero = 150;
	protected String gan = "";
	
	//CREACION DE LOS PERSONAJE
	public Guerrero guerrero = new Guerrero("Ragnar Lothbrok", energiaGuerrero, "Hacha");
	public Mago mago = new Mago("Houdinni", energiaMago, "Hechizo");	
	
	//ARCHIVOS

	File archivo = new File("Ataque.csv");
	File archivo2 = new File("Daño.csv");
	
	
	
	//ATAQUE MAGO	
	public synchronized void A_Mago() throws Throwable {
		
			//SE REALIZAN EL ATAQUE DEL MAGO
			System.out.println(mago.getNombre()+ " Ataca");
			guerrero.daño(mago.encantar());
			
			//SE MUESTRA EL NOMBRE Y ENERGIA DE CADA PERSONAJE.
			System.out.println(mago.getNombre()+" tiene una vida de: "+ mago.getEnergia());
			System.out.println(guerrero.getNombre()+" tiene una vida de: "+ guerrero.getEnergia() + "\n");
			
			energiaMago = mago.getEnergia();
			energiaGuerrero = guerrero.getEnergia();
			
			escribirAtaqueMago();
			escribirDañoGuerrero();
			
			notifyAll();
			wait();
	
		
	}
		
	//ATAQUE GUERRERO
	public synchronized void A_Guerrero() throws Throwable  {
		
			//SE REALIZA EL ATAQUE DEL GUERRERO.
			System.out.println(guerrero.getNombre()+ " Ataca");			
			mago.daño(guerrero.combatir());
					
			//SE MUESTRA EL NOMBRE Y ENERGIA DE CADA PERSONAJE.
			System.out.println(mago.getNombre()+" tiene una vida de: "+ mago.getEnergia());
			System.out.println(guerrero.getNombre()+" tiene una vida de: "+ guerrero.getEnergia() + "\n");
			
			energiaMago = mago.getEnergia();
			energiaGuerrero = guerrero.getEnergia();
			
			
			escribirAtaqueGuerrero();
			escribirDañoMago();
			
			notifyAll();
			wait();
		
	
	}
	
	//SE OBTIENE EL GANADOR DE LA BATALLA
	public String ganador() {
		
		
		if (mago.getEnergia() <= 0) {

			System.out.println("El ganador es: "+ guerrero.getNombre());
			gan = guerrero.getNombre();
			
		}
		else {

			System.out.println("El ganador es: "+ mago.getNombre());
			gan = guerrero.getNombre();
		}
		return gan;
		
	 }
			
	//ESCRIBIR LOS ATAQUES REALIZADOS POR EL MAGO
	public void escribirAtaqueMago() {

		try {	
			
			FileWriter escribir = new FileWriter(archivo,true);
			
			escribir.write ( mago.getNombre() + ";");
			escribir.write ( mago.tipoAtaque() + ";");
			escribir.write ( mago.valorAtaque() + ";");
			escribir.write("\n"); 
			escribir.close();
		}catch(Exception e){
			System.out.println("Error al escribir"+e.getMessage());
		}
		
	}
	
	//ESCRIBIR LOS ATAQUES REALIZADOS POR EL GUERRERO
	public void escribirAtaqueGuerrero() {
		try {	

			FileWriter escribir = new FileWriter(archivo,true);
			escribir.write ( guerrero.getNombre() + ";");
			escribir.write ( guerrero.tipoAtaque() + ";");
			escribir.write ( guerrero.valorAtaque() + ";");
			escribir.write("\n"); 
			escribir.close();
		}catch(Exception e){
			System.out.println("Error al escribir"+e.getMessage());
		}
	}
	
	//ESCRIBIR EL DAÑO RECIBIDO POR EL MAGO
	public void escribirDañoMago() {
		try {
			
			FileWriter escribir = new FileWriter(archivo2,true);
			escribir.write ( mago.getNombre() + ";");
			escribir.write ( guerrero.valorAtaque() + ";");
			escribir.write("\n"); 
			escribir.close();
		}catch(Exception e){
			System.out.println("Error al escribir"+e.getMessage());
		}
		
	}
	
	//ESCRIBIR EL DAÑO RECIBIDO POR EL GUERRERO
	public void escribirDañoGuerrero() {
		try {
			FileWriter escribir = new FileWriter(archivo2,true);
			escribir.write ( guerrero.getNombre() + ";");
			escribir.write ( mago.valorAtaque() + ";");
			escribir.write("\n"); 
			escribir.close();
		}catch(Exception e){
			System.out.println("Error al escribir"+e.getMessage());
		}
		
	}


}


	
		
	