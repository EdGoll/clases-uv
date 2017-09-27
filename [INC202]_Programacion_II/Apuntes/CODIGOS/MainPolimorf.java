class Punto{
	public Punto (int x,int y){
		this.x=x;this.y=y;}
	private int x,y;
	public void mostrar(){
		System.out.println("punto de coordenadas : "+x+" " + y);}}

class PuntoColor extends Punto{
	public PuntoColor (int x, int y, int color){
		super(x,y);
		this.color=color; }
	
	private int color;
	public void mostrar(){
		super.mostrar();
		System.out.println("El color del punto es :"+color);}}

public class MainPolimorf{
	public static void main(String args []){
		Punto [] tabPuntos=new Punto[4];
		tabPuntos[0]=new Punto(0,2);
		tabPuntos[1]=new PuntoColor(1,4,5);
		tabPuntos[2]=new PuntoColor(2,6,8);
		tabPuntos[3]=new Punto(7,8);
		for (int i=0;i<tabPuntos.length;i++)
			tabPuntos[i].mostrar();
	}}

