

import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class AgregarFc {
    Funcionario fc = null;
    private List<String> lineas;
    private List<Funcionario> F = new ArrayList<>();
    private StringTokenizer st;
    private int h=0,alguien;
    public void llenar(){
        fc = new Funcionario();
        System.out.println("ingrese DNI: ");
        fc.setdni();
        System.out.println("ingrese nombre: ");
        fc.setNombre();
        System.out.println("ingrese apellido: ");
        fc.setApellido();
        System.out.println("ingrese edad: ");
        fc.setEdad();
        System.out.println("ingrese Direccion: ");
        fc.setCalle();
        fc.sethoras();
        F.add(fc);
    }
}
