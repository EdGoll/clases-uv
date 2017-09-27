// Héctor Toro Reinoso 19.268.713-6

import java.util.*;

public class Menu {
	PersonasImp persona = new PersonasImp();
	//persona.mostrarTodo();
	
	public void menu(){	
		
		int respuesta;
		
		do{
			Scanner sc1Int = new Scanner(System.in);
			Scanner sc1String = new Scanner(System.in);
				System.out.println("Ingrese la opcion que desea realizar:\n1:Muestre La Base de datos completa\n2:Busque en la base de datos\n3:Cuente las personas por parametros en comun y mostrar\n4:Elimine una persona\n5:Agrege una persona a la lista\n6:Guarde el archivo modificado\n0:SALIR");
				respuesta = sc1Int.nextInt();
				switch (respuesta){
					case 1:
						persona.mostrarTodo();
					break;
					case 2:
						menuBuscar();
					break;		
					case 3:		
						menuContar();	
					break;
					case 4:
						menuEliminar();
					break;
					case 5:
						persona.agregar();
					break;
					case 6:
						persona.escribir("New_Data_Set.scv");
					break;		
				}
				
			
		}while(respuesta!=0);
		
	}
	public void menuBuscar(){
		Scanner sc2Int = new Scanner(System.in);
		Scanner sc2String = new Scanner(System.in);
		int resp;
		int paramInt;
		String paramString;
		System.out.println("Ingrese campo por el cual desea buscar:\n 1:ID\n 2:NOMBRE\n 3:APELLIDO\n 4:FECHA NACIMIENTO \n 5:RUT\n 6:TELEFONO\n ");
					resp = sc2Int.nextInt();

					switch (resp) {
				case 1:
					System.out.println("Ingrese ID\n ");
					paramInt = sc2Int.nextInt();
					persona.buscarEntero(paramInt);
					break;
				case 2:
					System.out.println("Ingrese NOMBRE\n");
					paramString = sc2String.nextLine();
					persona.buscarString(paramString);
					break;
				case 3:
					System.out.println("Ingrese APELLIDO\n");
					paramString = sc2String.nextLine();
					persona.buscarString(paramString);
					break;
				case 4:
					System.out.println("Ingrese FECHA DE NACIMIENTO dd-mm-aa\n");
					paramString = sc2String.nextLine();
					persona.buscarString(paramString);
					break;
				case 5:
					System.out.println("Ingrese RUT\n");
					paramString = sc2String.nextLine();
					persona.buscarString(paramString);
					break;		
				case 6:
					System.out.println("Ingrese TELEFONO\n ");
					paramInt = sc2Int.nextInt();
					persona.buscarEntero(paramInt);
					break;	
				default:
					break;
				}
				
	}
	public void menuContar(){
		Scanner sc3Int = new Scanner(System.in);
		Scanner sc3String = new Scanner(System.in);
		int resp;
		int paramInt;
		String paramString;
		System.out.println("Ingrese Tipo de parametro que desea contar:\n1:Estado Civil\n2:Hijos\n3:Zona\n4:Facultad\n5:Cargo \n6:Salario");			
		resp = sc3Int.nextInt();
		switch (resp) {
			case 1:
				System.out.println("Ingrese Estado civil \nSoltero\nSeparado\nCasado\nDivorciado\nOtros");
				paramString = sc3String.nextLine();
				persona.contarString(paramString);
			break;
			case 2:
				System.out.println("Ingrese numero de hijos");
				paramInt = sc3Int.nextInt();
				persona.contarEntero(paramInt);
			break;
			case 3:
				System.out.println("Ingresa zona que deseas buscar:\n Norte\n Centro \nSur");
				paramString = sc3String.nextLine();
				persona.contarString(paramString);
			break;
			case 4:
				System.out.println("Ingrese facultad que desea buscar \nAdministracion\tDiseño\tComunicacion\tIngenieria\tMedicina\tDerecho\tPublicidad");
				paramString = sc3String.nextLine();
				persona.contarString(paramString);
			break;
			case 5: 
				System.out.println("Ingrese cargo que desea buscar");
				paramString = sc3String.nextLine();
				persona.contarString(paramString);
			break;
			case 6:
				System.out.println("Ingrese sueldo que desea buscar");
				paramInt = sc3Int.nextInt();
				persona.contarEntero(paramInt);
			break;
			default:
			break;
		}
		
	}
	public void menuEliminar(){
		Scanner sc4Int = new Scanner(System.in);
		Scanner sc4String = new Scanner(System.in);
		int resp;
		int paramInt;
		String paramString;
		System.out.println("Ingrese campo por el cual desea buscar:\n 1:ID\n 2:NOMBRE\n 3:APELLIDO\n 4:FECHA NACIMIENTO \n 5:RUT\n 6:TELEFONO\n ");
					resp = sc4Int.nextInt();

					switch (resp) {
				case 1:
					System.out.println("Ingrese ID\n ");
					paramInt = sc4Int.nextInt();
					persona.eliminarEntero(paramInt);
					break;
				case 2:
					System.out.println("Ingrese NOMBRE\n");
					paramString = sc4String.nextLine();
					persona.eliminarString(paramString);
					break;
				case 3:
					System.out.println("Ingrese APELLIDO\n");
					paramString = sc4String.nextLine();
					persona.eliminarString(paramString);
					break;
				case 4:
					System.out.println("Ingrese FECHA DE NACIMIENTO dd-mm-aa\n");
					paramString = sc4String.nextLine();
					persona.eliminarString(paramString);
					break;
				case 5:
					System.out.println("Ingrese RUT\n");
					paramString = sc4String.nextLine();
					persona.eliminarString(paramString);
					break;		
				case 6:
					System.out.println("Ingrese TELEFONO\n ");
					paramInt = sc4Int.nextInt();
					persona.eliminarEntero(paramInt);
					break;	
				default:
					break;
					}
			
	}

}
