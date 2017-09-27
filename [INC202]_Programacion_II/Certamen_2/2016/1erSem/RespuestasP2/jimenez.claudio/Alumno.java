
import java.io.FileReader;

public class Alumno {

    public Alumno(double notafinaluno) {
        this.notafinaluno = notafinaluno;
    }
    protected String apellidopaterno;
    protected String apellidomaterno;
    protected String nombres;
    protected int id;
    protected double notafinaluno,notalfinaldos;

    public double getNotafinaluno() {
        return notafinaluno;
    }

    public void setNotafinaluno(double notafinaluno) {
        this.notafinaluno = notafinaluno;
    }

    public double getNotalfinaldos() {
        return notalfinaldos;
    }

    public void setNotalfinaldos(double notalfinaldos) {
        this.notalfinaldos = notalfinaldos;
    }
    
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getApellidopaterno() {
        return apellidopaterno;
    }

    public void setApellidopaterno(String apellidopaterno) {
        this.apellidopaterno = apellidopaterno;
    }

    public String getApellidomaterno() {
        return apellidomaterno;
    }

    public void setApellidomaterno(String apellidomaterno) {
        this.apellidomaterno = apellidomaterno;
    }

    public String getNombres() {
        return nombres;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }
    
   
}
