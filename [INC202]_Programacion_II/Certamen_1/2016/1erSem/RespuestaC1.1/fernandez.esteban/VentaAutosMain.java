package ventaautos;

public class VentaAutosMain {
    
    public static void main(String args[]){
        VentaAutosImpl V = new VentaAutosImpl();
        V.dMayorMenor();
        V.ventasToyota();
        V.CaidaCrecida();
        V.BuscarRanking();
        V.BuscarMarca();
    }
}
