public class Guerrero extends Personaje {

    private String arma;

    public Guerrero(String nombre, int energia, String arma) {
        super(nombre, energia);
        this.arma = arma;
    }

    public String combatir(int energia) {
        consumirEnergia(energia);
        return String.format("%s (-%d)", arma, energia);
    }
}
