

import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;


public class AgregarAc {
    Academico aca = null;
    private List<String> lineas;
    private List<Academico> ac = new ArrayList<>();
    private StringTokenizer st;
    private int h=0,alguien;
    public void llenar(){
        aca = new Academico();
        System.out.println("ingrese DNI: ");
        aca.setdni();
        System.out.println("ingrese nombre: ");
        aca.setNombre();
        System.out.println("ingrese apellido: ");
        aca.setApellido();
        System.out.println("ingrese edad: ");
        aca.setEdad();
        System.out.println("ingrese Direccion: ");
        aca.setCalle();
        aca.sethoras();
        ac.add(aca);
    }
}
