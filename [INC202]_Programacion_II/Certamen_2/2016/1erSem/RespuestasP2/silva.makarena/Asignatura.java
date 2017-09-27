package semestre;

public class Asignatura {
    private String NQ1;
    private String NQ2;
    private String NQ3;
    private String tarea1;
    private String tarea2;
    private String c1;
    private String c2;
    private String c3;

    public String getNQ1() {
        return NQ1;
    }

    public String getNQ2() {
        return NQ2;
    }

    public String getNQ3() {
        return NQ3;
    }

    public String getTarea1() {
        return tarea1;
    }

    public String getTarea2() {
        return tarea2;
    }

    public String getC1() {
        return c1;
    }

    public String getC2() {
        return c2;
    }

    public String getC3() {
        return c3;
    }

    public void setNQ1(String NQ1) {
        this.NQ1 = NQ1;
    }

    public void setNQ2(String NQ2) {
        this.NQ2 = NQ2;
    }

    public void setNQ3(String NQ3) {
        this.NQ3 = NQ3;
    }

    public void setTarea1(String tarea1) {
        this.tarea1 = tarea1;
    }

    public void setTarea2(String tarea2) {
        this.tarea2 = tarea2;
    }

    public void setC1(String c1) {
        this.c1 = c1;
    }

    public void setC2(String c2) {
        this.c2 = c2;
    }

    public void setC3(String c3) {
        this.c3 = c3;
    }


    @Override
    public String toString(){
        return String.format("%s %s %s %s %s %s %s %s", NQ1, NQ2, NQ3, tarea1, tarea2, c1, c2, c3);
    }
}
