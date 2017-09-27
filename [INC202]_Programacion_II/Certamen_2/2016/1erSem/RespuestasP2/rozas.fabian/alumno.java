
public class alumno {
    public int id;
    public String apelPaterno;
    public String apelMaterno;
    public String nombre;
    
    public alumno(int id, String apelPaterno, String apelMaterno, String nombre){
        this.id = id;
        this.apelPaterno= apelPaterno;
        this.apelMaterno= apelMaterno;
        this.nombre= nombre;
      
    }
    public int getId(){
        return id;
    }
    
    public void setId(int id){
        this.id = id;
    }
    
    public String getApelPaterno(){
        return apelPaterno;
    }
    
    public void setApelPaterno(String apelPaterno){
        this.apelPaterno = apelPaterno;
    }
    
    public String getApelMaterno(){
        return apelMaterno;
    }
    
    public void setApelMaterno(String apelMaterno){
        this.apelMaterno = apelMaterno;
    }
    
}
