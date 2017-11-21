package modelo;
import java.util.List;

public interface PersonaDAOInterface {
	public Persona crearPersona(Persona nuevoRegistro);
	public void eliminarPersona(Persona elimRegistro);
	public void actualizarPersona(Persona actRegistro);
	public Persona buscarPersona(int idPersona);
	public List<Persona> personas();
}
