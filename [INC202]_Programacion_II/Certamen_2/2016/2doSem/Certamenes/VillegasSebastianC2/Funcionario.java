public class Funcionario extends Persona
{
    private String dni,nombre,apellidos,edad,horarLabor;
    
    public Funcionario(String dni, String nombre, String apellidos, String edad,String horarLabor)
    {
        super(dni,nombre,apellidos,edad);
        this.horarLabor = horarLabor;
    }
    public void setHorarLabor(String horarLabor)
    {
        this.horarLabor = horarLabor;
    }
    public String getHorarLabor()
    {
        return horarLabor;
    }
    @Override
    public String toString()
    {
        return "\nDNI : "+super.getDni() +"\nNombres: "+ super.getNombre() +"\nApellidos: " +super.getApellidos() +"\nEdad: "+ super.getEdad()+"\nHorario de labor: "+horarLabor;
    }
}
