public class PasswordImp {

    public static void main(String[] args) {
        Password p = new Password();
        p.longitud = 20;
        p.generar();
        System.out.println("Contrasenia generada: " + p.mostrar());
        if (p.esFuerte()) {
            System.out.println("Es fuerte");
        } else {
            System.out.println("No es fuerte");
        }
    }
    
}
