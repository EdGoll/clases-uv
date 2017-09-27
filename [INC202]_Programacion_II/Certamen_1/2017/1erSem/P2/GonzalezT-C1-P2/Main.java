import java.util.ArrayList;

public class Main {
	
	
	public static void main(String[] args) {
		Lista listado = new Lista();
		if(listado.setIdMinimo(0).equals(true)){
			System.out.println("Identificador Minimo seteado correctamente en : "+ listado.getIdMinimo());			
		}else{
			System.out.println("Identificador Minimo no seteado, indico un numero mayor que Identificador Maximo. Identificador maximo se encuentra en : " + listado.getIdMaxmo());
		}
		
		if(listado.setIdMaximo(100).equals(true)){
			System.out.println("Identificador Maximo seteado correctamente en : "+ listado.getIdMaxmo());			
		}else{
			System.out.println("Identificador Maximo no seteado, indico un numero menor que Identificador Maximo. Identificador minimo se encuentra en : " + listado.getIdMinimo());
		}
		
		
		//Setear el minimo o igual de alumnos a crear : valor para random
		if(listado.setTotalAlumnosCrearMinimo(41).equals(true)){
			System.out.println("Minimo alumno seteado correctamente en : "+ listado.getTotalAlumnosCrearMinimo());			
		}else{
			System.out.println("Minimo de alumnos no seteado, indico un numero mayor que el maximo o que los alumnos permitidos. Maximo se encuentra en : " + listado.getTotalAlumnosCrearMaximo() + " y total ha crea se encuentra en : " + listado.getTotalAlumnosCrear());
		}
		
		//Setear el maximo o igual de alumnos a crear : valor para random
		if(listado.setTotalAlumnosCrearMaximo(75).equals(true)){
			System.out.println("Maximo alumnos seteado correctamente en : "+ listado.getTotalAlumnosCrearMaximo());			
		}else{
			System.out.println("Maximo alumnos no seteado, indico un numero menor que el minimo o que los alumnos permitidos crear. Minimo se encuentra en : " + listado.getTotalAlumnosCrearMinimo() + " y total ha crea se encuentra en : " + listado.getTotalAlumnosCrear());
		}
				
		//Setear manualmente el total de alumnos a crear
		/*if(listado.setTotalAlumnosCrear(60).equals(true)){
			System.out.println("Total de alumnos a crear seteado correctamente en : "+ listado.getTotalAlumnosCrear());			
		}else{
			System.out.println("Total alumnos a crear no seteado. El valor minimo o igual es: "+listado.getTotalAlumnosCrearMinimo()+" y el valor maximo o igual es : "+ listado.getTotalAlumnosCrearMaximo());
		}*/

		//Setear el numero de alumnos a crear de manera random
		listado.crearMaximoAlumnosRandom();
		System.out.println("El nuevo numero de alumnos a crear es: " + listado.getTotalAlumnosCrear());
		
		//crear los alumnos
		if(listado.crearAlumnos().equals(true)){
			System.out.println("Alumnos creados corectamente.");
			//asignar los identificadores
			if(listado.asignarIdentificadorAlumnos().equals(true)){
				System.out.println("Identificador asignados correctamente.");
				if(listado.asignarGruposAlumnos().equals(true)){
					System.out.println("Grupos asignados correctamente.");
				}else{
					System.out.println("Grupos no asignados correctamente.");
				}
			}else{
				System.out.println("Identificador no asignados.");
			}
		}else{
			System.out.println("Alumnos no creados.");
		}
		
		//crear y asignar automaticamente los identificadores y grupos
		if(listado.crearAsignarAlumnos().equals(true)){
			System.out.println("Alumnos creados y asignados automaticamente.");
		}else {
			System.out.println("Alumnos no creados y no asignados automaticamente.");			
		}
		
		
		//Mostrar el alumno y su identificador
		System.out.println("Mostrar Alumnos y mostrar identificador.");
		//listado.mostarAlumnos();
		
		//Traer el ArrayList de alumnos y luego recorrer para mostrar los alumnos y su identificador unico
		System.out.println("Traer ArrayList de Alumnos y mostrar con identificador.");
		ArrayList<Alumno> listadoAlumnos = listado.traerAlumnos();
		for(int i=0;i<listadoAlumnos.size();i++){
			//System.out.println("Alumno "+ (1+i) +" identificador "+ listadoAlumnos.get(i).getIdentificador() + " grupo del alumno : " + listadoAlumnos.get(i).getGrupo());
		}
		
		
		//Mostrar el alumno, identificador y su grupo por orden segun grupoconsultado
		/*if(listado.mostrarAlumnosPorGrupo("A").equals(false)){//mostrar solo grupo A
			System.out.println("Solo se permiten grupoa A o B, si desea los 2 grupos indique doble comilla.");
		}*/
		/*if(listado.mostrarAlumnosPorGrupo("A").equals(false)){//mostrar solo grupo B
			System.out.println("Solo se permiten grupoa A o B, si desea los 2 grupos indique doble comilla.");
		}*/
		//listado.mostrarAlumnosPorGrupo("");//mostrar grupo A y B
		
		
		//Traer el ArrayList de alumnos segun grupoindicado y luego recorrer para mostrar los alumnos, su identificador unico y grupo
		System.out.println("Traer ArrayList de Alumnos segun grupo requerido y mostrar con identificador.");
		//rrayList<Alumno> listadoAlumnosGrupo = listado.traerAlumnosPorGrupo("A");//solo grupoA
		//ArrayList<Alumno> listadoAlumnosGrupo = listado.traerAlumnosPorGrupo("B");//solo grupo B
		ArrayList<Alumno> listadoAlumnosGrupo = listado.traerAlumnosPorGrupo("");//todos
		for(int i=0;i<listadoAlumnosGrupo.size();i++){
			//System.out.println("Alumno "+ (1+i) +" identificador "+ listadoAlumnosGrupo.get(i).getIdentificador() + " grupo del alumno : " + listadoAlumnosGrupo.get(i).getGrupo());
		}
		
		//traer el total de alumnos segun grupo
		/*System.out.println("Total grupo A : "+listado.totalAlumnosGrupo("A"));
		System.out.println("Total grupo B : "+listado.totalAlumnosGrupo("B"));
		System.out.println("Total grupo A y B : "+listado.totalAlumnosGrupo(""));
	*/
	
		
		/**/
		System.out.println("***************************************");
		System.out.println("Total grupo A : "+listado.totalAlumnosGrupo("A"));
		if(listado.mostrarAlumnosPorGrupo("A").equals(false)){//mostrar solo grupo B
			System.out.println("Solo se permiten grupoa A o B, si desea los 2 grupos indique doble comilla.");
		}
		System.out.println("***************************************");
		System.out.println("Total grupo B : "+listado.totalAlumnosGrupo("B"));
		if(listado.mostrarAlumnosPorGrupo("B").equals(false)){//mostrar solo grupo B
			System.out.println("Solo se permiten grupoa A o B, si desea los 2 grupos indique doble comilla.");
		}
		System.out.println("***************************************");
	}
}
