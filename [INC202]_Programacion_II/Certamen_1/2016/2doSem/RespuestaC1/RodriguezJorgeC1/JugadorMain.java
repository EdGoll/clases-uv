public class JugadorMain {
     
    public static void main(String[] args) {
        JugadorImp ji = new JugadorImp();
        Encuentro e = new Encuentro();
        ji.llenarJugador();
        
        ji.mostrar();
        ji.totalJugadores();
       e.llenarEquipo();
    }
}
