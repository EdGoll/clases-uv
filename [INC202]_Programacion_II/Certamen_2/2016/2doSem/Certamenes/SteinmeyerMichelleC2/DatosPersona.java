//CLASE "PERSONA"
public class DatosPersona {

    private int DNI; 
    private String Nombre;
    private String Apellidos;
    private int Edad;
    private String DireccionPersonal;
    private String DireccionLaboral;

    
    
    public String getDireccionPersonal() {
        return DireccionPersonal;
    }

    public void setDireccionPersonal(String DireccionPersonal) {
        this.DireccionPersonal = DireccionPersonal;
    }

    public String getDireccionLaboral() {
        return DireccionLaboral;
    }

    public void setDireccionLaboral(String DireccionLaboral) {
        this.DireccionLaboral = DireccionLaboral;
    }
    
     public int getDNI() {
        return DNI;
    }

    public void setDNI(int DNI) {
        this.DNI = DNI;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public String getApellidos() {
        return Apellidos;
    }

    public void setApellidos(String Apellidos) {
        this.Apellidos = Apellidos;
    }

    public int getEdad() {
        return Edad;
    }

    public void setEdad(int Edad) {
        this.Edad = Edad;
    }
    
    @Override
    public String toString(){
        return(DNI + "" + Nombre + "" + Apellidos + "" + Edad);
    }
    
}
