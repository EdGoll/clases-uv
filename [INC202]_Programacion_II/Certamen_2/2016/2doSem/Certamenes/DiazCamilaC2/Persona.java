

public class Persona {
   
    private String DNI;
    private String Nombre;
    private String Apellidos;
    private String Edad;
    private Direccion DireccionPersonal;
    private Direccion DireccionLaboral;
    
    public Persona(String DNI,String Nombre,String Apellidos,String Edad,Direccion DireccionP,Direccion DireccionL){
        this.DNI=DNI;
        this.Nombre=Nombre;
        this.Apellidos=Apellidos;
        this.Edad=Edad;
        this.DireccionPersonal=DireccionP;
        this.DireccionLaboral=DireccionL;
    }
        public Persona(String DNI,String Nombre,String Apellidos,String Edad,Direccion DireccionP){
        this.DNI=DNI;
        this.Nombre=Nombre;
        this.Apellidos=Apellidos;
        this.Edad=Edad;
        this.DireccionPersonal=DireccionP;
    }
    
    public void setDNI(String DNI){
       this.DNI=DNI;
    }
    public String getDNI(){
        return DNI;
    } 
    public void setNombre(String Nombre){
        this.Nombre=Nombre;
    }
    public String getNombre(){
        return Nombre;
    }
    public void setApellidos(String Apellidos){
        this.Apellidos=Apellidos;
    }
    public String getApellidos(){
        return Apellidos;
    }
    public void setEdad(String Edad){
        this.Edad=Edad;
    }
    public String getEdad(){
        return Edad;
    }
    public void setDireccionPersonal(Direccion Direccion){
        this.DireccionPersonal=Direccion;        
    }
    public Direccion getDireccionPersonal(){
        return DireccionPersonal;
    }
    public void setDireccionLaboral(Direccion Direccion){
        this.DireccionLaboral=Direccion;
    }  
    public Direccion getDireccionLaboral(){
        return DireccionLaboral;
    }
    
    @Override
    public String toString(){
        return String.format("",DNI,Nombre,Apellidos,Edad,DireccionPersonal,DireccionLaboral!=null);
    }
}
