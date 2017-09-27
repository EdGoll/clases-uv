


public class Alumno {
    
    private String id;
    private String apellidoPaterno;
    private String apellidoMaterno;
    private String nombre;
    
    public void setId(String id){
        this.id=id;
    }
    public void setApellidoPaterno(String apellidoPaterno){
        this.apellidoPaterno=apellidoPaterno;
    }
    public void setApellidoMaterno(String apellidoMaterno){
        this.apellidoMaterno=apellidoMaterno;
    }
    public void setNomnre(String nombre){
        this.nombre=nombre;
    }
    
    public String getId(){
        return id;
    }
    public String getApellidoPaterno(){
        return apellidoPaterno;
    }
    public String getApellidoMaterno(){
        return apellidoMaterno;
    }
    public String getNombre(){
        return nombre;
    }
}
