El dataset contiene información relacionada con las patentes locales comerciales.
Rol (String)		InicioActividad (String)
dvRol (String) 		CasaMatriz (String)
Rut (String)		Giro (String)
Dv	 		Provisoria (String)
Nombre (String)		IngProvisoria (String)
Calle (String)		Vencimiento (String)
Numero (int) 		EstadoLic (String)
Aclara (String)		CODIGO SII (String)
Pat_cTIPOPATTE (String)	ACTIVIDAD SII (String)
Monto_Patente (int)	EstadoPago (String)

El programa responde a las siguientes solicitudes:
	- BUSCAR SITUACION ACTUAL POR RUT
		Metodo: public void BuscarRut()
		Busca el estado de la patente de un contribuyente especifico.
	- NRO DE PATENTES PROVISORIAS Y DEFINITIVAS
		Metodo: public void nroPatentes()
		Muestra por pantalla el numero de patentes provisorias y definitivas.
	- LISTAR DATOS DE PATENTES CON PAGOS BLOQUEADOS
		Metodo: public void listarPatentesBloq()
		Muestra por pantalla los datos de los contribuyentes con pagos bloqueados.
	- LISTAR DATOS DE LAS 10 PATENTES MAS CARAS
		Metodo: public void listar10PatMasCaras()
		Muestra por pantalla una lista de las 10 patentes mas caras.
	- GUARDAR UN ARCHIVO CON LA LISTA DE PATENTES CON AÑO N DE INICIO DE ACTIVIDADES
		Metodo: public void GuardarListaPatente(String ubicacion, String año)
		Guarda en un archivo la lista de las patentes con un año de inicio de actividad
		establecido por el usuario.