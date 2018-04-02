public class Main2 {

  public static void main(String[] args) {

    Cuenta miCuenta1 = new Cuenta();
    System.out.println("Nombre cuenta: " + miCuenta1.obtenerNombre());

    Cuenta miCuenta2 = new Cuenta("Juanito");
    System.out.println("Nombre cuenta: " + miCuenta2.obtenerNombre());

  }
}
