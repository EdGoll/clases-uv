public class Alumno {
	public int ident;
	public String grupo;
	
	public int getIdent() {
		return ident;
	}
	
	public void setIdent(int id) {
		ident = id;
	}
	
	public String getGrupo() {
		return grupo;
	}
	
	public void setGrupo(String grup) {
		grupo = grup;
	}
	
	@Override
	public String toString() {
		return String.format("%s %s", ident, grupo);
	}
}