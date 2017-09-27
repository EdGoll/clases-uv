import java.util.StringTokenizer;
import java.util.List;
import java.util.ArrayList;
import java.util.Scanner;

public class Provincia
{
    private String idProvincia, nombreProvincia, idRegion;
    private List<String> lineas;
    private List<Comuna> co = new ArrayList<>();
    private StringTokenizer st;
    private Scanner sc;
    
    public Provincia(String idProvincia, String nombreProvincia, String idRegion)
    {
        this.idProvincia = idProvincia;
        this.nombreProvincia = nombreProvincia;
        this.idRegion = idRegion;
    }
    
    public void setIdProvincia(String idProvincia)
    {
        this.idProvincia = idProvincia;
    }
    public void setNombreProvincia(String nombreProvincia)
    {
        this.nombreProvincia = nombreProvincia;
    }
    public void setIdRegion(String idRegion)
    {
        this.idRegion = idRegion;
    }
    
    public String getIdProvincia()
    {
        return idProvincia;
    }
    public String getNombreProvincia()
    {
        return nombreProvincia;
    }
    public String getIdRegion()
    {
        return idRegion;
    }
    
    public void cargarComuna(String idProvincia)
    {
        String idComuna,nombreComuna,idProvinciaCheck;//Checkeo si las provincias son iguales con provinciaCheck
        Comuna c = null;
        lineas = FuenteDatos.leerArchivo("Comuna.csv");
        for(String linea : lineas)
        {
            st = new StringTokenizer(linea,";");
            if(st.hasMoreElements())
            {
                idComuna = st.nextToken();
                nombreComuna = st.nextToken();
                idProvinciaCheck = st.nextToken();
                if (idProvincia.equals(idProvinciaCheck)) //Si la comuna encontrada pertenece a la provincia entregada se añade
                {
                    c = new Comuna(idComuna,nombreComuna,idProvincia);
                    co.add(c);
                    
                }
            }
        }
    }
    public String mostrarComuna()
    {
        int ch = 0;
        Comuna c = null;
        if(co.isEmpty())
        {
            sc = new Scanner(System.in);
            System.out.println("Su comuna no se encuentra en la base de datos.\nPor favor ingrese la comuna manualmente: ");
            return sc.nextLine();
        }
        else
        {
            for(int i = 0; i < co.size();i++)
            {
                c = co.get(i);
                System.out.println((i+1)+ c.toString());
            }
            while(ch < 1 || ch > co.size()+1)
            {
                sc = new Scanner(System.in);
                if(sc.hasNextInt())
                {
                    ch = sc.nextInt();
                }
                else
                {
                System.out.println("Error, ha ingresado un valor no entero ");
                }
                if(ch < 1 || ch > co.size()+1)
                {
                    System.out.println("Error, ingrese un valor nuevamente: ");
                }
            }
        c = co.get(ch-1);
        return c.getNombreComuna();
        }
    }
    
    @Override
    public String toString()
    {
        return ") "+ "Provincia de " + nombreProvincia;
    }
}
