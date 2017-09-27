import java.util.ArrayList;
import java.util.Random;

public class Liga {

    private Equipo[] liga;
    private ArrayList<Equipo> equiposParticipantes = new ArrayList<>();
    private ArrayList<Equipo> equiposGanadores = new ArrayList<>();
    private final int NUM_EQUIPOS = 16;
    
    
    public Liga() {
        crearLiga();
    }
    
    private void crearLiga() {
        liga = new Equipo[NUM_EQUIPOS];
        for (int i = 0; i < NUM_EQUIPOS; i++) {
            liga[i] = new Equipo(i + 1);
            equiposParticipantes.add(liga[i]);
        }
    }
    
    public void jugar() {
        Equipo equipoLocal, equipoVisita;
        Random random = new Random();
        int fase = 4;

        do {
            System.out.println(getFase(fase));
            do {
                equipoLocal = equiposParticipantes.remove(random.nextInt(equiposParticipantes.size()));
                equipoVisita = equiposParticipantes.remove(random.nextInt(equiposParticipantes.size()));
                
                System.out.print(equipoLocal + " v/s " + equipoVisita + " ");
                
                if (equipoLocal.nivelJuegoColectivo() > equipoVisita.nivelJuegoColectivo()) {
                    equiposGanadores.add(equipoLocal);
                    System.out.println("Ganador: " + equipoLocal);
                } else {
                    if (equipoVisita.nivelJuegoColectivo() > equipoLocal.nivelJuegoColectivo()) {
                        equiposGanadores.add(equipoVisita);
                        System.out.println("Ganador: " + equipoVisita);
                    } else {
                        System.out.println("Empate. Ganador por sorteo: "); 
                        if(random.nextBoolean()) {
                             equiposGanadores.add(equipoLocal);
                             System.out.print(equipoLocal); 
                        } else {
                            equiposGanadores.add(equipoVisita);
                            System.out.print(equipoVisita); 
                        }
                    }
                }
            } while(equiposParticipantes.size() > 0);

            for (int i = 0; i < equiposGanadores.size(); i++) {
                equiposGanadores.get(i).actualizarHabilidades();
                equiposParticipantes.add(equiposGanadores.get(i));
            }
            equiposGanadores.clear();
            fase--;
            System.out.println();
        } while(fase > 0);
    }
    
    private String getFase(int faseId) {
        String nombreFase = null;
        switch(faseId) {
            case 1: nombreFase = "Final"; break;
            case 2: nombreFase = "Semi-Final"; break;
            case 3: nombreFase = "Cuartos"; break;
            case 4: nombreFase = "Octavos"; break;
        }
        return nombreFase;
    }
}
