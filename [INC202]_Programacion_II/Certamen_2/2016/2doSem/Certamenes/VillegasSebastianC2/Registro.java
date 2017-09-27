import java.util.List;
import java.util.ArrayList;
import java.util.StringTokenizer;
import java.util.Scanner;

public class Registro       //Punto C incompleto
{
    private List<String> lineas;
    private List<Region> r = new ArrayList<>();
    private StringTokenizer st;
    private Scanner sc;
    private List<String> asign;
    
    public Registro()
    {
        cargarRegion();
        System.out.print("Bienvenido, este programa le permitirá añadir personas pertenecientes a su Escuela a un registro automatizado.\n¿Qué tipo de persona está añadiendo?:\n1)Alumno\n2)Académico\n3)Funcionario\nSu elección:  ");
        addPersona();
    }
    
    public void cargarRegion()
    {
        Region re = null;
        lineas = FuenteDatos.leerArchivo("Region.csv");
        for(String linea : lineas)
        {
            st = new StringTokenizer(linea,";");
            if(st.hasMoreElements())
            {
                re = new Region(st.nextToken(),st.nextToken(),st.nextToken(),st.nextToken());
                re.cargarProvincia(re.getIdRegion());
                r.add(re);
                
            }
        }
        Region r1 = null,r2 = null;//BubbleSort con el orden geográfico
        for (int j=0; j<r.size(); j++)
        {
            for (int i=0; i < r.size()-1; i++) 
            {
                r1 = r.get(i);
                r2 = r.get(i+1);
                if(r1.getOrdenGeoReg()> r2.getOrdenGeoReg())
                {
                    r.set(i,r2);
                    r.set(i+1,r1);
                }
            }
        }
    }
    
    
    public void mostrarRegion()
    {
        Region re = null;
        for(int i = 0; i < r.size();i++)
        {
            re = r.get(i);
            System.out.println(re.toString());
        }
        System.out.print("Ingrese la región: ");
    }
    
    public void addPersona()
    {
        Region re;
        int ch = 0;
        String dni,nombre,apellidos,edad,tp = null,pers = null,asig = "";
        while(ch < 1 || ch > 3)
        {
            sc = new Scanner(System.in);
            if(sc.hasNextInt())
            {
            ch = sc.nextInt();
            }
            else
            {
                
                System.out.println("Error, ha ingresado un valor no entero: ");
            }
            if(ch < 1 || ch > 3)
            {
                System.out.println("Error, ingrese un valor nuevamente: ");
            }
            
        }
        System.out.print("\nIngrese DNI: ");
        sc = new Scanner(System.in);
        dni = sc.nextLine();
        System.out.print("\nIngrese Nombres: ");
        sc = new Scanner(System.in);
        nombre = sc.nextLine();
        System.out.print("\nIngrese Apellidos: ");
        sc = new Scanner(System.in);
        apellidos = sc.nextLine();
        System.out.print("\nIngrese Edad: ");
        sc = new Scanner(System.in);
        edad = sc.nextLine();
        switch(ch)
        {
            case 1:
            {
                Alumno p = new Alumno(dni,nombre,apellidos,edad);
                p.addAsignaturas();
                asign = p.getAsignaturas();
                tp = "\n---Alumno---";
                pers = p.toString();
                break;
            }
            case 2:
            {
                System.out.print("\nIngrese horario de atención: ");
                sc = new Scanner(System.in);
                Academico p = new Academico(dni,nombre,apellidos,edad,sc.nextLine());
                tp = "\n---Academico---";
                pers = p.toString();
                break;
            }
            case 3:
            {
                System.out.print("\nIngrese horario de labor: ");
                sc = new Scanner(System.in);
                Funcionario p = new Funcionario(dni,nombre,apellidos,edad,sc.nextLine());
                tp = "\n---Funcionario---";
                pers = p.toString();
                break;
            }
        }
        System.out.print("¿En qué región vive la persona?\n");
        mostrarRegion();
        ch = 0;
        while(ch < 1 || ch > 15)
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
            if(ch < 1 || ch > 15)
            {
                System.out.println("Error, ingrese un valor nuevamente: ");
            }
            
        }
        re = r.get(ch-1);
        System.out.println("\nLa región consiste de las siguientes provincias:");
        String comuna = re.mostrarProvincia();
        
        Direccion d = new Direccion();
        System.out.print("\nIngrese calle de hogar: ");
        sc = new Scanner(System.in);
        d.setCalle(sc.nextLine());
        System.out.print("\nIngrese numero de hogar: ");
        sc = new Scanner(System.in);
        d.setNumero(sc.nextLine());
        d.setComuna(comuna);
        
        Direccion dt = new Direccion();
        System.out.print("\nIngrese calle de recinto de trabajo (dejar en blanco si no tiene): ");
        sc = new Scanner(System.in);
        dt.setCalle(sc.nextLine());
        System.out.print("\nIngrese numero de recinto de trabajo(dejar en blanco si no tiene): ");
        sc = new Scanner(System.in);
        dt.setNumero(sc.nextLine());
        dt.setComuna(comuna);
        if(asign.isEmpty())//Si se instanciaron asignaturas de alumno tendrá contenido
        {
            
        }
        else
        {
            asig = "\nAsignaturas: ";
            for(int i = 0;i < asign.size(); i++)
            {
                asig += asignDecon(i) + " ";
            }
        }
                  
        lineas = new ArrayList<>();
        String imprimir = tp + pers + asig + d.toString() + dt.labor();
        lineas.add(imprimir);
        FuenteDatos.escribirArchivo("Base_de_datos.txt",lineas);
        System.out.println("Se ha guardado la información.");
    }
    
    public String asignDecon(int i)
    {
        return asign.get(i);
    }
    
    
}
