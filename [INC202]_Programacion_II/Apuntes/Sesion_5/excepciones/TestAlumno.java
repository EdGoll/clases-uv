public class TestAlumno {
    private Alumno alumno;
    
    public void crearAlumno(String nombre){
        alumno = new Alumno(nombre);
    }
    
    public void agregarNota(String strNota){
        double valorNota = Double.parseDouble(strNota);
        
        alumno.setNota(valorNota);
    }
    
    public void imprimirAlumno(){
        System.out.println("Alumno : " + alumno.getNombre());
        System.out.println("Nota   : " + alumno.getNota());
    }
}
