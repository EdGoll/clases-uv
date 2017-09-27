
package principal;

public class Alumnos {

    private String apellidoPaterno;
    private String apellidoMaterno;
    private String nombre;

    public String getApellidoPaterno() {
        return apellidoPaterno;
    }

    public void setApellidoPaterno(String apellidoPaterno) {
        this.apellidoPaterno = apellidoPaterno;
    }

    public String getApellidoMaterno() {
        return apellidoMaterno;
    }

    public void setApellidoMaterno(String apellidoMaterno) {
        this.apellidoMaterno = apellidoMaterno;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
  @Override
  
  public String toString(){
      return "ALUMNO: "+ApellidoPaterno+ ","+ApellidoMaterno+ ","+Nombre;
  }
   
}
