public class PuntoT{
	int x,y;
	public PuntoT (int abs, int ord){
		x=abs;
		y=ord;
		System.out.println("Constructor con dos argumentos "+x+" "+ y);}
	public PuntoT (){
		this(0,0);
		System.out.println("Constructor sin argumentos");}
	public static void main(String arg[]){
		PuntoT a=new PuntoT(3,5);
		PuntoT b=new PuntoT();}}