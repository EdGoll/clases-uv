class PuntoT{
	private int x,y;
	public void inicializar (int abs, int ord){
		x=abs;
		y=ord;}
	public void desplazar(int dx, int dy){
		x+=dx;
		y+=dy;}
	public void mostrar(){
		System.out.println("punto de coordenadas : "+x+" " + y);}}

class PuntoColor extends PuntoT{
	private int color;
	public void colorM (int color){
		this.color=color;}
	public void mostrarC(){
		this.mostrar();
		System.out.println("El color del punto es :"+color);}}

public class PuntoHerencia{
	public static void main(String args []){
		PuntoColor pc=new PuntoColor();
		pc.mostrar();
		pc.inicializar(3,5);
		pc.colorM(3);
		pc.mostrarC();
		pc.desplazar(2,3);
		pc.mostrar();
		PuntoT p1=new PuntoT();
		p1.inicializar(4,7);
		p1.mostrar();}}


