



public class T_principal {

    public static void main(String[] args) {
        bus a = new bus(45);

        T_entrada te = new T_entrada(a);
        T_salida ts = new T_salida(a);

        te.start();

        ts.start();

    }
}