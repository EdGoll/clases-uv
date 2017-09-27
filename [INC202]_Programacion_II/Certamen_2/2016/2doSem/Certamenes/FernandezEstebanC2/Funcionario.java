public class Funcionario extends Persona{
    
    private String horarioTrabajo;

    public Funcionario(String horarioTrabajo) {
        this.horarioTrabajo = horarioTrabajo;
    }
    
    public Funcionario(){
        
    }

    public String getHorarioTrabajo() {
        return horarioTrabajo;
    }

    public void setHorarioTrabajo(String horarioTrabajo) {
        this.horarioTrabajo = horarioTrabajo;
    }
    
}
