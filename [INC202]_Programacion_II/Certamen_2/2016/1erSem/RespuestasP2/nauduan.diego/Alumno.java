


public class Alumno {
    
    private String id;
    private String nombres;
    private String apellidoMaterno;
    private String apellidoPaterno;
    private double promedioAsignatura1;
    private double promedioAsignatura2;
    private Asignatura asignatura1;
    private Asignatura asignatura2;

    public Asignatura getAsignatura1() {
        return asignatura1;
    }

    public void setAsignatura1(Asignatura asignatura1) {
        this.asignatura1 = asignatura1;
    }

    public Asignatura getAsignatura2() {
        return asignatura2;
    }

    public void setAsignatura2(Asignatura asignatura2) {
        this.asignatura2 = asignatura2;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNombres() {
        return nombres;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public String getApellidoMaterno() {
        return apellidoMaterno;
    }

    public void setApellidoMaterno(String apellidoMaterno) {
        this.apellidoMaterno = apellidoMaterno;
    }

    public String getApellidoPaterno() {
        return apellidoPaterno;
    }

    public void setApellidoPaterno(String apellidoPaterno) {
        this.apellidoPaterno = apellidoPaterno;
    }

    public double getPromedioAsignatura1() {
        return promedioAsignatura1;
    }

    public void setPromedioAsignatura1(double promedioAsignatura1) {
        this.promedioAsignatura1 = promedioAsignatura1;
    }

    public double getPromedioAsignatura2() {
        return promedioAsignatura2;
    }

    public void setPromedioAsignatura2(double promedioAsignatura2) {
        this.promedioAsignatura2 = promedioAsignatura2;
    }
    
}
