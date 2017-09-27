
public class NotaAlumno {

    private int idAlumno;
    private float notaQuiz1;
    private float notaQuiz2;
    private float notaQuiz3;
    private float notaTarea1;
    private float notaTarea2;
    private float notaCertamen1;
    private float notaCertamen2;
    private float notaCertamen3;

    public int getIdAlumno() {
        return idAlumno;
    }

    public void setIdAlumno(int idAlumno) {
        this.idAlumno = idAlumno;
    }

    public float getNotaQuiz1() {
        return notaQuiz1;
    }

    public void setNotaQuiz1(float notaQuiz1) {
        this.notaQuiz1 = notaQuiz1;
    }

    public float getNotaQuiz2() {
        return notaQuiz2;
    }

    public void setNotaQuiz2(float notaQuiz2) {
        this.notaQuiz2 = notaQuiz2;
    }

    public float getNotaQuiz3() {
        return notaQuiz3;
    }

    public void setNotaQuiz3(float notaQuiz3) {
        this.notaQuiz3 = notaQuiz3;
    }

    public float getNotaTarea1() {
        return notaTarea1;
    }

    public void setNotaTarea1(float notaTarea1) {
        this.notaTarea1 = notaTarea1;
    }

    public float getNotaTarea2() {
        return notaTarea2;
    }

    public void setNotaTarea2(float notaTarea2) {
        this.notaTarea2 = notaTarea2;
    }

    public float getNotaCertamen1() {
        return notaCertamen1;
    }

    public void setNotaCertamen1(float notaCertamen1) {
        this.notaCertamen1 = notaCertamen1;
    }

    public float getNotaCertamen2() {
        return notaCertamen2;
    }

    public void setNotaCertamen2(float notaCertamen2) {
        this.notaCertamen2 = notaCertamen2;
    }

    public float getNotaCertamen3() {
        return notaCertamen3;
    }

    public void setNotaCertamen3(float notaCertamen3) {
        this.notaCertamen3 = notaCertamen3;
    }

    public float getPromedioQuiz() {
        return (notaQuiz1 + notaQuiz2 + notaQuiz3) / 3;
    }

    public float getPromediTarea() {
        return (notaTarea1 + notaTarea2) / 2;
    }

    public float getPromedioCertamen() {
        return (notaCertamen1 + notaCertamen2 + notaCertamen3) / 3;
    }

    public float getPromedioFinal() {
        if (getPromedioCertamen() >= 4) {
            return getPromedioCertamen() * 0.7f + getPromedioQuiz() * 0.15f + getPromediTarea() * 0.15f;
        } else if (getPromedioCertamen() >= 3.5) {
            return getPromedioCertamen() * 0.8f + getPromedioQuiz() * 0.1f + getPromediTarea() * 0.1f;
        } else if (getPromedioCertamen() >= 3) {
            return getPromedioCertamen() * 0.9f + getPromedioQuiz() * 0.05f + getPromediTarea() * 0.05f;
        } else {
            return getPromedioCertamen();
        }
    }
}
