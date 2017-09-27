import java.util.Scanner;

public class Capturador {
	
	
	public int ingresarDatoInt(String mensaje){			
		System.out.println(mensaje);
		return recibirInt();
	}
	public String ingresarDatoString(String mensaje){			
		System.out.println(mensaje);
		return recibirString();
	}
	public void pausa(){
		System.out.println("PRESIONE UNA TECLA PARA CONTINUAR...");
		Scanner sca = new Scanner(System.in);
		sca.nextLine();
	}
	
	private int recibirInt(){
		while(true){			
			try {
				Scanner sca = new Scanner(System.in);						
				return sca.nextInt();
			} catch (Exception e) {
				System.out.println("Error al ingresar el dato. Ingreselo de nuevo!");
			}
		}
	}
	private String recibirString(){
		while(true){			
			try {
				Scanner sca = new Scanner(System.in);						
				return sca.nextLine();
			} catch (Exception e) {
				System.out.println("Error al ingresar el dato. Ingreselo de nuevo!");
			}
		}
	}
}
