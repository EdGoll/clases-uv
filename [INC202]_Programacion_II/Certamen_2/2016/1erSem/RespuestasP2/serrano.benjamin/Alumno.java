package Certamen;

public class Alumno {

    private String id;
    private String apellidoMaterno;
    private String apellidoPaterno;
    private String nombres;

    public String getId() {
        return this.id;
    }

    public void setId(String id) {
        this.id = id.trim();
    }

    public String getApellidoMaterno() {
        return this.apellidoMaterno;
    }

    public void setApellidoMaterno(String materno) {
        this.apellidoMaterno = materno.trim();
    }

    public String getApellidoPaterno() {
        return this.apellidoPaterno;
    }

    public void setApellidoPaterno(String paterno) {
        this.apellidoPaterno = paterno.trim();
    }

    public String getNombres() {
        return this.nombres;
    }

    public void setNombres(String nombre) {
        this.nombres = nombre.trim();
    }
}
