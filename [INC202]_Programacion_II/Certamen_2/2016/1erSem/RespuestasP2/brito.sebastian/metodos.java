import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;

public class metodos {

	private String nombres, apellidoP, apellidoM;
	private int NQ1, NQ2, NQ3, NT1, NT2, Nnert1, Ncert2, Ncert3, nCon1, nCon2, Ncon3;
	
	//1-LEER EL ARCHIVOS ORIGINALES:
		public void leer(String ruta){
			
			try{
				FileReader fr = new FileReader(ruta);
				BufferedReader br = new BufferedReader(fr);
				String linea;
				
				while((linea=br.readLine())!=null){
					System.out.println(linea);
				}
				
				br.close();
				fr.close();
				System.out.println("El archivo" + ruta +  "se leyo correctamente\n");
				
			}catch(Exception ex){
				ex.printStackTrace();
			}
		
		}
	
		
	//2-CALCULAR NOTAS:

		public void calcular(){
			
		}
		
	//3-PASAR PROMEDIOS DE ALUMNOS A ARCHIVO:
		
		private File f;
		
		//A- CREAR ARCHIVO CONSOLIDADO.CSV:
		public void crear(){		
			try{
				f=new File("consolidado.csv");
				System.out.println("El archivo consolidado.csv se creo correctamente");
				
			}catch(Exception ex){
				ex.printStackTrace();
			}
		}
		
		//B- ESCRIBIR EN CONSOLIDADO.CSV:
		public void escribir(){	
			try{
				FileWriter fw = new FileWriter(f);
				fw.write(""); 
				fw.close();		
				
				System.out.println("El archivo consolidado.csv se escribio correctamente");
				
			}catch(Exception ex){
				ex.printStackTrace();
			}
		}
		

}