import java.util.Random;

public class Jugador {
    private int id;
    private int br;
    private int bg;
    private int gc;
    private char tipo;
    
    private Random r = new Random();
    
    public Jugador(int id, char tipo) {
        this.id = id;
        this.tipo = tipo;
        crearHabilidades();
    }
    
    private void crearHabilidades() {
        br = r.nextInt(100) + 1;
        bg = r.nextInt(100) + 1;
        gc = r.nextInt(100) + 1;
    }
    
    public void actualizarHabilidades() {
        crearHabilidades();
    }
    
    public int nivelJuegoIndividual(){
        if (tipo == 'P')
            gc = 0;
        return (int) Math.round(br * 0.2 + bg * 0.35 + gc * .45);
    }
}
