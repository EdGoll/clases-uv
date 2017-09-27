import java.util.Random;
import java.util.ArrayList;
public class Lista{
	private ArrayList<Alumno> listaCurso = new ArrayList<>();  //declare arraylist de objetos para que despues sea mas simple la comparacion
	private ArrayList<Alumno> listaA = new ArrayList<>();
	private ArrayList<Alumno> listaB = new ArrayList<>();
	private int largo;
	public int tamanio(){
		Random rnd = new Random();
		largo = rnd.nextInd(75) + 41;
	}
	public int llenar(){
		int idGENERADA;
		for(int i = 0;i < largo;i++){   
			Alumno llenar = new Alumno();// aqui llenamos los objetos que hay dentro del array y para eso ocupamos "pasaId" para pasar la id de cada alumno
			idGENERADA.generarId();
			llenar.pasaId(idGENERADA);
			listaCurso.add(llenar);
		}
	}
	public void separarClase(){
		int valor;
		int valor2;
		Random ran = new Random();
		for(int i;i < largo;i++){
			valor = ran.nextInd(listaAlumnos.size());
			Alumno separa = new Alumno();
			separa = listaCurso.remove(valor); // aqui ocupo otro objeto alumno para que este adquiera el valor que se le quitara a la lista del curso y que despues se le dara de forma random a la lista A o B
			valor2 = ran.nextInd(2) + 1;
			if(valor2 == 2){
				listaA.add(separa);
			}else{
				listaB.add(separa);
			}

		}
	}
	public int generarId(){
		int id = 0;
		while(id != 0){
			Random r = new Random();
			id = r.nextInd(100) + 1; //ocupo el objeto al para dividir los alumnos y pregunto atravez del metodo fijarId si la Id del objeto alumnos que esta dentro del array es igua al id , si es igual el id se hace 0 y vuelve a empesar.
			Alumno al = new Alumno();
			for(Alumno al : listaCurso) {
				if(al.fijarId() == id){
					id = 0;
					break;
				}
			}
			return id;
		}	
	}

	public void mostrar() {
		System.out.println("Curso:");
		for (Alumno al : listaAlumnos) { //aqui deberia mostar los objetos al que pertenece a la clase alumno, y tendria que mostar "alumno: id" porque fue modificado el toString con el @override
			System.out.println(al);
		}
	}
	public void mostrarAyB() {
		
		System.out.println("Grupo A:");
		for (Alumno al : listaA) {
			System.out.println(al);
		}
		System.out.println("Grupo B:");
		for (Alumno al : listaB) {
			System.out.println(al);
		}
		
	}

}	