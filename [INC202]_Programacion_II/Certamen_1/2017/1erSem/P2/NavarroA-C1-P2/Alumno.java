/*En esta clase se almacena el Id unico de cada alumno que se
pasan por referencia desde la clase Lista a traves del metodo llenarId()
ademas esta la clase mostrarId, para visualizar el numero*/
public class Alumno{
	int identificacion;

	public void llenarId(int id){
		identificacion = id;
	}
	public void mostrarId(){
		System.out.println("id: "+identificacion);
	}
}