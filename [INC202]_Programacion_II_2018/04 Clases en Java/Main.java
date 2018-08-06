public class Main {

  public static void main(String[] args) {

    Cuenta miCuenta = new Cuenta();
    System.out.println("Nombre cuenta: " + miCuenta.obtenerNombre());

    miCuenta.establecerNombre("Juanito");
    System.out.println("Nombre cuenta: " + miCuenta.obtenerNombre());

  }
}
