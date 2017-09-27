/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication13universidad;

import java.util.Scanner;

/**
 *
 * @author Fiov
 */
public class Academico{
        Scanner sc = new Scanner(System.in);

    private String dni,nombre,apellido,edad,comuna,calle,numero,entrada[],salida[];
    public int h=0,i=0,hora;
    
    public Academico()
    {
        
    }
    
    public void setdni()
    {
        this.dni = sc.nextLine();
    }
    public void setNombre()
    {
        this.nombre = sc.nextLine();
    }
    public void setApellido()
    {
        this.apellido = sc.nextLine();
    }
    public void setEdad()
    {
        this.edad= sc.nextLine();
    }
    public void setComuna(String comuna)
    {
        this.comuna = comuna;
    }
    public void setCalle()
    {
        this.calle = sc.nextLine();
    }
    public void sethoras()
    {
        while (h==0){
            System.out.println("ingrse empiezo de hora de atencion");
            this.entrada[i] = sc.nextLine();
            System.out.println("ingrse termino de hora de atencion");
            this.salida[i] = sc.nextLine();
            System.out.println("desea ingresar otra 1)si 2)no");
            this.hora = sc.nextInt();
            if(hora==2){
                h=1;
            }
        }
    }
    public void setNumero()
    {
        this.numero = sc.nextLine();
    }
    public String getCalle()
    {
        return calle;
    }
    public String getNumero()
    {
        return numero;
    }
    public String getdni()
    {
        return dni;
    }
    public String getNombre()
    {
        return nombre;
    }
    public String getApellido()
    {
        return apellido;
    }
    public String getComuna()
    {
        return comuna;
    }
    public String getEdad()
    {
        return edad;
    }
}
