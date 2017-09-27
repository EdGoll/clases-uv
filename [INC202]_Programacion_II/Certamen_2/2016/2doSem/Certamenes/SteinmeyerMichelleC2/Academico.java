public class Academico extends DatosPersona {
    private String HorarioConsultas;

    public Academico(String HorarioConsultas) {
        this.HorarioConsultas = HorarioConsultas;
    }
    
    
    public Academico(){
    }

    public String getHorarioConsultas() {
        return HorarioConsultas;
    }

    public void setHorarioConsultas(String HorarioConsultas) {
        this.HorarioConsultas = HorarioConsultas;
    }

    
    
    
}
