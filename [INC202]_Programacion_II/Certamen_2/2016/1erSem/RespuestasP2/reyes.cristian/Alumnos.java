
package ce2;

public class Alumnos {
    public String apellidoP, apellidoM, nombre;
    public int id;
    
    
    
    public String getApellidoP(){
        return apellidoP;
    }
    public void setApellidoP(String apellidoP){
        this.apellidoP=apellidoP;
    } 
   
    public String getApellidoM(){
        return apellidoM;
    }
    public void setApellidoM(String apellidoM){
        this.apellidoM=apellidoM;
    }
    
    public String getNobre(){
        return nombre;
    }
    public void setNombre(String nombre){
        this.nombre=nombre;
    }
    public int getId(){
        return id;
    }
    public void setID(int id){
        this.id=id;
    }
    @Override
 public String toString(){
     return id+";"+apellidoP+";"+apellidoM+";"+nombre+";";
 }   
 
  


      
}