/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
public class EntradaAlumno extends Alumno {
    private List<String> lineas;
    private List<Alumno> d = new ArrayList<>();
    Scanner sc = new Scanner(System.in);

    public EntradaAlumno(String asignatura, String Nombre, String DNI, String Apellido, String Edad) {
        super(asignatura, Nombre, DNI, Apellido, Edad);
    }

    

    
   
    
    public void Escribir(String asignatura, String DNI, String Nombre, String Apellidos, String Edad){            
            Alumno a = new Alumno(Nombre, DNI, Apellido, Edad, asignatura);
            a.Nombre = sc.nextLine();
            a.Apellido = sc.nextLine();
            a.Edad = sc.nextLine();
            a.DNI = sc.nextLine();
            a.asignatura=sc.nextLine();
            d.add(a);
            lineas.add(d.toString());
            FuenteDatos.escribirArchivo("Registro.txt", lineas);
    }
}   
 