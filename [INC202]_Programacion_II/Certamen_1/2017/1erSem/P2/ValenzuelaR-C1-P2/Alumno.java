

public class Alumno {
   private int direccion;
   public int obtenerId(){
       
       return direccion; 
   }
   public void guardarId(int direccion){
       this.direccion = direccion;
   }
   @Override
   public String toString(){

           return String.format("IdALUMNO: %d", direccion);
       }
   
}
