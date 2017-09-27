public class Alumno extends Persona {
    private Nota nota;

    public Alumno(String nombre){
        super(nombre);
        nota = new Nota();
    }
    
    public void setNota(double valor){
        nota.setValor(valor);
    }
    
    public double getNota(){
        return nota.getValor();
    }
}
