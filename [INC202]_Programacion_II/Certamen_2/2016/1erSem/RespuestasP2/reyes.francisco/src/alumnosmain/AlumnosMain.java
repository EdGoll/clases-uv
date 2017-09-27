
package alumnosmain;


public class AlumnosMain {

 
    public static void main(String[] args) {
        String pdf1 = "C:\\Users\\Lab\\Desktop\\alumnos.csv" ;
        String pdf2 = "C:\\Users\\Lab\\Desktop\\asignatura1.csv" ;
        String pdf3 = "C:\\Users\\Lab\\Desktop\\asignatura2.csv" ;
        
        FuenteDeDatos fdd = new FuenteDeDatos();
        Estudiantes est = new Estudiantes();
        
         est.cambiarString(fdd.leerArchivo(pdf1)); 
         est.cambiarString(fdd.leerArchivo(pdf2)); 
         
         
    }
    
}
