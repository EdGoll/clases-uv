public class ClasePrincipal {

    public static void main(String[] args) {
        Object x = null, y = null, z = null;
        ClaseAbstracta ca = new ClaseInstanciadora(x, y, z);
        ca.metodoClasePadre();
        ca.metodoAbstracto();
    }
}