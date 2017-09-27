import java.util.*;
public class Main {
	

	public static void main(String[] args) {
		FuenteDeDatos fd = new FuenteDeDatos();
		Operaciones op = new Operaciones();
		List<String> dataset = new ArrayList<String>();
		Scanner leer = new Scanner(System.in);
		int opcion;
		boolean salir=false;

		
		dataset = fd.leerArchivo("titanic.csv");
	
		List<Pasajero>datasetL = op.ordenar(dataset);
	
		while(!salir){
			op.imprimirMenu();
			opcion =Integer.parseInt(leer.nextLine());
			switch(opcion){
				case 1: op.buscarNombre(datasetL);
				break;
				case 2: op.totalIncidentes(datasetL);
				break;
				case 3: op.clasista(datasetL);
				break;
				case 4: op.familiares(datasetL);
				break;
				case 5: op.embarcaronEn(datasetL);
				break;
				case 6: salir=true;
				break;
				default: System.out.println("hola");
				break;

			}
		}

	}
}