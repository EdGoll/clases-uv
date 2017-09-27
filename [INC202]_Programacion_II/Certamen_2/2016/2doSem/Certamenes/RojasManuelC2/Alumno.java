public class Alumno extends Persona {

    private String asignaturas;

    public String getHorario() {
        return asignaturas;
    }

    public void setHorario(String asignaturas) {
        this.asignaturas = asignaturas;
    }

    @Override
    public String toString() {
        return super.getDNI() + "\t" + super.getNombre() + "\t" + super.getApellidos() + "\t" + super.getEdad() + "\t" + super.getDireccionPersonal().toString() + "\t" + super.getDireccionLaboral().toString() + "\n";
    }

}
