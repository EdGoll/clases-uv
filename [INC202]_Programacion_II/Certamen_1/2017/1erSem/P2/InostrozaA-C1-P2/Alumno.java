public class Alumno
{	
	/**
	 * Identificador
	 */
	public int id;
	
	/**
	 * Constructor
	 * 
	 * @param id	Identificador asignado en la funcion generarId() de la clase Lista
	 */
	public Alumno(int id)
	{
		this.fijarId(id);
	}
	
	/**
	 * Fija el id y lo muestra en pantalla
	 * 
	 * @param id	Identificador asignado en la funcion generarId() de la clase Lista
	 */
	public void fijarId(int id)
	{
		this.id = id;
		System.out.println("Agregado alumno con id: "+this.id);
	}
	
	/**
	 * Muestra la informacion del alumno
	 */
	public void mostrar()
	{
		System.out.println("Alumno "+this.id);
	}
	
	public boolean comparar(Alumno alumno)
	{
		if(this.id == alumno.id)
			return true;
		else
			return false;
	}	
}