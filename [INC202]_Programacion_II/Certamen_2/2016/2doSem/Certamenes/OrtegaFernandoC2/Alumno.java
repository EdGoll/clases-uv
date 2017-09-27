

import java.util.Scanner;


public class Alumno{
        Scanner sc = new Scanner(System.in);

    private String dni,nombre,apellido,edad,comuna,calle,numero,asignatura[],algo;
    public int h=0,i;
    public Alumno()
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
    public void setNumero()
    {
        this.numero = sc.nextLine();
    }
    public void setAsiganturas()
    {
        while(h==0){
            System.out.println("Ingrese la asignatura");
            this.asignatura[i] = sc.nextLine();
            i++;
            System.out.println("dese ingresar ora asiganatura? 1)Si 2)No ");
            algo=sc.nextLine();
            if(algo.equals(2)){
                h=1;
            }
        }
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
