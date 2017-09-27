public class Academico extends Persona {

    private String horario;

    public String getHorario() {
        return horario;
    }

    public void setHorario(String horario) {
        this.horario = horario;
    }

    @Override
    public String toString() {
        return super.getDNI() + "\t" + super.getNombre() + "\t" + super.getApellidos() + "\t" + super.getEdad() + "\t" + super.getDireccionPersonal().toString() + "\t" + super.getDireccionLaboral().toString() + "\n";
    }

}
