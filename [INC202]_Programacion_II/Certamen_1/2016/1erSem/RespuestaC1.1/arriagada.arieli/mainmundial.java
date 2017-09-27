import JavaBeans.Country;
import java.io.DataInputStream;
import java.io.FileInputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class Mainmundial {

    public void mapeo{
        FileInputStream fis = new FileInputStream("MundialResultados.txt");
        DataInputStream dis = new DataInputStream(fis);

        StringTokenizer stk;
        String linea = dis.readLine();
        Pais c;
        List<Pais> listaPaises = new ArrayList<Pais>();

        while (linea != null) {
            stk = new StringTokenizer(linea, "*");
            c = new Pais();
            c.setNombre(stk.nextToken());
            c.setCodigo(stk.nextToken());
            c.setCapital(stk.nextToken());
            c.setProvincia(stk.nextToken());
            c.setArea(Integer.valueOf(stk.nextToken()));
            c.setPoblacion(Integer.valueOf(stk.nextToken()));
            listaPaises.add(c);
            linea = dis.readLine();
        }
        for (Pais pais : listaPaises) {           
            System.out.println(pais.getName());
          
        }



    }
    public static void main(String[] args) throws Exception {

        
       
    }
}
