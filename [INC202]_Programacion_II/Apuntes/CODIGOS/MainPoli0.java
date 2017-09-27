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

public class MainPoli{
	public static void main(String args []){
		Punto p;
		p=new Punto(3,5);
		....

