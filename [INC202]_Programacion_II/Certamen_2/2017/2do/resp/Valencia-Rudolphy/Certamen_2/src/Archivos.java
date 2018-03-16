import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Archivos {
	
	File archivo= new File("ataque.csv");
	Pelea p = new Pelea();
	public void Ataquesg() throws IOException{
		try {			
			FileWriter escribir = new FileWriter(archivo,true);
			escribir.write("\n"+p.g.nombre+";"+p.g.tipoAtaque()+";"+p.g.daño());

			escribir.close();			
		}catch(Exception e) {
			System.out.println("Error al escribir"+e.getMessage());
		}
		
	}
	public void Ataquesm() throws IOException{
		try {		
			FileWriter escribir = new FileWriter(archivo,true);
			escribir.write("\n"+p.m.nombre+";"+p.m.tipoAtaque()+p.m.daño());
			escribir.close();			
		}catch(Exception e) {
			System.out.println("Error al escribir"+e.getMessage());
		}
		
	}

	/*public void danioGuerrero() throws IOException{
		try {
			File archivo= new File("danio.csv");
			FileWriter escribir = new FileWriter(archivo,true);
			
			escribir.close();
			
		}catch(Exception e) {
			System.out.println("Error al escribir"+e.getMessage());
		}
		
	}*/

}
