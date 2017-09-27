import java.util.List;
import java.util.ArrayList;
import java.util.Scanner;
public class Alumno extends Persona
{
    private List<String> asignaturas = new ArrayList<>();
    private Scanner sc;
    public Alumno(String dni, String nombre, String apellidos, String edad)
    {
        super(dni,nombre,apellidos,edad);
    }
    
    public void setAsignaturas(ArrayList<String> asignaturas)
    {
        this.asignaturas = asignaturas;
    }
    
    public List<String> getAsignaturas()
    {
        return asignaturas;
    }
    
    public void addAsignaturas()
    {
        int aN = 0;
        System.out.println("Cuantas asignaturas quiere añadir: " );
        while(aN < 1)
        {
            sc = new Scanner(System.in);
            if(sc.hasNextInt())
            {
            aN = sc.nextInt();
            }
            else
            {
                
                System.out.println("Error, ha ingresado un valor no entero: ");
            }
            if(aN < 1)
            {
                System.out.println("Error, ingrese un valor nuevamente: ");
            }
        }
        for(int i = 0; i<aN;i++)
        {
            System.out.println("Ingrese el nombre de la asignatura "+(i+1));
            sc = new Scanner(System.in);
            asignaturas.add(sc.nextLine());
        }
    }
    
    @Override
    public String toString()
    {
        return "\nDNI : "+super.getDni() +"\nNombres: "+ super.getNombre() +"\nApellidos: " +super.getApellidos() +"\nEdad: "+ super.getEdad();
    }
}
