public abstract class Persona 
{        
    private String dni,nombre,apellidos,edad;
    public Persona(String dni, String nombre, String apellidos, String edad)
    {
        this.dni = dni;
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.edad = edad;
    }
 
    public void setDni(String dni)
    {
        this.dni = dni;
    }
    public void setNombre(String nombre)
    {
        this.nombre = nombre;
    }
    public void setApellidos(String apellidos)
    {
        this.apellidos = apellidos;
    }
    public void setEdad(String edad)
    {
        this.edad = edad;
    }
    public String getDni()
    {
        return dni;
    }
    public String getNombre()
    {
        return nombre;
    }
    public String getApellidos()
    {
        return apellidos;
    }
    public String getEdad()
    {
        return edad;
    }
}
