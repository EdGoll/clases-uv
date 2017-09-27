import java.util.ArrayList;
import java.util.Random;
public  class Alumno{
  protected int identificador = 0; // Variable identificador con la variable de acceso Protected, para poder acceder pero no modificar
  /*En el metodo ingresarIdentificador(), se crea un identificador y se retorna para que el objeto lo tome y lo valide  */
  private int  ingresarIdentificador(){
    Random dg = new Random();
    identificador = dg.nextInt(101);
    return identificador;
  }
  /*Retorna el Valor para ser Usado*/
  public int asignarId(){
    return ingresarIdentificador();
  }
  /*metodo que nos proporsiona mostar el dato del Alumno*/
  @Override
    public String toString(){
      return String.format("ID:"+identificador);
    }
    /*Se sobre escribe el metodo equals() de el Objet, el cual nos permite saber si un Alumno es igual a otro
    (Esta copiado igual al ejemplo de la clase y modificado para el uso de este programa*/
  @Override
  public boolean equals(Object  o){
    if (o instanceof Alumno){
      Alumno a = (Alumno) o;
      if (a.identificador == this.identificador) {
        return true; // me retorna un verdadero para que pueda entrar en la sentencia de la linea 39 de Lista.java, y asi cambiar la bandera.
      }
      return false; // si no es igual el valor, se retorna false
}
return false; // si el objeto entrante no es una instacia de Alumno.java, se retorna false.
}
}
  