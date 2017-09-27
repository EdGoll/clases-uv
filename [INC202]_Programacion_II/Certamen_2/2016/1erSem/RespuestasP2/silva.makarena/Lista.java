package semestre;
import java.util.List;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class Lista {
    private List<Alumno> listaal;
    private List<String> lineas;
    private List<Asignatura> asignatura1;
    private List<Asignatura> asignatura2;
    private StringTokenizer st = null;
    private Alumno alumno;
    private Asignatura asig1;
    private Asignatura asig2;
    private FuenteDeDatos fd;
    
    public void llenarAlumnos(){
        listaal = new ArrayList();
        fd = new FuenteDeDatos();
        lineas = new fd.leerArchivo("alumnos.csv");
        for(String linea : lineas){
            st = new st.StringTokenizer(lineas,";");
            try{
                if(st.hasMoreElements()){
                    alumno = new Alumno();
                    alumno.setId(st.nextToken());
                    alumno.setApellidoP(st.nextToken());
                    alumno.setApellidoM(st.nextToken());
                    alumno.setNombres(st.nextToken());
                    listaal.add(alumno);
                }
            }catch(Exception e){}   
        }
        listaal.remove(0); //Se elimina primera posicion lista, pues solo contiene los nombres de las columnas.
    }
    
    public void llenarAsignaturas(){
        asignatura1 = new ArrayList();
        asignatura2 = new ArrayList();
        fd = new FuenteDeDatos();
        lineas = new fd.leerArchivo("asignatura1.csv");
        for(String linea : lineas){
            st = new st.StringTokenizer(lineas,";");
            try{
                if(st.hasMoreElements()){
                    asig1 = new Asignatura();
                    asig1.setNQ1(st.nextToken());
                    asig1.setNQ2(st.nextToken());
                    asig1.setNQ3(st.nextToken());
                    asig1.setTarea1(st.nextToken());
                    asig1.setTarea2(st.nextToken());
                    asig1.setC1(st.nextToken());
                    asig1.setC2(st.nextToken());
                    asig1.setC3(st.nextToken());
                    asignatura1.add(asig1);
                }
            }catch(Exception e){}   
        }
        asignatura1.remove(0);
        for(String linea : lineas){
            st = new st.StringTokenizer(lineas,";");
            try{
                if(st.hasMoreElements()){
                    asig2 = new Asignatura();
                    asig2.setNQ1(st.nextToken());
                    asig2.setNQ2(st.nextToken());
                    asig2.setNQ3(st.nextToken());
                    asig2.setTarea1(st.nextToken());
                    asig2.setTarea2(st.nextToken());
                    asig2.setC1(st.nextToken());
                    asig2.setC2(st.nextToken());
                    asig2.setC3(st.nextToken());
                    asignatura2.add(asig2);
                }
            }catch(Exception e){}   
        }
        asignatura1.remove(0);
    }
    
    public void Promedio(){
        float sum=0;
        float promQ=0;
        float promT=0;
        float promC=0;
        float promedio=0;
        for(Asignatura asig1:asignatura1){
            sum=Integer.parseInt(asig1.getNQ1())+Integer.parseInt(asig1.getNQ2())+Integer.parseInt(asig1.getNQ3());
            promQ=sum/3;
            sum=Integer.parseInt(asig1.getTarea1())+Integer.parseInt(asig1.getTarea2());
            promT=sum/2;
            sum=Integer.parseInt(asig1.getC1())+Integer.parseInt(asig1.getC2())+Integer.parseInt(asig1.getC3());
            promC=sum/3;
            if(promC>=4.0){
                promedio=promC*0.7+promQ*0.15+promT*0.15;
                asig2.setPromedio(promedio);
       //     }else if(pro>=3.5)
        }
        sum=0;
        prom=0;
        for(Asignatura asig2:asignatura2){
            sum=Integer.parseInt(asig2.getNQ1())+Integer.parseInt(asig2.getNQ2())+Integer.parseInt(asig2.getNQ3());
            promQ=sum/3;
            sum=Integer.parseInt(asig2.getTarea1())+Integer.parseInt(asig2.getTarea2());
            promT=sum/2;
            sum=Integer.parseInt(asig2.getC1())+Integer.parseInt(asig2.getC2())+Integer.parseInt(asig2.getC3());
            promC=sum/3;
            if(promC>=4.0){
                promedio=promC*0.7+promQ*0.15+promT*0.15;
                asig2.setPromedio(promedio);
        }
        
    }
}
