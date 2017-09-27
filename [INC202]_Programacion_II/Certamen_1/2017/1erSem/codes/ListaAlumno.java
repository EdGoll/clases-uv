/* Clase Lista - ListaAlumno */

import java.util.ArrayList;
import java.util.Random;

public class ListaAlumno {

    private ArrayList<Alumno> listaAlumnos = new ArrayList<>();
    private ArrayList<Alumno> listaAlumnosGrupoA = new ArrayList<>();
    private ArrayList<Alumno> listaAlumnosGrupoB = new ArrayList<>();
    private Random rnd;
    private int tamanio;
    private final int MIN_LISTA = 40;
    private final int MAX_LISTA = 100;
    private final int MAX_ID = 100;

    public ListaAlumno() {
        rnd = new Random();
        tamanio = rnd.nextInt(MAX_LISTA - MIN_LISTA) + MIN_LISTA + 1;
    }

    public void llenarLista() {
        Alumno a;
        for (int i = 0; i < tamanio; i++) {
            listaAlumnos.add(doAlumnoSinRepeticion());
        }
    }

    public void dividirListas() {
        Alumno a;
        for (int i = 0; i < tamanio; i++) {
            a = listaAlumnos.remove(rnd.nextInt(listaAlumnos.size()));
            if (rnd.nextBoolean()) {
                listaAlumnosGrupoA.add(a);
            } else {
                listaAlumnosGrupoB.add(a);
            }
        }
    }

    private Alumno doAlumnoSinRepeticion() {
        Alumno a = new Alumno();
        int id;
        do {
            id = rnd.nextInt(MAX_ID) + 1;
            a.setId(id);
            for(int i = 0; i < listaAlumnos.size(); i++) {
                if (listaAlumnos.get(i).equals(a)) {
                    id = -1;
                    break;
                }
            }
        } while (id < 0);
        return a;
    }

    public void mostrarLista() {
        System.out.println("Curso:");
        for(int i = 0; i < listaAlumnos.size(); i++) {
            System.out.println((i + 1) + " " + listaAlumnos.get(i));
        }
    }

    public void mostrarGrupos() {
        System.out.println("Grupo A:");
        for(int i = 0; i < listaAlumnosGrupoA.size(); i++) {
            System.out.println((i + 1) + " " + listaAlumnosGrupoA.get(i));
        }
        System.out.println("Grupo B:");
        for(int i = 0; i < listaAlumnosGrupoB.size(); i++) {
            System.out.println((i + 1) + " " + listaAlumnosGrupoB.get(i));
        }
    }
}