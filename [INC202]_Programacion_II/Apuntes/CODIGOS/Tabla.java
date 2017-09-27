abstract class Afichar{
	abstract public void mostrar();}
class Entero extends Afichar{
	public Entero(int n){ valor=n;}
	public void mostrar(){
		System.out.println("El valor es : : " + valor);}
	private int valor;	}
class Flotante extends Afichar{
	public Flotante(float x){ valor=x;}
	public void mostrar(){
		System.out.println("El valor es : : " + valor);}
	private float valor;	}
public class Tabla {
	public static void main (String arg[]){
		Afichar[] tab;
		tab=new Afichar[3];
		tab[0]=new Entero(24);
		tab[1]=new Flotante(3.4f);
		tab[2]=new Entero(24);
		for (int i=0;i<3;i++)
			tab[i].mostrar();}}
