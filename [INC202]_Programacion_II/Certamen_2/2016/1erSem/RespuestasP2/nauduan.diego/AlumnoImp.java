


import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;


public class AlumnoImp {
    
    List<Alumno> Alumnos = new ArrayList<>();
    
    private void Rellenar(){
        FuenteDeDatos fd = new FuenteDeDatos();
        List lista1 = fd.leerArchivo("alumnos.csv");
        List lista2 = fd.leerArchivo("asignatura1.csv");
        List lista3 = fd.leerArchivo("asignatura2.csv");
        StringTokenizer st = null;
        Alumno a = null;
        Asignatura as = null;
        for (Object o : lista1){
            st = new StringTokenizer((String)o,";");
            a = new Alumno();
            a.setId(st.nextToken());
            a.setApellidoPaterno(st.nextToken());
            a.setApellidoMaterno(st.nextToken());
            a.setNombres(st.nextToken());
        }
        Alumnos.add(a);
        String id;
        for (Object o : lista2){
            st = new StringTokenizer((String)o,";");
            as = new Asignatura();
            id = st.nextToken();
            as.setNotaControl1(Integer.parseInt(st.nextToken()));
            as.setNotaControl2(Integer.parseInt(st.nextToken()));
            as.setNotaControl3(Integer.parseInt(st.nextToken()));
            as.setNotaTarea1(Integer.parseInt(st.nextToken()));
            as.setNotaTarea2(Integer.parseInt(st.nextToken()));
            as.setNotaCertamen1(Integer.parseInt(st.nextToken()));
            as.setNotaCertamen2(Integer.parseInt(st.nextToken()));
            as.setNotaCertamen3(Integer.parseInt(st.nextToken()));
            for (Alumno al : Alumnos){
                if(al.getId().equals(id)){
                    al.setAsignatura1(as);
                }
            }
        }
        for (Object o : lista3){
            st = new StringTokenizer((String)o,";");
            as = new Asignatura();
            id = st.nextToken();
            as.setNotaControl1(Integer.parseInt(st.nextToken()));
            as.setNotaControl2(Integer.parseInt(st.nextToken()));
            as.setNotaControl3(Integer.parseInt(st.nextToken()));
            as.setNotaTarea1(Integer.parseInt(st.nextToken()));
            as.setNotaTarea2(Integer.parseInt(st.nextToken()));
            as.setNotaCertamen1(Integer.parseInt(st.nextToken()));
            as.setNotaCertamen2(Integer.parseInt(st.nextToken()));
            as.setNotaCertamen3(Integer.parseInt(st.nextToken()));
            for (Alumno al : Alumnos){
                if(al.getId().equals(id)){
                    al.setAsignatura2(as);
                }     
            }
        }
    }
    
    private void CalcularPromedio(){
        
        int PQ=0,PC=0,PT=0;
        for(Alumno a : Alumnos){
            PQ = 0;
            PC = 0;
            PT = 0;
            PQ+= a.getAsignatura1().getNotaControl1();
            PQ+= a.getAsignatura1().getNotaControl2();
            PQ+= a.getAsignatura1().getNotaControl3();
            PQ/=3;
            PT+= a.getAsignatura1().getNotaTarea1();
            PT+= a.getAsignatura2().getNotaTarea2();
            PT/=2;
            PC+= a.getAsignatura1().getNotaCertamen1();
            PC+= a.getAsignatura1().getNotaCertamen2();
            PC+= a.getAsignatura1().getNotaCertamen3();
            PC/=2;
            
            if(PC >= 40){
                a.setPromedioAsignatura1(PC);
            }else{
                if(PC >= 35){
                    a.setPromedioAsignatura2(PC*0.7+PQ*0.15+PT*0.15);
                }else{
                    if(PC >= 30){
                        a.setPromedioAsignatura1(PC*0.7+PQ*0.15+PT*0.15);
                    }else{
                        a.setPromedioAsignatura1(PC);
                    }
                }
            }
        }
    }
    
    
    public AlumnoImp(){
        Rellenar();
        CalcularPromedio();
    }
}
