import java.util.ArrayList;
import java.util.Random;
public class Lista{
	private ArrayList<Alumnos> listaAlumnos = new ArrayList<Alumnos>();
	private ArrayList<Alumnos> listaA = new ArrayList<Alumnos>();
	private ArrayList<Alumnos> listaB = new ArrayList<Alumnos>();
	private int tamanio;
	public void tamanioLista(){
		Random r = new Random();
		tamanio=r.nextInt(35) + 40;
		System.out.println("Cantidad de alumnos: "+ tamanio);
	}
	public void llenarIdentificador(){
		Alumnos ID2 = new Alumnos();
		Random r = new Random();
		for (int i=0;i<tamanio;i++){
			ID2.generarID();
			ID2.identificador = r.nextInt(100)+1;
			ID2.generarID();
			listaAlumnos.add(ID2);
		}
	}
	public void compararIdentificador(){
		for (int i=0;i<tamanio;i++){
			Alumnos ID = new Alumnos();
			boolean verificador=true;
			while(!verificador){
				ID.alumnosID();
				for(int j=0;j<listaAlumnos.size();j++){
					if(ID.equals(listaAlumnos.get(j))){
						verificador=false;
					}
				}
			}
		}

	}
	public void distribuirAlumnos(){
		Random r = new Random();
		int bandera=0;
		for (int i=0;i<tamanio;i++){
			boolean distribuidor;
			distribuidor=r.nextBoolean();
			if (distribuidor==true){
				listaA.add(listaAlumnos.get(i));
			}else{
				listaB.add(listaAlumnos.get(i));
			}
			bandera++;
		}
	}
	public void mostrarLista() {
		System.out.println("Alumnos: ");
		for (Alumnos a : listaAlumnos) {
			System.out.println(a);
		}
	}
	public void mostrarGrupos() {
		System.out.println("Grupo A:");
		for (Alumnos a : listaA) {
			System.out.println(a);
		}
		System.out.println("Grupo B:");
		for (Alumnos a : listaB) {
			System.out.println(a);
		}
	}
	public Lista(){
		tamanioLista();
		llenarIdentificador();
		compararIdentificador();
		distribuirAlumnos();
		mostrarLista();
		mostrarGrupos();
	}
}