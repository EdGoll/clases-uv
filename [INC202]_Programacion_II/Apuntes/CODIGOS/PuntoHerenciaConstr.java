class Punto{
	public Punto(int x, int y){
		this.x=x;
		this.y=y;}
	public void desplazar(int dx, int dy){
		x+=dx;
		y+=dy;}
	public void mostrar(){
		System.out.println("punto de coordenadas : "+x+" " + y);}
	private int x,y;}
	
class PuntoColor extends Punto{
	public PuntoColor(int x, int y, int color){
		super(x,y);
		this.color=color;}
	public void mostrarC(){
		this.mostrar();
		System.out.println("El color del punto es :"+color);}
	private int color;}

public class PuntoHerenciaConstr{
	public static void main(String args []){
		PuntoColor pc=new PuntoColor(3,5,7);
		pc.mostrar();
		pc.mostrarC();
		PuntoColor pc2=new PuntoColor(5,7,8);
		pc2.mostrar();
		pc2.desplazar(2,3);
		pc2.mostrar();}}

