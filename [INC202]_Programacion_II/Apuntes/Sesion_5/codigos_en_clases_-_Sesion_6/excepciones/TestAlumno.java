public class TestAlumno {
    private Alumno alumno;
    
    public void crearAlumno(String nombre){
        alumno = new Alumno(nombre);
    }
    
    public void agregarNota(String strNota){
        double valorNota = 0.0;
        try {
            valorNota = Double.parseDouble(strNota);
            System.out.println("LOG : agregando nota ...");
            alumno.setNota(valorNota);
            System.out.println("LOG : nota agregarda exitosamente");
        } catch (RangoException ex){
            //aqui se debe controlar un control de la GUI
            System.out.println("INFO USUARIO : ");
            System.out.println(ex.getMessage());
        } catch (NumberFormatException nfe){
            System.out.println("INFO USUARIO : ");
            System.out.println("Favor revise valor nota");
        }
    }
    
    public void imprimirAlumno(){
        System.out.println("Alumno : " + alumno.getNombre());
        System.out.println("Nota   : " + alumno.getNota());
    }
}
