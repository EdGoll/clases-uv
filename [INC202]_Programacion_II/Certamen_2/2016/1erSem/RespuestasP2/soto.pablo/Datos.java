

public class Datos {
       
       private String id;
       private String apellido;
       private String apellido1;
       private String nombres;
       
       public Datos(String id, String apellido, String apellido1, String nombres){
              this.id=id;
              this.apellido=apellido;
              this.apellido1=apellido1;
              this.nombres=nombres;
       }
       
       Datos(){
           
       }
       
       public void setID(String id){
              this.id=id;
       }
       
       public String getID(){
              return id;
       }
       
       public void setApellido(String apellido){
              this.apellido=apellido;
       }
       
       public String getApellido(){
              return apellido;
       }
       
       public void setApellido1(String apellido1){
              this.apellido1=apellido1;
       }
       
       public String getApellido1(){
              return apellido1;
       }
       
       public void setNombres(String nombres){
              this.nombres=nombres;
       }
       
       public String getNombres(){
              return nombres;
       }
       
       @Override
       public String toString(){
              return String.format("%s %s %s %s",id,apellido,apellido1,nombres);
       }
       
}
