import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class FileWrite  {
	//ARCHIVOS
	public File archivo = new File("Ataque.csv");
	public File archivo2 = new File("daño.csv");
	public Combate d = new Combate();
	
	//ESCRIBIR LOS ATAQUES REALIZADOS POR EL MAGO
	public void escribirAtaqueMago() throws IOException {
		
		try {
			FileWriter escribir = new FileWriter(archivo,true);
			escribir.write ( d.mago.getNombre() + ";");
			escribir.write (d.mago.tipoAtaque() + ";");
			escribir.write ( d.mago.valorAtaque() + ";");
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
			escribir.write ( d.guerrero.getNombre() + ";");
			escribir.write ( d.guerrero.tipoAtaque() + ";");
			escribir.write ( d.guerrero.valorAtaque() + ";");
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
			escribir.write ( d.mago.getNombre() + ";");
			escribir.write ( d.guerrero.valorAtaque() + ";");
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
			escribir.write ( d.guerrero.getNombre() + ";");
			escribir.write ( d.mago.valorAtaque() + ";");
			escribir.write("\n"); 
			escribir.close();
		}catch(Exception e){
			System.out.println("Error al escribir"+e.getMessage());
		}
				
	}
}

