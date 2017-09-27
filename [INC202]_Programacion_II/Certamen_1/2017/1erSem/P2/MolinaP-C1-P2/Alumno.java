import java.util.ArrayList;
import java.util.Collections;
public class Alumno{
	private ArrayList identificador = new ArrayList();
	private ArrayList numeros= new ArrayList();

	public void llenar(){
		for(int i=1; i<=100; i++){
			numeros.add(i);
		}
		Collections.shuffle(numeros);
	}
	public ArrayList asignarIdentificador(int tamaño){
		for(int i=0; i<tamaño; i++){
			identificador.add(numeros.get(i));
		}
		return identificador;
	}
}