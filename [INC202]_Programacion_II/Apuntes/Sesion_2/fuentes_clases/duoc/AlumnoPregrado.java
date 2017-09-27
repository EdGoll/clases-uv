package duoc;
public class AlumnoPregrado extends Alumno {
    public double calcularPromedio(){
        return (nota1 * 0.3 + nota2 * .7);
    }
    public String getInformacion(){
        return getNombre() + " : " + calcularPromedio();
    }
    
}
