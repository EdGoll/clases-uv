

import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;


public class agregaralumno {
    Alumno a = null;
    private List<String> lineas;
    private List<Alumno> al = new ArrayList<>();
    //private List<PokemonElem> pokeElem = new ArrayList<>();
    private StringTokenizer st;
    private int h=0,alguien;
    public void llenar(){
        a = new Alumno();
                        System.out.println("ingrese DNI: ");
                        a.setdni();
                        System.out.println("ingrese nombre: ");
                        a.setNombre();
                        System.out.println("ingrese apellido: ");
                        a.setApellido();
                        System.out.println("ingrese edad: ");
                        a.setEdad();
                        System.out.println("ingrese Direccion: ");
                        a.setCalle();
                        System.out.println("desea ingresar otro?");
                        a.setAsiganturas();
                        al.add(a);
    }
}
