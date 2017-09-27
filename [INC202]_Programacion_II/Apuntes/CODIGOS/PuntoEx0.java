class A{
	....
	public void f (int n) {...}
	public void f (float x) {...}
}
class B extends A{
	....
	public void f (int n) {...} //redefinicion de f(int n)
	public void f (double y) {...} // sobrecarga de f
}
.....
A a; B b;
int n;float x; double y;
...
a.f(n); //sobrecarga 
a.f(x); //sobrecarga 
a.f(y); //error
b.f(n); //redefinicion
b.f(x); //sobrecarga
b.f(y); //sobrecarga de A