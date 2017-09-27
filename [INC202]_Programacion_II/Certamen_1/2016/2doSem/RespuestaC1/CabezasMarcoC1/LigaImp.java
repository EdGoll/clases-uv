
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class LigaImp {

    public List<Jugador> jdr;
    public List<Equipo> ListaEquipo = new ArrayList<>();
    public List<Equipo> temp = new ArrayList<>();
    public List<Equipo> aux;
    public List<Encuentro> l_encuentro;
    int[] n_equipos = new int[16];
    int[] ne = new int[16];
    int[] ne2;
    Liga liga = new Liga();
    Random rnd = new Random();

    public void crearEquipo() {
        Equipo equipo;
        for (int i = 1; i <= 16; i++) {
            equipo = new Equipo();
            equipo.setNombreId(i);
            equipo.setEquipo(generarEquipo());
            equipo.setNj_colectivo(nivelJuegoColectivo(equipo.getEquipo()));
            ListaEquipo.add(equipo);
        }
        System.out.println("EquipoGenerado");
        match(ListaEquipo);
        reiniciarEquipo(temp);
        match(temp);
        reiniciarEquipo(temp);
        match(temp);
        reiniciarEquipo(temp);
        match(temp);

    }

    List<Jugador> generarEquipo() {
        Jugador nj;

        jdr = new ArrayList<>();
        for (int i = 1; i <= 11; i++) {
            nj = new Jugador();
            nj.setId(i);
            nj.setBR(recuperarBalones());
            nj.setBG(entregarBalones());
            if (i == 1) {
                nj.setGC(0);
                nj.setTipo("Arquero");
            } else if (1 < i && i <= 4) {
                nj.setGC(capacidadGoleadora());
                nj.setTipo("Defensa");
            } else if (4 < i && i <= 6) {
                nj.setGC(capacidadGoleadora());
                nj.setTipo("Lateral");
            } else if (6 < i && i <= 8) {
                nj.setGC(capacidadGoleadora());
                nj.setTipo("Centro Campista");
            } else if (8 < i && i <= 11) {
                nj.setGC(capacidadGoleadora());
                nj.setTipo("Delantero");
            }
            nj.setNj_invididual(nivelJuegoInvididual(nj.getBR(), nj.getBG(), nj.getGC()));
            jdr.add(nj);
        }
        return jdr;

    }

    public void reiniciarEquipo(List<Equipo> temp) {
        for (Equipo temp1 : temp) {
            for (Jugador jugador : temp1.getEquipo()) {
                if (jugador.getId() == 0) {
                    jugador.setBR(recuperarBalones());
                    jugador.setBG(entregarBalones());
                } else {
                    jugador.setBR(recuperarBalones());
                    jugador.setBG(entregarBalones());
                    jugador.setGC(capacidadGoleadora());
                }
            }
        }
    }

    public int recuperarBalones() {
        int id = rnd.nextInt(100) + 1;
        return id;
    }

    public int entregarBalones() {
        int id = rnd.nextInt(100) + 1;
        return id;
    }

    public int capacidadGoleadora() {
        int id = rnd.nextInt(100) + 1;
        return id;
    }

    public int nivelJuegoInvididual(int br, int bg, int gc) {
        int nji;
        nji = (int) (br * 0.2 + bg * 0.35 + gc * 0.45);

        return nji;
    }

    public int nivelJuegoColectivo(List<Jugador> lista_equipo) {
        int nj_colectivo = 0;
        for (Jugador equipo : lista_equipo) {
            nj_colectivo = nj_colectivo + equipo.getNj_invididual();
        }
        return nj_colectivo;
    }

    public void match(List<Equipo> Fase) {

        aux = new ArrayList<>();
        l_encuentro = new ArrayList<>();
        Equipo e_local = null, e_visita = null;
        int e1, e2, cont = 0;
        Encuentro encuentro;
        rellenar();
        ne2 = new int[16];
        if ((temp.size() / 2) == 8) {
            System.out.println("Octavos de final");
        } else if ((Fase.size() / 2) == 4) {
            System.out.println("Cuartos de final");
        } else if ((Fase.size() / 2) == 2) {
            System.out.println("Semfinal");
        } else {
            System.out.println("Final");
        }

        for (int i = 0; i < Fase.size() / 2; i++) {
            encuentro = new Encuentro();
            if ((temp.size() / 2) == 8) {
                e1 = n_equipos[cont];
                e2 = n_equipos[cont + 1];
            } else {
                e1 = ne2[cont];
                e2 = ne2[cont + 1];
            }
            e1 = n_equipos[cont];
            e2 = n_equipos[cont + 1];
            cont += 2;
            for (Equipo l_equipo : ListaEquipo) {
                if (l_equipo.getNombreId() == e1) {
                    e_local = l_equipo;

                } else if (l_equipo.getNombreId() == e2) {
                    e_visita = l_equipo;

                }
            }
            System.out.print("Equipo " + e_local.getNombreId() + " (Nivel de juego " + e_local.getNj_colectivo() + ") v/s ");
            encuentro.setE_local(e_local.getNombreId());
            System.out.print("Equipo " + e_visita.getNombreId() + " (Nivel de juego " + e_visita.getNj_colectivo() + ") ");
            encuentro.setE_visita(e_visita.getNombreId());

            if (e_local.getNj_colectivo() > e_visita.getNj_colectivo()) {

                System.out.println("Ganador: " + e_local.getNombreId());
                encuentro.setE_ganador(e_local.getNombreId());
                aux.add(e_local);
                ne2[i] = e_local.getNombreId();
            } else if (e_local.getNj_colectivo() < e_visita.getNj_colectivo()) {

                System.out.println("Ganador: " + e_visita.getNombreId());
                encuentro.setE_ganador(e_visita.getNombreId());
                aux.add(e_visita);
                ne2[i] = e_visita.getNombreId();
            } else {
                int id = rnd.nextInt(2) + 1;
                if (id == 0) {
                    System.out.println("Ganador: " + e_local.getNombreId());
                    encuentro.setE_ganador(e_local.getNombreId());
                    aux.add(e_local);
                    ne2[i] = e_local.getNombreId();
                } else {
                    System.out.println("Ganador: " + e_visita.getNombreId());
                    encuentro.setE_ganador(e_visita.getNombreId());
                    aux.add(e_visita);
                    ne2[i] = e_visita.getNombreId();
                }

            }
            ne = ne2;
            temp = aux;

        }
        if ((temp.size() / 2) == 8) {
            liga.setCuartos(l_encuentro);
            //  temp.clear();

        } else if ((Fase.size() / 2) == 4) {
            liga.setSemifinal(l_encuentro);
            // temp.clear();
        } else if ((Fase.size() / 2) == 2) {
            liga.setFinal_liga(l_encuentro);
        }

    }

    public void rellenar() {
        for (int i = 0; i < n_equipos.length; i++) {
            n_equipos[i] = 0;
        }
        for (int i = 0; i < n_equipos.length; i++) {
            n_equipos[i] = generarSinRepi();
        }
    }

    private int generarSinRepi() {
        int id;
        do {
            id = generarID();
        } while (id < 0);
        return id;
    }

    private int generarID() {
        int id = rnd.nextInt(16) + 1;
        for (int i = 0; i < n_equipos.length; i++) {
            if (n_equipos[i] == id) {
                id = -1;
                break;
            }
        }
        return id;
    }

    public void mostrar() {
        for (Equipo equip : ListaEquipo) {
            System.out.println("Equipo " + equip.getNombreId() + "\nNivel Juego Colectivo: " + equip.getNj_colectivo());
            for (Jugador jugador : equip.getEquipo()) {
                System.out.println("    Jugador ID:" + jugador.getId());
                System.out.println("    Posicion" + jugador.getTipo() + "\n");
                System.out.println("    Nivel Juego Invididual" + jugador.getNj_invididual() + "\n");
            }
        }
    }
}
