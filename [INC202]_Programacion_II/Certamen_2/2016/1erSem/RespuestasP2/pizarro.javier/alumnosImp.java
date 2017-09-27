/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class alumnosImp {
    private List<String> lineas;
	private List<alumno> alumnos;
	public alumnosImp(){
            lineas=FuenteDeDatos.leer("alumnos.csv");	
	}
        public void llenarNombre() {
		
		alumno a;
		alumnos = new ArrayList<alumno>();
		if (lineas != null && !lineas.isEmpty()){
			
			
			for(String linea : lineas){
				a = new alumno();
				StringTokenizer st= new StringTokenizer(linea,";");
				while(st.hasMoreElements()){
                                    a.setid(st.nextToken());
                                    a.setapellidoP(st.nextToken());
                                    a.setapellidoM(st.nextToken());
                                    a.setnombres(st.nextToken());   
				}
				alumnos.add(a);
                               
			}
		}
	}
        public void mostrar(){
            for(alumno c: alumnos){
                System.out.println(c.getapellidoM());
            }
        }

        

}
