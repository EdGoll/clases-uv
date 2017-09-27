import java.util.List;
import java.util.ArrayList;

public class Academico extends Persona
{
    private String horarAttn;
    public Academico(String dni, String nombre, String apellidos, String edad, String horarAttn)
    {
        super(dni,nombre,apellidos,edad);
        this.horarAttn = horarAttn;
    }
    public void setHorarAttn(String horarAttn)
    {
        this.horarAttn = horarAttn;
    }
    public String getHorarAttn()
    {
        return horarAttn;
    }
    @Override
    public String toString()
    {
        return "\nDNI : "+super.getDni() +"\nNombres: "+ super.getNombre() +"\nApellidos: " +super.getApellidos() +"\nEdad: "+ super.getEdad()+"\nHorario de atención: " + horarAttn;
    }
}
