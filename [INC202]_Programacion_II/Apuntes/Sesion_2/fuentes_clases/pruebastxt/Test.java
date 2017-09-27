package pruebastxt;
//import duoc.*; //todas las clases
import duoc.*;
import intefaces.*;
public class Test {
    public static void main(String[] args){
        duoc.Alumno alumno;
        
        alumno = new AlumnoPostgrado();
        
        alumno.setNombre("Rodrigo");
        alumno.setNota1(7.0);
        alumno.setNota2(3); // no problema, int cabe en double
        
        double promedio = alumno.calcularPromedio();
        
        System.out.println("alumno : " + alumno.getNombre());
        System.out.println("promedio : " + promedio);
        /*
        AlumnoPregrado alumPregrado = new AlumnoPregrado();
        alumPregrado.setNombre("Alexis");
        alumPregrado.nota1 = 7.0;
        alumPregrado.nota2 = 3.0;
        System.out.println(alumPregrado.getNombre());
        System.out.println(alumPregrado.calcularPromedio());
        */
        
    }
    
    
    public static void pruebaInterface(){
        InfoAlumno[] arrInfo = new InfoAlumno[3];
        
        Alumno alumno;
        alumno = new AlumnoPregrado();
        alumno.setNombre("Rodrigo");
        alumno.setNota1(4.0);
        alumno.setNota2(3.0);
        arrInfo[0] =  alumno;
        
        alumno = new AlumnoPostgrado();
        alumno.setNombre("Alexis");
        alumno.setNota1(5.0);
        alumno.setNota2(6.0);
        arrInfo[1] =  alumno;
        
        arrInfo[2] =  new Persona();
        
        for(int x = 0; x < arrInfo.length; x++){
            System.out.println(arrInfo[x].getInformacion());
        }
        
    }
}
