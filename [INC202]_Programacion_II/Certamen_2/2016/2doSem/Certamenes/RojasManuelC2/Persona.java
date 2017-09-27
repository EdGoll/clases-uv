public class Persona {

    private String DNI;
    private String nombre;
    private String apellidos;
    private String edad;
    private Direccion direccionPersonal;
    private Direccion direccionLaboral;

    public String getDNI() {
        return DNI;
    }

    public void setDni(String DNI) {
        this.DNI = DNI;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public String getEdad() {
        return edad;
    }

    public void setEdad(String edad) {
        this.edad = edad;
    }

    public Direccion getDireccionPersonal() {
        return direccionPersonal;
    }

    public void setDireccionPersonal(Direccion direccionPersonal) {
        this.direccionPersonal = direccionPersonal;
    }

    public Direccion getDireccionLaboral() {
        return direccionLaboral;
    }

    public void setDireccionLaboral(Direccion direccionLaboral) {
        this.direccionLaboral = direccionLaboral;
    }

}
