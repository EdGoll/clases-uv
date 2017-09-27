import java.util.ArrayList;
import java.util.Random;


public class Lista {
	private ArrayList<Integer> totalId = new ArrayList<Integer>();
	private ArrayList<Integer> totalalumnos = new ArrayList<Integer>();
	private ArrayList<Integer> alumnosTMP = new ArrayList<Integer>();
	private ArrayList<Alumno> alumno = new ArrayList<Alumno>();
	
	private int idMinimo = 0;// indica el minimo valor del identificador : valor default
	private int idMaximo = 100;// indica el maximo valor del identificador : valor default
	private int totalAlumnosCrear = 50;// indica el total de alumnos a crea : valor default
	private int totalAlumnosCrearMinimo = 41;//indica el minimo de alumnos que se puden crear : valor default
	private int totalAlumnosCrearMaximo = 75;//indica el maximo de alumnos que se puden crear : valor default
	public Lista(){
		
	}
	
	
	public void crearMaximoAlumnosRandom(){//crear un valor aleatoreo de alumnosque podran ser creados
		this.totalalumnos.clear();
		for(int i=this.totalAlumnosCrearMinimo;i<=this.totalAlumnosCrearMaximo;i++){
			this.totalalumnos.add(i);			
		}
		this.totalAlumnosCrear = getIdUnico(this.totalalumnos);
	}
	public Boolean crearAlumnos(){
		try{//crear el arraylist de objetos alumno
			this.alumno.clear();
			for(int i=1;i<=this.totalAlumnosCrear;i++){				
				this.alumno.add(new Alumno());
			}
			return true;
		}catch(Exception ex){
			return false;
		}
	}
	public Boolean asignarIdentificadorAlumnos(){
		try{
			if(crearTotalID().equals(true)){
				for(int i=0;i<this.alumno.size();i++){
					this.alumno.get(i).setIdentificador(getIdUnico(this.totalId));
				}
				return true;
			}else{
				return false;
			}
		}catch(Exception ex){
			return false;
		}
	}
	public Boolean asignarGruposAlumnos(){
		try{
			this.alumnosTMP.clear();
			for(int i=0;i<this.alumno.size();i++){
				this.alumnosTMP.add(this.alumno.get(i).getIdentificador());
			}
			String ultimoGrupo = "A";
			for(int i=0;i<this.alumno.size();i++){
				int resultado = getIdUnico(this.alumnosTMP);				
				for(int b = 0;b<this.alumno.size();b++){
					if(this.alumno.get(b).getIdentificador()==resultado){
						this.alumno.get(b).setGrupo(ultimoGrupo);
					}
				}
				if(ultimoGrupo == "A"){ ultimoGrupo = "B";}	
				else{ultimoGrupo = "A";}
			}
			return true;
		}catch(Exception ex){
			return true;
		}
	}
	public Boolean crearAsignarAlumnos(){
		try{//crear y asignar los identificadores de los alumnos
			if(crearAlumnos().equals(true)){
				if(asignarIdentificadorAlumnos().equals(true)){
					if(asignarGruposAlumnos().equals(true)){
						return true;
					}else{
						return false;
					}
				}else{
					return false;
				}
			}else{
				return false;
			}
		}catch(Exception ex){
			return false;
		}
	}
	
	
	public int totalAlumnosGrupo(String grupo){
		grupo = grupo.toUpperCase();
		if(grupo.equals("A") || grupo.equals("B")){
			int total = 0;
			for(int i=0;i<this.alumno.size();i++){
				if(this.alumno.get(i).getGrupo().equals(grupo)){
					total++;
				}
			}
			return total;
		}else if(grupo.equals("")){//total los 2 grupos
			int total = totalAlumnosGrupo("A");
			total+=totalAlumnosGrupo("B");
			return total;
		}else {
			return 0;
		}
	}

	public ArrayList<Alumno> traerAlumnos(){
		//retorna el arraylist de alumnos
		return this.alumno;
	}
	public ArrayList<Alumno> traerAlumnosPorGrupo(String grupo){
		//retorna el arraylist de alumnos segun grupo consultado
		grupo = grupo.toUpperCase();
		if(grupo.equals("A") || grupo.equals("B")){
			ArrayList<Alumno> tmp = new ArrayList<Alumno>();
			for(int i=0;i<this.alumno.size();i++){
				if(this.alumno.get(i).getGrupo().equals(grupo)){
					tmp.add(this.alumno.get(i));
				}
			}
			return tmp;
		}else if(grupo.equals("")){//mostrar los 2 grupos
			ArrayList<Alumno> tmp = new ArrayList<Alumno>();
			for(int i=0;i<this.alumno.size();i++){
				if(this.alumno.get(i).getGrupo().equals("A")){
					tmp.add(this.alumno.get(i));
				}
			}
			for(int i=0;i<this.alumno.size();i++){
				if(this.alumno.get(i).getGrupo().equals("B")){
					tmp.add(this.alumno.get(i));
				}
			}
			return tmp;
		}else{
			return null;
		}
	}
	public void mostarAlumnos(){
		//imprime el listado de alumnos e identificadores asignados
		for(int i=0;i<alumno.size();i++){
			System.out.println("Alumno "+ (1+i) +" identificador "+ this.alumno.get(i).getIdentificador()+ " grupo del alumno : " + this.alumno.get(i).getGrupo());
		}	
	}
	public Boolean mostrarAlumnosPorGrupo(String grupo){
		grupo = grupo.toUpperCase();
		if(grupo.equals("A") || grupo.equals("B")){
			for(int i=0;i<this.alumno.size();i++){
				if(this.alumno.get(i).getGrupo().equals(grupo)){
					System.out.println("Alumno "+ (1+i) +" identificador "+ this.alumno.get(i).getIdentificador() + " grupo del alumno : " + this.alumno.get(i).getGrupo());
				}
			}
			return true;
		}else if(grupo.equals("")){//mostrar los 2 grupos
			mostrarAlumnosPorGrupo("A");
			mostrarAlumnosPorGrupo("B");
			return true;
		}else {
			return false;
		}
	}

	//retorna un int unico segun el arraylist enviado por variable : array
	private int getIdUnico(ArrayList<Integer> array){
		if(array.size()>0){
			int index = new Random().nextInt(array.size());
			int unico = array.get(index);
			array.remove(index);
			return unico;
		}else{
			return -1;
		}
		
	}

	private Boolean crearTotalID(){
		try{
			this.totalId.clear();
			for(int i=this.idMinimo;i<=this.idMaximo;i++){
				this.totalId.add(i);
			}
			return true;
		}catch(Exception ex){
			return false;
		}		
	}
	
	public int getIdMinimo(){
		return this.idMinimo;
	}
	public Boolean setIdMinimo(int value){
		if(value <= this.idMaximo){
			this.idMinimo = value;
			return true;
		}else{
			return false;
		}		
	}		
	public int getIdMaxmo(){
		return this.idMaximo;
	}
	public Boolean setIdMaximo(int value){
		if(value >= this.idMinimo){
			this.idMaximo = value;
			return true;
		}else{
			return false;
		}
	}
	public int getTotalAlumnosCrear(){
		return this.totalAlumnosCrear;
	}
	public Boolean setTotalAlumnosCrear(int value){
		if(value >= this.totalAlumnosCrearMinimo && value <= this.totalAlumnosCrearMaximo){
			this.totalAlumnosCrear = value;
			return true;
		}else {			
			return false;
		}
	}
	public int getTotalAlumnosCrearMinimo(){
		return this.totalAlumnosCrearMinimo;
	}
	public Boolean setTotalAlumnosCrearMinimo(int value){
		if(value <= this.totalAlumnosCrearMaximo && value <= this.totalAlumnosCrear){
			this.totalAlumnosCrearMinimo = value;
			return true;
		}else {			
			return false;
		}
	}
	public int getTotalAlumnosCrearMaximo(){
		return this.totalAlumnosCrearMaximo;
	}
	public Boolean setTotalAlumnosCrearMaximo(int value){
		if(value >= this.totalAlumnosCrearMinimo && value >= this.totalAlumnosCrear){
			this.totalAlumnosCrearMaximo = value;
			return true;
		}else {			
			return false;
		}
	}
}
