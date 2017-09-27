/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
public class EntradaProfesor extends Academico {
    private List<String> lineas;
    private List<Academico> d = new ArrayList<>();
    Scanner sc = new Scanner(System.in);
    private String hora;

    public EntradaProfesor(String Nombre, String DNI, String Apellido, String Edad, String dia, String hora) {
        super(Nombre, DNI, Apellido, Edad, dia, hora);
    }


    
    
    public void Escribir(String dia, String Hora, String DNI, String Nombre, String Apellidos, String Edad){            
            Academico a = new Academico(Nombre, DNI, Apellido, Edad, dia, hora);
            a.Nombre = sc.nextLine();
            a.Apellido = sc.nextLine();
            a.Edad = sc.nextLine();
            a.DNI = sc.nextLine();
            a.dia=sc.nextLine();
            a.hora=sc.nextLine();
            d.add(a);
            lineas.add(d.toString());
            FuenteDatos.escribirArchivo("Registro.txt", lineas);
    }
 

}
