
package alumnosmain;


public class Alumno {
    private String nombre ;
    private String apellido1;
    private String apellido2;
    
     public void SetNombre(String nom){
       this.nombre = nom;
    }
   
   public String getNombre(){
       return nombre;
   }
   
       
     public void Setapellido1(String apell1){
       this.apellido1 = apell1;
    }
   
   public String getApellido1(){
       return apellido1;
   }
       
     public void SetApellido2(String apell2){
       this.apellido2 = apell2;
    }
   
   public String getApellido2(){
       return apellido2;
   }
    
}
