//Alejandro Oliveros Vera 19.772.624-5

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.awt.image.ImageProducer; 

public class MainPeliculas{
	public static void main(String[] args) throws IOException{
		Integer x;
		Integer fin;

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); //Leer lo que ingresa el usuario
		do{
			System.out.println("Ingrese nombre de la pelicula");
			nombre.pelicula[x] = br.readLine();
			System.out.println("Ingrese taquilla de la pelicula");
			taquilla.pelicula[x] = br.readLine();
			System.out.println("Ingrese duracion de la pelicula");
			duracion.pelicula[x] = br.readLine();
			x=x+1;
			System.out.println("Escriba 0 si desea terminar, en caso contrario, escriba 1");
			fin = br.readLine();

		}while(!fin.equals("0"));

		System.out.println("Fin de Ingreso");
	}

	public class Pelicula{
		String nombre;
		Integer taquilla;
		Integer duracion;
	}
}