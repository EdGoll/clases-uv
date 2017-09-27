//nombre:felipe fernandez ;rut 19.619.268-9

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class ListaPeliculaImpl {
	ArrayList<listaPelicula> arrPelicula = new ArrayList<listaPelicula>();

	public static void main (String[] args)throws IOException {
		ListaPeliculaImpl lista = new ListaPeliculaImpl();
		lista.agregar();
		lista.mostrar();
		lista.reporteGanancia();
		lista.buscarTiempomayor();
	}
	public void agregar()throws IOException {
		listaPelicula p =null;
		String nombre;
		Integer duracion,taquilla;
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Ingrese Nombre:");
		nombre = br.readLine();
		System.out.println("Ingrese Duración:");
		duracion = Integer.valueOf(br.readLine());
		System.out.println("Ingrese taquilla:");
		taquilla = Integer.valueOf(br.readLine());
		p=new listaPelicula(nombre,duracion,taquilla);
			
		arrPelicula.add(p);
	}
	public void mostrar() {
		listaPelicula per=null;
		for(int i=0;i<arrPelicula.size();i++) {
			per=arrPelicula.get(i);
			System.out.println(per.getNombre());
			System.out.print(per.getDuracion());
			System.out.println("minutos");
			System.out.print(per.getTaquilla());
			System.out.println("pesos");
		}
	}
	public void reporteGanancia(){
		listaPelicula per=null;
		for(int i=0;i<arrPelicula.size();i++) {
			per=arrPelicula.get(i);
			integer u = per.getTaquilla();
	
		}
	} 
	public void buscarTiempomayor(){
	}
}
