import java.util.Random;
public  class Alumnos{
	public int identificador;
	public int  alumnosID(){
		return identificador;
	}
	public int generarID(){
    return alumnosID();
	}
	@Override
    public String toString(){
		return String.format("Identificador: "+identificador);
    }
	@Override
	public boolean equals(Object  o){
		if (o instanceof Alumnos){
			Alumnos ID = (Alumnos) o;
			if (ID.identificador == this.identificador) {
			return true;
			}
		return false;
		}
		return false;
	}
}
