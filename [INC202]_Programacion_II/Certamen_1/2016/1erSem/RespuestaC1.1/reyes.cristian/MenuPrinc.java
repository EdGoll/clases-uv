import java.util.Scanner;

public class MenuPrinc {
	CompaniasIMP plist= new CompaniasIMP();
	public void menuP(){
		Scanner in= new Scanner(System.in);
		while(true){
			System.out.println("Ingrese una opcion: ");
			System.out.println("	(1) CREE UN BUSCADOR POR IDENTIFICADOR EMPRESA.");
			System.out.println("	(2) MUESTRE LA LISTA COMPLETA.");
			System.out.println("	(3) OREDENE LAS REGIONES DE MAYOR A MENOR.");
			System.out.println("	(4) CUAL ES LA CANTIDAD EN QUE SE ENCUENTRA LA COMPAÑIA CLARO CHILE S.A. EN LA RM?");
			System.out.println("	(5) MUESTRE LAS COMPAÑIAS CUYAS FECHA DOCUMENTO SEA MAYOR A 2000.");
			
			int opc;
			opc= in.nextInt();
				switch(opc){
					case 1: plist.buscar();
					break;
					case 2:plist.mostrarTodo();
					break;
					case 3:plist.ordenRegion();   
					break;
					case 4:int region= 13;
					       plist.busCom(region);
				    break;
					case 5: plist.anio();
					break;
					
				}
			}
	}
	
}
