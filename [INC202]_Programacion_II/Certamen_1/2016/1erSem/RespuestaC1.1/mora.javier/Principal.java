public class Principal {

	public static void main(String[] args) {
		GestionPatentes g1 = new GestionPatentes();
		Capturador capturador = new Capturador();
		int opc=0;
		while(opc!=6){
			System.out.println("MENU OPCIONES\n 1) BUSCAR SITUACION POR RUT.\n 2) MOSTRAR NRO PATENTES PROVISORIAS Y DEFINITIVAS.");
			System.out.println(" 3) LISTAR DATOS DE PATENTES CON PAGOS BLOQUEADOS.\n 4) LISTAR DATOS DE LAS 10 PATENTES MAS CARAS.");
			System.out.println(" 5) GUARDAR ARCHIVO CON LA LISTA DE PATENTES POR UN AÑO INICIO DE ACT.\n 6) SALIR.");
		
			opc = capturador.ingresarDatoInt("\n Ingrese una Opción:");
				switch (opc) {
				case 1:
					g1.BuscarRut();
					capturador.pausa();
					break;
				case 2:
					g1.nroPatentes();
					capturador.pausa();
					break;
				case 3:
					g1.listarPatentesBloq();
					capturador.pausa();
					break;
				case 4:
					g1.listar10PatMasCaras();
					capturador.pausa();
					break;
				case 5:
					String ubicacion = capturador.ingresarDatoString("INGRESE UBICACION DEL ARCHIVO A GUARDAR: ");
					String año= capturador.ingresarDatoString("INGRESE AÑO DE INICIO DE ACT: ");
					g1.GuardarListaPatente(ubicacion, año);
					capturador.pausa();
					break;
				default:
					break;
				}
		}
	}
}
