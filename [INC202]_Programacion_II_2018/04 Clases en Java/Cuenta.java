public class Cuenta {

  private String nombre;

  public Cuenta() {}

  public Cuenta(String nombre) {
    this.nombre = nombre;
  }

  public void establecerNombre(String nombre) {
    this.nombre = nombre;
  }

  public String obtenerNombre() {
    // se refiere a this.nombre
    return nombre;
  }
}
