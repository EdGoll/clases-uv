package duoc;
public class AlumnoPostgrado extends Alumno {
   private int añoEgreso = 2008;

   public double calcularPromedio(){
        return (nota1  + nota2) / 2;
   }

   /*    
   public void setNota2(double nota){
       if (nota < 4.0){
           nota = 4.0;
        }
        super.setNota2(nota);
    }
   */ 
    public String getInformacion(){
        return getNombre() + " : " + añoEgreso + " : " + calcularPromedio();
    }
}
