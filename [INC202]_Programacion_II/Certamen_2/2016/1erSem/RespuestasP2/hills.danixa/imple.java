import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;
public class Imple {
    List<Asignatura1> listaA;
    List<Alumno> alumnos;
    List<String> linea;
    public Imple() {
        obtenerDatos();
    }

    private void obtenerDatos() {
        FuenteDeDatos fdd= new FuenteDeDatos();
        listaA=new ArrayList<Asignatura1>();
        linea=new ArrayList<String>();
        alumnos=new ArrayList<Alumno>();
        Asignatura1 a1=new Asignatura1();
        Asignatura1 a2=new Asignatura1();
        Alumno alum = new Alumno();
        linea=fdd.leerArchivo("C:\\Users\\lab\\Downloads\\asignatura1.csv");
        for(String lineas: linea){
           StringTokenizer er= new StringTokenizer(lineas,";");
           a1.setIdentificador(Integer.parseInt(er.nextToken()));
           a1.setQuiz1(Integer.parseInt(er.nextToken()));
           a1.setQuiz2(Integer.parseInt(er.nextToken()));
           a1.setQuiz3(Integer.parseInt(er.nextToken()));
           a1.setTarea1(Integer.parseInt(er.nextToken()));
           a1.setTarea2(Integer.parseInt(er.nextToken()));
           a1.setTarea3(Integer.parseInt(er.nextToken()));
           a1.setCertamen1(Integer.parseInt(er.nextToken()));
           a1.setCertamen2(Integer.parseInt(er.nextToken()));
           a1.setCertamen3(Integer.parseInt(er.nextToken()));
           listaA.add(a1);
        }
        linea=fdd.leerArchivo("C:\\Users\\lab\\Downloads\\asignatura2.csv");
            for(String lineas: linea){
               StringTokenizer er= new StringTokenizer(lineas,";");
               a2.setIdentificador(Integer.parseInt(er.nextToken()));
               a2.setQuiz1(Integer.parseInt(er.nextToken()));
               a2.setQuiz2(Integer.parseInt(er.nextToken()));
               a2.setQuiz3(Integer.parseInt(er.nextToken()));
               a2.setTarea1(Integer.parseInt(er.nextToken()));
               a2.setTarea2(Integer.parseInt(er.nextToken()));
               a2.setTarea3(Integer.parseInt(er.nextToken()));
               a2.setCertamen1(Integer.parseInt(er.nextToken()));
               listaA.add(a2);
        }
        linea=fdd.leerArchivo("C:\\Users\\lab\\Downloads\\alumnos.csv");
          for(String lineas: linea){
               StringTokenizer er= new StringTokenizer(lineas,";");
               alum.setIdentificador(Integer.parseInt(er.nextToken()));
               alum.setApellidoP(er.nextToken());
               alum.setApellidoM(er.nextToken());
               alum.setNombres(er.nextToken());
               alumnos.add(alum);
        }
    } 
    public void calcularPromedio(){ 
       List<Asignatura1> notas= new ArrayList<Asignatura1>();
    
}

    void almacenarArchivo() {
      FuenteDeDatos fdd= new FuenteDeDatos();
      fdd.escribirArchivo(null, linea);
    }

}
