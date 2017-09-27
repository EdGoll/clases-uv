public class Persona {
    
    private int DNI;
    private String nombre;
    private String apellidos;
    private int edad;
    private Direccion dirPar;
    private Direccion dirLab;

    public int getDNI() {
        return DNI;
    }

    public void setDNI(int DNI) {
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

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public Direccion getDirPar() {
        return dirPar;
    }

    public void setDirPar(Direccion dirPar) {
        this.dirPar = dirPar;
    }

    public Direccion getDirLab() {
        return dirLab;
    }

    public void setDirLab(Direccion dirLab) {
        this.dirLab = dirLab;
    }
    
    @Override
    public String toString(){
        String mensaje = "Direccion particular: "+ getDirPar()+"\nDireccion Laboral: "+ getDirLab();
        return mensaje;
    }
}
