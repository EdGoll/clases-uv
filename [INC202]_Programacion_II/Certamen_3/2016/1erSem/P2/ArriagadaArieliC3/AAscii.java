
import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class AAscii {

	private char[] abecedario = {'A','B','C','D','E','F','G','H','I','J','K','L','M','N','O','P','Q','R','S','T','U','V','W','X','Y','Z','0','1','2','3','4','5','6','7','8','9'};
	private String[] letrasAsci = {"&#65","&#66","&#67","&#68","&#69","&#70","&#71","&#72","&#73","&#74","&#75","&#76","&#77","&#78","&#79","&#80","&#81","&#82","&#83","&#84","&#85","&#86","&#87","&#88","&#89","&#48","&#49","&#50","&#51","&#52","&#53","&#54","&#55","&#56","&#57"};
	private List<String> aTraducir;
	private List<String> resultado;
		
	public AAscii(List<String> aTraducir, String ubicacion) {
		this.aTraducir = new ArrayList<String>();
		this.resultado = new ArrayList<String>();
		this.aTraducir = aTraducir;
		for(String linea : aTraducir){
			String txtLin = "";
			StringTokenizer st = new StringTokenizer(linea, " ");
			while(st.hasMoreTokens()){
				txtLin += traducir(st.nextToken().toUpperCase());
				if(st.hasMoreTokens()){
					txtLin += " / ";
				}
			}
			resultado.add(txtLin);
		}
		escribirArchivo(ubicacion, resultado);
	}
	private void escribirArchivo(String nombreArchivo, List<String> lineas){
		FileWriter archivo = null;
		PrintWriter impresion = null;
		try {
			archivo = new FileWriter(nombreArchivo,false);
			impresion = new PrintWriter(archivo);	
			for(String linea : lineas){
				impresion.println(linea);
			}
		} catch (Exception e) {
			System.out.println(e);
		}finally {
			impresion.close();
		}
	}
	private String traducir(String palabra){
		String compuesta="";
		for(int j=0;j<palabra.length();j++){
			char letra = palabra.charAt(j);
			for(int i=0; i<letrasAsci.length;i++){
				if(letra == abecedario[i]){
					compuesta += letrasAsci[i];
					if(j!= palabra.length()-1){
						compuesta += " ";
					}
					break;
				}
			}
		}	
		return compuesta;
	}
}

