
import java.util.*;

public class ImpAsignatura1 {
    
    private List<Asignatura1> listAsignatura;
        public ImpAsignatura1(){
            cargaDeDatos;
        }
    private void cargaDeDatos(){
        FuenteDeDatos f1 =new FuenteDeDatos();
        List<String> lineas = new ArrayList<String>();
        listAsignatura = new ArrayList<asignatura1>();
        Asignatura1 asignatura1= null;
        lineas= f1.leer(/*direccion csv*/ );
        
    }
    
       public void calcularPromedioQuiz(String nq1,String nq2,String nq3,String nt1,String nt2,String nc1, String nc2, String nc3);
       Asignatura1 asignatura1 = new Asignatura1(nq1,nq2,nq3,nt1,nt2,nc1,nc2,nc3);
        
}
