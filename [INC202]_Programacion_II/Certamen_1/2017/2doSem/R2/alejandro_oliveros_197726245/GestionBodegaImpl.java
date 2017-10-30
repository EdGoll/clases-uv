//Alejandro Oliveros Vera    19.772.624-7
package gestionbodegaimpl;

import java.io.IOException;

public class GestionBodegaImpl {

    public static void main(String[] args) throws IOException {
        GestionBodega bodega = new GestionBodega();
        bodega.crearProducto();
        bodega.listarStock();
        bodega.venderProductos();
    }  
}
