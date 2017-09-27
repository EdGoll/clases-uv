public class Academico extends Persona{
    
    private String horarioAtencion;

    public Academico(String horarioAtencion) {
        this.horarioAtencion = horarioAtencion;
    }
    
    public Academico(){
    
    }

    public String getHorarioAtencion() {
        return horarioAtencion;
    }

    public void setHorarioAtencion(String horarioAtencion) {
        this.horarioAtencion = horarioAtencion;
    }
    
}
