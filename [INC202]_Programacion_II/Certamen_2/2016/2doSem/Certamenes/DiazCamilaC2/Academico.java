
public class Academico extends Persona{
    private String HorarioDeAtencion;
    
    public Academico(String DNI,String Nombre,String Apellidos,String Edad,
            Direccion DireccionP,Direccion DireccionL,String HorarioDeAtencion){
        
        super(DNI,Nombre,Apellidos,Edad,DireccionP,DireccionL);
        this.HorarioDeAtencion=HorarioDeAtencion;
    }
    public Academico(String DNI,String Nombre,String Apellidos,String Edad,
            Direccion DireccionP,String HorarioDeAtencion){
        
        super(DNI,Nombre,Apellidos,Edad,DireccionP);
        this.HorarioDeAtencion=HorarioDeAtencion;
    }
    public String getHorarioDeAtencion(){
    return HorarioDeAtencion;
    }
        
}
