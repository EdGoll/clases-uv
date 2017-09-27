public class Alumno extends Persona {
    private Nota nota;

    public Alumno(String nombre){
        super(nombre);
        nota = new Nota();
    }
    
    public void setNota(double valor) throws RangoException {
        try {
            nota.setValor(valor);
        } catch (RangoException ex) {
            System.out.println("LOG : Alumno : " + ex);
            throw ex;
        }
    }
    
    public double getNota(){
        return nota.getValor();
    }
}
