/* Clase atomica - Alumno */

public class Alumno {
    
    private int id;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
    
    @Override
    public String toString() {
        return String.format("AlumnoID: %d", id);
    }

    @Override
    public boolean equals(Object o) {
        if(o instanceof Alumno) {
            Alumno alumno = (Alumno) o;
            if (alumno.getId() == this.id) {
                return true;
            }
        }
        return false;
    }
}