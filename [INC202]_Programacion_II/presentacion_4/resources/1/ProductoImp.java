public class ProductoImp {

    public static void main(String[] args) {
        Producto p = null;
                
        p = new ProductoFresco("01/10/2015", "Chile", "31/12/2015", 20);
        p.aString();
        p = new ProductoRefrigerado("CL-VLP-123987", "31/12/2015", 20);
        p.aString();
        p = new ProductoCongelado(7f, "31/12/2015", 20);
        p.aString();
    }
}
