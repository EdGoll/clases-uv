public class Funcionario extends Persona {

    private String horarioLaboral;

    public String getHorarioLaboral() {
        return horarioLaboral;
    }

    public void setHorarioLaboral(String horarioLaboral) {
        this.horarioLaboral = horarioLaboral;
    }

    @Override
    public String toString() {
        return super.getDNI() + "\t" + super.getNombre() + "\t" + super.getApellidos() + "\t" + super.getEdad() + "\t" + super.getDireccionPersonal().toString() + "\t" + super.getDireccionLaboral().toString() + "\n";
    }

}
