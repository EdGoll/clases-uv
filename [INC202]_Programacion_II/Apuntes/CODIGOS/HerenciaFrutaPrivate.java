class Fruta{
    private float precio;
    private String tipoFruta;
    public Fruta(float p, String v){
      precio=p;
      tipoFruta=v;}
	
    public void mostrar()
    {System.out.println("Variedad: "+tipoFruta+", Precio: "+precio);}}

class Manzana extends Fruta
{private int rebanada;
    public Manzana(float p, String v,int rebanada)
    {super(p,v);
	this.rebanada=rebanada;}
	void mostrarM(){
	mostrar();
    System.out.println("Rebanada:"+rebanada);}
	public void setRebanada(int valor) {
	this.rebanada=valor;}}
public class HerenciaFrutaPrivate{
   public static void main(String[] args){
       Fruta platano=new Fruta(1000,"El Platano");
       Manzana Mroja=new Manzana(500,"Manzanas rojas", 2);
       Mroja.mostrarM();
	   Mroja.setRebanada(8);
       Mroja.mostrarM();
       platano.mostrar();}}
