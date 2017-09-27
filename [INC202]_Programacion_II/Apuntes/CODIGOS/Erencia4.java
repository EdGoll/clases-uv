class A { // clase a sin constructor
public A(){} //constructor de A
	public A(int n){}} //constructor de A
class B extends A {
	 //sin constructor
	B b=new B //llama al constructor sin argumentos de A

class A { // clase a sin constructor
	public A(int n){}} //constructor de A
class B extends A {
	//sin constructor
	B b=new B //error!

class A { // clase a sin constructor
	//sin constructor
	class B extends A {
	//sin constructor
	B b=new B //llama al constructor por defecto de A
