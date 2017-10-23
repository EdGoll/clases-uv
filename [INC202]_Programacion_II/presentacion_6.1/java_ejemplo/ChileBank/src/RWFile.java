import java.io.*;
import java.util.List;

public class RWFile {

	public List<Persona> readfile(){

		File archivo = null;
		FileReader fileReader = null;
		BufferedReader br = null;
		try{
			archivo = new File("dataset-chilebank.csv");
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
		return null;
	}


	public void writefile(){
        FileWriter fichero = null;
        PrintWriter pw = null;
        try
        {
            fichero = new FileWriter("archivo.txt");
            pw = new PrintWriter(fichero);

            for (int i = 0; i < 10; i++)
                pw.println("Linea " + i);

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
           try {
           if (null != fichero)
              fichero.close();
           } catch (Exception e2) {
              e2.printStackTrace();
           }
        }
    }

}
