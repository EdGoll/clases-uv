package selftest;

public class Pregunta3{ }

abstract class A {
    abstract short m1 ( ) ;
    short m2 ( )  {  return (short)  420;   }
}

abstract class B extends A {
    // missing code ?
    // notese que al marcar el metodo m2(...) como absctracto
    // se esta "perdiendo" la implementacion de la clase A
    abstract short m2 ( ) ; 
    short m1 ( )  { return (short) 42; }
}
