

import static java.lang.Double.parseDouble;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class NotasIMP {

    public NotasIMP() {
        cargarAlumnos();
        cargarNotasAsignatura();
        guardar(promedio());
    }

    List<Asignatura> la = null;
    List<Alumno> lam= new ArrayList<>();
    
    public void cargarAlumnos() {
        Alumno a ;
        FuenteDeDatos fd = new FuenteDeDatos();
        List<String> lineas = fd.leerArchivo("alumnos.csv");
        for (String linea : lineas) {
            a = new Alumno();
            StringTokenizer st = new StringTokenizer(linea, ";");
                a.setId(st.nextToken());
                a.setaP(st.nextToken());
                a.setaM(st.nextToken());
                a.setName(st.nextToken()); 
                lam.add(a);
        }

    }

    public void cargarNotasAsignatura() {
        Asignatura a = new Asignatura();
        la = new ArrayList<>();
        FuenteDeDatos fd = new FuenteDeDatos();
        List<String> lineas = fd.leerArchivo("asignatura1.csv");
        for (String linea : lineas) {
            StringTokenizer st = new StringTokenizer(linea, ";");
                a.setId(st.nextToken());
                a.setnQ1(st.nextToken());
                a.setnQ2(st.nextToken());
                a.setnQ3(st.nextToken());
                a.setnT1(st.nextToken());
                a.setnT2(st.nextToken());
                a.setnC1(st.nextToken());
                a.setnC2(st.nextToken());
                a.setnC3(st.nextToken());
            la.add(a);
        }
    }

    
    public List promedio() {
        
       List<String> cade;
       
       for(Alumno a : lam)
       {
           cade = new ArrayList<String>();
           String cadena="";
           cadena+=a.getId()+" ";
           
       }
       
           for(Asignatura b : la){
            
               if(String.valueOf(b.getnC1()+b.getnC2()+b.getnC3())>=4.0)
               {
                cadena+=(String.valueOf(((b.getnC1()+b.getnC2()+b.getnC3())*0.7)+((b.getnQ1()+b.getnQ2()+b.getnQ3())*0.15)+((b.getnT1()+b.getnT2())*0.15)));   
                        
               }else if(String.valueOf(b.getnC1()+b.getnC2()+b.getnC3())>=3.5)
                    {
                     cadena+=(String.valueOf(((b.getnC1()+b.getnC2()+b.getnC3())*0.8)+((b.getnQ1()+b.getnQ2()+b.getnQ3())*0.10)+((b.getnT1()+b.getnT2())*0.10));   
                          
                    }else if(String.valueOf(b.getnC1()+b.getnC2()+b.getnC3())>=3.0)
                    {
                            (cadena+=(String.valueOf(((b.getnC1()+b.getnC2()+b.getnC3())*0.9)+((b.getnQ1()+b.getnQ2()+b.getnQ3())*0.05)+((b.getnT1()+b.getnT2())*0.05));   
                                    
                    }
       }
           cade = new ArrayList<String>();
           cade.add(cadena);
         
           return cade;
    }
    
    public void guardar(List<String> a) //id , nota final 1 , nota final 2
    {
        FuenteDeDatos fd = new FuenteDeDatos();
        fd.escribirArchivo("consolidado.csv", a);
}
}

