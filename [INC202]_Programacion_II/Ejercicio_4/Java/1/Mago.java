public class Mago extends Personaje {

    private String poder;

    public Mago(String nombre, String poder) {
        super(nombre, 100);
        this.poder = poder;
    }

    public String encantar() {
        consumirEnergia(2);
        return String.format("%s (-%d)", poder, 2);
    }
}
