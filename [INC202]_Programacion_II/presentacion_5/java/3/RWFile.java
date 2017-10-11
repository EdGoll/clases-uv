import java.io.*;

public class RWFile {

	public void readfile(){
		File archivo = null;
		FileReader fileReader = null;
		BufferedReader br = null;
		try{
			archivo = new File("archivo.txt");
			String linea;
			fileReader = new FileReader(archivo);
			br = new BufferedReader(fileReader);
			while((linea = br.readLine())!=null){
				System.out.println(linea);
			}
		}catch(IOException ex){
		}
		finally{
			try {
				br.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}


	public void writefile(String mensaje){
        FileWriter fichero = null;
        PrintWriter pw = null;
        try{
            fichero = new FileWriter("archivo.txt",true);
            pw = new PrintWriter(fichero);
            pw.println(mensaje);
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
           try {
	           if (null != fichero){
	              fichero.close();
							}
	         } catch (Exception e2) {
	              e2.printStackTrace();
	         }
       }
    }

}
