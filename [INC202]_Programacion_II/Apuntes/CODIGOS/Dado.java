public class Dado {
	public Dado(){
		this(6);
	}
	public Dado(int caras){
		numCaras=caras;
		lanzar();
	}
	public int lanzar(){
	//	int a=;
		valor=(int)(Math.random()*numCaras)+1;
		//System.out.println(a);
		return valor;
	}
	public int getValor(){
		return valor;
	}
	private final int numCaras;
	private int valor;
}

