El dataset trata de las antenas Telefonicas en Chile desde el a�o
1997 en adelante, el cual consta de de 8 columnas (Empresa-Comuna-Region-Tipo Documento-
Nro.Documento-Fecha Documento- Id Empresa-Numero Transaccion)
En la columna empresa se encuentran 7 empresas distintas:
		-CLARO CHILE S.A.
		-ENTEL PCS TELECOMUNICACIONES S.A.
		-ENTEL TELEFONIA MOVIL S.A.
		-TELECOM CHILE S.A.
		-TELEFONICA MOVILES CHILE S.A.
		-VTR MOVIL S.A.
		-NEXTEL S.A.
Sobre las cuales se realizaran las siguientes preguntas:

Cree un menu que le permita:

	(1) BUSCAR POR IDENTIFICADOR EMPRESA.
	(2) MOSTAR LA LISTA COMPLETA.
	(3) OREDENAR LAS REGIONES DE MAYOR A MENOR.
	(4) ENCONTRAR CUAL ES LA CANTIDAD EN QUE SE ENCUENTRA LA COMPA�IA CLARO CHILE S.A. EN LA RM(RM==13)?
	(5) MOSTRAR LAS COMPA�IAS CUYAS FECHA DOCUMENTO SEA MAYOR A 2000.

	EXPLICACION:
	
	(1) El metodo public void buscar (){} lo que hace es buscar y mostrar todas las empresas 
	que pertenecen al idem que usuario ha ingresado.
	(2)El metodo public void mostrarTodo(){} muestra toda la informacion que se encuentra en
	el dataset.
	(3)El metodo public void ordenRegion(){} ordena las regiones de menor a menor.
	(4)public void busCom(int region){ busca y muestra la compa�ia CLARO CHILE S.A. en la
	region metropolitana (13)
	(5)El metodo public void anio(){} recorre todo el dataset en busca de algun dato fechaDoc
	que contenga desde el a�o 2000 en adelante y los muestra por pantalla.

