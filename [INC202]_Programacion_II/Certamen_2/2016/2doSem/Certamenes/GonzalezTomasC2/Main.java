

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Registro lista = new Registro();
		Scanner sc = new Scanner(System.in);
		int resp =0;
		do {
			System.out.println("Que desea hacer 1 : MOSTRAR \n 2: AGREGAR \n 3: GUARDAR \n 0:SALIR ");
			resp = sc.nextInt();
			switch (resp) {
			case 1:
			lista.mostrar();	
				break;
			case 2:
			lista.agregar();	
				break;
			case 3:
			lista.guardarConsolidado();	
				break;
	
			default:
				break;
			}
		} while (resp !=0);
		sc.close();
	}

}
