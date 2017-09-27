package semestre;

public class Alumno {
    private String id;
    private String apellidoP;
    private String apellidoM;
    private String nombres;
    private float promedio;

    public String getId() {
        return id;
    }

    public String getApellidoP() {
        return apellidoP;
    }

    public String getApellidoM() {
        return apellidoM;
    }

    public String getNombres() {
        return nombres;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setApellidoP(String apellidoP) {
        this.apellidoP = apellidoP;
    }

    public void setApellidoM(String apellidoM) {
        this.apellidoM = apellidoM;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public float getPromedio() {
        return promedio;
    }

    public void setPromedio(float promedio) {
        this.promedio = promedio;
    }
    
    @Override
    public String toString(){
        return String.format("%s %s %s %s %s", id, apellidoP, apellidoM, nombres, promedio);
    }
}
