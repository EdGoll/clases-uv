

import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class asignatura1 {
    private List<String> lineas;
	private List<alumno> alumnos;
	public asignatura1(){
            lineas=FuenteDeDatos.leer("asignatura1.csv");	
	}
        public void llenarquiz() {
		
		alumno n;
		alumnos = new ArrayList<alumno>();
		if (lineas != null && !lineas.isEmpty()){
			
			
			for(String linea : lineas){
				n = new alumno();
				StringTokenizer st= new StringTokenizer(linea,";");
				while(st.hasMoreElements()){
                                    n.setquiz1(st.nextToken());
                                    
				}
				alumnos.add(n);
                               
			}
                         
		}
	}
        public void mostrarNotas(){
            for(alumno q:alumnos){
                System.out.println(q.getquiz1());
            }
        }
        

    
}
