//Héctor Toro Reinoso 19.268.713-6
*El Data_set es una base de datos de empleados de una universidad y consta de 13 parametros :
    int id : Idenntificador empleado
	String apellido : Apellido 
	String nombre : Nombre
	String fechNacim : 	Fecha de Nacimiento
	String rut : Rut
	String estCivil : Estado civil
	int numHijos : Número de Hijos
	String zona : Zona en la que trabaja
	int telefono : Telefono
	String facultad : Facultad en la que trabaja
	String cargo : Cargo que tiene en la universidad
	int sueldo : Sueldo
	String fechComien : Fecha en la que comenzó a trabajar
*El programa me permite realizar las siguientes acciones:
	
	**1:Muestre La Base de datos completa
		Mediante el metodo "mostraTodo();" de la clase PersonasImp el programa muestra la base de datos completa previamente cargada   
	**2:Busque en la base de datos una persona especifica por parametros identificativos:
		1:ID-2:NOMBRE-3:APELLIDO-4:FECHA NACIMIENTO-5:RUT-6:TELEFONO
		***El programa mediante dos metodos, de la clase PersonasImp, recorre y compara el arreglo con el parametro enviado. Método "buscarEntero();", si se trata de un parametro de tipo entero y "buscarString();", si se trata de un parametro de tipo String
	**3:Cuente las personas que tengan los siguientes parametros en comun y luego muestrelos por pantalla
		1:Estado Civil-2:Hijos-3:Zona-4:Facultad-5:Cargo-6:Salario
		***El programa mediante el metodo "contarEntero();", si se trata de un parametro de tipo entero busca y cuenta cuantas personas con éste parametro hay en el data_set para luego mostrarlos y "contarString();", si se trata de un parametro de tipo String.
	**4:Elimine una persona en especifico 
		***El programa mediante el metodo "eliminarEntero();" buscaa y elimina la persona con el parametro de tipo entero antes indicado por el usuario y "eliminarString();" si se trata de un tipo de dato String ingresado por el usuario
	**5:Agrege una persona al data set
		***El programa agraga una persona al final de la lista pidiendo los datos al usuario
	**6:Guarde el archivo modificado con extencion .csv con el nombre "New_Data_Set.scv"
		***El programa guarda los cambios hechos en el data_set en otro archivo 
	***Para que el usuario pueda realizar otra accion dentro del programa se utiliza el metodo "menu();" de la clase Menu. 	
	