import java.util.List;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Region 
{
    private List<Provincia> pr = new ArrayList<>();
    private List<String> lineas;
    private StringTokenizer st;
    private String idRegion, nombreRegion, numeroRomano;
    private int ordenGeoReg;
    private Scanner sc;
    
    public Region(String idRegion,String nombreRegion, String numeroRomano, String ordenGeoReg)
    {
        this.idRegion = idRegion;
        this.nombreRegion = nombreRegion;
        this.numeroRomano = numeroRomano;
        this.ordenGeoReg = Integer.parseInt(ordenGeoReg);
    }
    
    public void setIdRegion(String idRegion)
    {
        this.idRegion = idRegion;
    }
    public void setNombreRegion(String nombreRegion)
    {
        this.nombreRegion = nombreRegion;
    }
    public void setNumeroRomano(String numeroRomano)
    {
        this.numeroRomano = numeroRomano;
    }
    public void setOrdenGeoReg(int ordenGeoReg)
    {
        this.ordenGeoReg = ordenGeoReg;
    }
    
    public String getIdRegion()
    {
        return idRegion;
    }
    public String getNombreRegion()
    {
        return nombreRegion;
    }
    public String getNumeroRomano()
    {
        return numeroRomano;
    }
    public int getOrdenGeoReg()
    {
        return ordenGeoReg;
    }
    
    public void cargarProvincia(String idRegion)
    {
        String idProvincia,nombreProvincia,idRegionCheck;//Checkeo si las regiones son iguales con regioncheck
        Provincia p = null;
        lineas = FuenteDatos.leerArchivo("Provincia.csv");
        for(String linea : lineas)
        {
            st = new StringTokenizer(linea,";");
            if(st.hasMoreElements())
            {
                idProvincia = st.nextToken();
                nombreProvincia = st.nextToken();
                idRegionCheck = st.nextToken();
                if (idRegion.equals(idRegionCheck))
                {
                    p = new Provincia(idProvincia,nombreProvincia,idRegion);
                    p.cargarComuna(p.getIdProvincia());
                    pr.add(p);
                    
                }
                st.nextToken();//Provincia.csv posee un dato extra no especificado en la pauta, por lo que lo salto en vez de modificar el archivo
            }
        }
    }
    public String mostrarProvincia()
    {
        int ch = 0;
        Provincia pro = null;
        System.out.println("\nIngrese la provincia: ");
        for(int i = 0; i < pr.size();i++)
        {
            pro = pr.get(i);
            System.out.println((i+1) + pro.toString());
            
        }
        while(ch < 1 || ch > pr.size()+1)
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
            if(ch < 1 || ch > pr.size()+1)
            {
                System.out.println("Error, ingrese un valor nuevamente: ");
            }
        }
        pro = pr.get(ch-1);
        System.out.println("Estas son las comunas que se encuentran en esta provincia: \nIngrese la comuna: ");
        return pro.mostrarComuna();
    }
    @Override
    public String toString()
    {
        return ordenGeoReg +")Región "+numeroRomano+ " "+nombreRegion +" "+ idRegion;
                
    }    
}
