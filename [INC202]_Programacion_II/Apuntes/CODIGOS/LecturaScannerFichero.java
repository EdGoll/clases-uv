import java.io.File;
import java.util.Scanner;

public class LecturaScannerNext {
	
		public static void main( String [] arg) { 
		File fich = new File ("file://localhost/Users/taramasco/Desktop/clasesUV-2012/JAVA/codigosEx/fichero.txt");
		Scanner kyb = new Scanner(fich); 
			
			while (kyb.hasNextLine()){
			String linea = kyb.nextLine();
			System.out.println(linea);
			}
			kyb.close();
		} 
} 

