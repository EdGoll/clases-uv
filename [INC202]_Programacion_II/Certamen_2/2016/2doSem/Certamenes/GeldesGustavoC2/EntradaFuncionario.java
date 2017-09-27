/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */



import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class EntradaFuncionario extends Funcionario {
    private List<String> lineas;
    private List<Funcionario> d = new ArrayList<>();
    Scanner sc = new Scanner(System.in);

    public EntradaFuncionario(String HorarioLaboral, String Nombre, String DNI, String Apellido, String Edad) {
        super(HorarioLaboral, Nombre, DNI, Apellido, Edad);
    }
   
    
    public void Escribir(String asignatura, String DNI, String Nombre, String Apellidos, String Edad){            
            Funcionario a = new Funcionario(Nombre, DNI, Apellido, Edad, HorarioLaboral);
            a.Nombre = sc.nextLine();
            a.Apellido = sc.nextLine();
            a.Edad = sc.nextLine();
            a.DNI = sc.nextLine();
            a.HorarioLaboral=sc.nextLine();
            d.add(a);
            lineas.add(d.toString());
            FuenteDatos.escribirArchivo("Registro.txt", lineas);
    }
}   
 