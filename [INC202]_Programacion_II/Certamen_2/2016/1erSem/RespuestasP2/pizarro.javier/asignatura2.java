/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;
public class asignatura2 {
    
    private List<String> lineas;
	private List<alumno> alumnos;
	public asignatura2(){
            lineas=FuenteDeDatos.leer("asignatura2.csv");	
	}
        public void llenarquiz() {
		
		alumno n;
		alumnos = new ArrayList<alumno>();
		if (lineas != null && !lineas.isEmpty()){
			
			
			for(String linea : lineas){
				n = new alumno();
				StringTokenizer st= new StringTokenizer(linea,";");
				while(st.hasMoreElements()){
                                    n.setquiz1(st.hashCode());
                                    
				}
				alumnos.add(n);
                               
			}
                         
		}
	}
}
