public abstract class ClaseAbstracta extends ClasePadre implements Interfaz {

    private Object z;

    public ClaseAbstracta(Object x, Object y, Object z) {
        super(x, y);
        this.z = z;
    }

    @Override
    public abstract void metodoAbstracto();
}
