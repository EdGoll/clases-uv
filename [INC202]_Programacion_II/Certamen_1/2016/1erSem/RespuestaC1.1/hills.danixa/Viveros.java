import java.util.Scanner;
public class Viveros {

    public static void main(String[] args) {
      ViverosImp A =new ViverosImp();
     
      Scanner sc = new Scanner(System.in);
      int opc;
      while(true){
        System.out.println("      Menù    ");

        System.out.println("1-calcular la cantidad de dueñas de los viveros");
        System.out.println("2-Calcular inscripciones del año 2009");
        System.out.println("3-Buscar tipo de Vivero");
        System.out.println("4- Mostrar  propietarios");
       	System.out.println("5-Listado de Especie1 que produce la region de Valparaiso");
         opc= sc.nextInt();
		
			switch(opc){
				case 1:  A.contarPropFemenina();
				break;
				case 2:  A.obtenerFecha();
				break;
				case 3:  A.buscador();
				break;
				case 4:  A.obtenerPropietarios();
                                break;
				case 5:  A.mostrarListado();  
				break;	
			}
		}
      
  }
    
}
