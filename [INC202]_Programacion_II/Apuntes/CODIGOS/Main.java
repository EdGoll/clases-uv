class A{
	public int n=8;
	public void mostrar(){
		System.out.println ("En A n= "+ n);}}
class B extends A{
	public float n=5.6f;
    public void mostrar(){
		n=5.34f;
		super.n=4;
		System.out.println ("En B n= "+ n);
	    super.mostrar();}}
public class Main{		
	public static void main(String args []){
		A a=new A();
		B b=new B();
		System.out.println ("a.n= "+ a.n);
		System.out.println ("b.n= "+ b.n);
	    b.mostrar();}}