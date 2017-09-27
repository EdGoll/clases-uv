public class Alumno extends DatosPersona {
    private String Asignaturas;

    public Alumno(String Asignaturas) {
        this.Asignaturas = Asignaturas;
    }
    
   
    public Alumno(){
    }

    public String getAsignaturas() {
        return Asignaturas;
    }

    public void setAsignaturas(String Asignaturas) {
        this.Asignaturas = Asignaturas;
    }
    
    
    
}
