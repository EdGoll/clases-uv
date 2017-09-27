
public class Funcionario extends Persona{
    private String HorarioLaboral; 
    
    public Funcionario(String DNI,String Nombre,String Apellidos,String Edad,
            Direccion DireccionP,Direccion DireccionL,String HorarioLaboral){
        
        super(DNI,Nombre,Apellidos,Edad,DireccionP,DireccionL);
        this.HorarioLaboral=HorarioLaboral;
    }
    
    public Funcionario(String DNI,String Nombre,String Apellidos,String Edad,
            Direccion DireccionP,String HorarioLaboral){
        
        super(DNI,Nombre,Apellidos,Edad,DireccionP);
        this.HorarioLaboral=HorarioLaboral;
    }
    public String getHorarioLaboral(){
        return HorarioLaboral;
    }
}