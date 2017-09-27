public class Principal{

    public static void main(String args[]){

    	DatosP dp = new DatosP();
    	PersonaTipo pt = new PersonaTipo();
    	GetDatos gd = new GetDatos();
        PersonaImp pi = new PersonaImp();
        pi.impLineas();
        pi.guardarDatos();
        gd.menu();
        dp.getDni();
        dp.getNombre();
        dp.getApellido();
        dp.getEdad();
        dp.getDireccionP();
        dp.getDireccionL();
        dp.getCalle();
        dp.getNumero();
        pt.getAlumno();
        pt.getAcademico();
        pt.getFuncionario();


    }
}