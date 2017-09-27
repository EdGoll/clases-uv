import java.util.ArrayList;
import java.util.Random;
public class Lista{
	/* Se instancia  ArrayList de Tipo Alumno, en donde Guardará ID Caracteristicos de alumnos
	"lista1, lista2.
	Ademas "listasinrepeticion", guarda los ID sin Repeticion */
  private ArrayList <Alumno> lista1 = new ArrayList <Alumno> (); 
  private ArrayList <Alumno> lista2 = new ArrayList <Alumno> ();
  private ArrayList <Alumno> listasinrepeticion = new ArrayList <Alumno> ();
  /*
	Declaro un Atributo y su Respectivo Metodo, con la cantidad de 
	Alumno del curso, Calulado Randomicamente de 40 a 75 alumno, segun dice la pauta
  */
  private int listacurso = 0;
  public void instanciarNumerodeLista(){
  	Random dg = new Random();
  	listacurso = dg.nextInt(35)+40;
  }
  /*
	Luego de hacer un analisis exautivo, realize un metodo que ingrese sin repeticiones ID de los estuiantes
	lo recorro en un bucle con la lista randomica, declaro una bandera(validador), ademas instacio el objeto de alumno
	el cual agregara los ID al ArrayList

  */
  public void ingresarIdSinRepeticion(){
  	Alumno x1 = new Alumno();
  	for (int i = 0; i < listacurso; i++ ) {
  		boolean bandera = false;
  		Alumno autofor = new Alumno();
  		int constante = 0;
  		while (!bandera) { // si es Falsa.
  			bandera = true; // Cambio Sentencia para notar el cambio, mediante el for siguiente
  			autofor.asignarId();// Se le asigna el ID, mediante el metodo asignarid()
  			// la facultad de asignar un id mediante un metodo retornado, es que podemos cambiar la semilla dentro del bucle y no cambiar el objeto
  			/* En esta sentencia, voy barriendo con mi constante y a la vez comparo si el numero esta o no en la lista
  			*/
  			constante++;
  			for (int const_validador = 0; const_validador < listasinrepeticion.size() ; const_validador++ ) {
  				if (autofor.equals(listasinrepeticion.get(const_validador))) {
  					bandera = false; // si es asi, salgo del ciclo y vuelvo a pedir un numero ID hasta que sea diferente
  				}
  			}
  		}
  		if (bandera){
  			listasinrepeticion.add(autofor);// si la sentencia termino verdadera, es decir un numero diferente, se agrega.
  		}
  	}

  }
  /* En el siguiente metodo se separa en las dos listas, A y B (lista1 lista2), se importa un Random Booleano
  */
  public void separarParaElCertamen3(){
  	for (int i = 0; i < listasinrepeticion.size() ; i++ ) {
  	boolean bandera;
  	Random bo = new Random();
  	bandera = bo.nextBoolean(); 				//  se Escanea un Random boleano si es verdadera agrega en la lista 1
  	if(bandera){
  		lista1.add(listasinrepeticion.get(i));
  	}else{										// si es falsa, se agrega a la lista 2 
  		 lista2.add(listasinrepeticion.get(i));
  			}
  		}
	}
	/*
		El siguiente metodo, muestra Los dos Archivos ordenados, para la salida estandar.
	*/
	public void mostrarCursosCerta3(){
		System.out.println("\n\nProfesor, para realizar el Certamen 3, con "+listacurso+" alumnos, deberia ser de esta forma:\n");			
		
		System.out.print("Grupo A de "+lista1.size()+" alumnos:\t[");
		for (int i = 0 ; i<lista1.size() ; i++ ) {
			System.out.print(lista1.get(i).toString()+"\t");
		}
		System.out.print("]\n\n\n");	
		System.out.print("Grupo B de "+lista2.size()+" alumnos :\t[");
		for (int i = 0 ; i<lista2.size() ; i++ ) {
			System.out.print(lista2.get(i).toString()+"\t");
			}
		System.out.print("]\n");	
			
}
	}

