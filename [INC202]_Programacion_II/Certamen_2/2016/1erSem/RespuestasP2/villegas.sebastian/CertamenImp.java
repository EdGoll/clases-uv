package certamen;

import java.util.StringTokenizer;
import java.util.ArrayList;
import java.util.List;

public class CertamenImp 
{
    private List<String> lineas;
    private List<Alumnos> al;
    private List<Asignatura1> as1;
    private List<Asignatura2> as2;
    private List<Promedios> Pr;
    private StringTokenizer t;
    
    public void LeerAlumnos()
    {
        Alumnos a;
        al = new ArrayList<Alumnos>();
        FuenteDeDatos fd = new FuenteDeDatos();
        lineas = fd.leerArchivo("C:\\Users\\lab\\Documents\\NetBeansProjects\\Certamen\\src\\certamen\\alumnos.csv");
        for(String linea : lineas)
        {
            a = new Alumnos();
            t = new StringTokenizer(linea, ";");
            if(t.hasMoreTokens())
            {
                a.setid(t.nextToken());
                a.setap(t.nextToken());
                a.setam(t.nextToken());
                a.setnom(t.nextToken());
                al.add(a);
            }
        }
    }
    
    public void LeerAsignatura1()
    {
        FuenteDeDatos fd = new FuenteDeDatos();
        Asignatura1 a1;
        as1 = new ArrayList<Asignatura1>();
        lineas = fd.leerArchivo("C:\\Users\\lab\\Documents\\NetBeansProjects\\Certamen\\src\\certamen\\asignatura1.csv");
        for(String linea : lineas)
        {
            a1 = new Asignatura1();
            t = new StringTokenizer(linea, ";");
            if(t.hasMoreTokens())
            {
                a1.setid(t.nextToken());
                a1.setnq1(t.nextToken());
                a1.setnq2(t.nextToken());
                a1.setnq3(t.nextToken());
                a1.setnt1(t.nextToken());
                a1.setnt2(t.nextToken());
                a1.setnc1(t.nextToken());
                a1.setnc2(t.nextToken());
                a1.setnc3(t.nextToken());
                as1.add(a1);
            }
        }
    }
    
    public void LeerAsignatura2()
    {
        FuenteDeDatos fd = new FuenteDeDatos();
        Asignatura2 a2;
        as2 = new ArrayList<Asignatura2>();
        lineas = fd.leerArchivo("C:\\Users\\lab\\Documents\\NetBeansProjects\\Certamen\\src\\certamen\\asignatura2.csv");
        for(String linea : lineas)
        {
            a2 = new Asignatura2();
            t = new StringTokenizer(linea, ";");
            if(t.hasMoreTokens())
            {
                a2.setid(t.nextToken());
                a2.setnco1(t.nextToken());
                a2.setnco2(t.nextToken());
                a2.setnco3(t.nextToken());
                a2.setnt1(t.nextToken());
                a2.setnt2(t.nextToken());
                a2.setnc1(t.nextToken());
                a2.setnc2(t.nextToken());
                a2.setnc3(t.nextToken());
                as2.add(a2);
            }
        } 
    }
    
    public void Promediar
    {
        float nco1,nco2,nco3,nt1,nt2,nc1,nc2,nc3;
        
    }
    
    
}
