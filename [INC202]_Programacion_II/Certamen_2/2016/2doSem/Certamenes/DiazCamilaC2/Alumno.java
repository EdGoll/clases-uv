

public class Alumno extends Persona{

private String Asignaturas;    

    public Alumno(String DNI,String Nombre,String Apellidos,String Edad,
            Direccion DireccionP,Direccion DireccionL,String Asignaturas){
        
        super(DNI,Nombre,Apellidos,Edad,DireccionP,DireccionL);
        this.Asignaturas=Asignaturas;
    }
    public Alumno(String DNI,String Nombre,String Apellidos,String Edad,
            Direccion DireccionP,String Asignaturas){
        
        super(DNI,Nombre,Apellidos,Edad,DireccionP);
        this.Asignaturas=Asignaturas;
    }
    public String getAsignaturas(){
        return Asignaturas;
    }
    
}
