import javax.swing.*;
import java.util.Scanner;
import java.awt.Color; 

class MiVentana extends JFrame{
	public MiVentana() //constructor
	{	setTitle("Mi primera ventana");
		setSize(300,150);
		//setDefaultCloseOperation(EXIT_ON_CLOSE);}}
//setDefaultCloseOperation(DISPOSE_ON_CLOSE);}}


public class Grafica3 {
	public static void main (String arg []){
		//JFrame ven = new MiVentana();
		Scanner leer =new Scanner(System.in);
		
		while (true) {
			JFrame ven = new MiVentana();
			System.out.println("Ingrese el largo : ");
			int largo = leer.nextInt();
			System.out.println("Ingrese el ancho : ");
			int ancho = leer.nextInt();
			System.out.println("Elija entre el rojo, verde y azul 
							   para el color de fondo : ");
			String color = leer.next();
		
