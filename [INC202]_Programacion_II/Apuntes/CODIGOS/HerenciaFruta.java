class Fruta{
    float precio;
    String tipoFruta;
    public Fruta(float p, String v){
      precio=p;
      tipoFruta=v;}
	
     public void mostrar()
    {System.out.println("Variedad: "+tipoFruta+", Precio: "+precio);}}

class Manzana extends Fruta
{	int rebanada;
    public Manzana(float p, String v,int rebanada){
		super(p,v);
		this.rebanada=0;}
    
	public void mostrar()
    {System.out.println("Variedad: "+tipoFruta+", Precio: "+precio+", Rebanada:"+rebanada);}}

public class HerenciaFruta {
   public static void main(String[] args){
       Fruta platano=new Fruta(1000,"El Platano");
       Manzana Mroja=new Manzana(500,"Manzanas rojas", 2);
       Mroja.rebanada=1;
       Mroja.mostrar();
       platano.mostrar();}}
