/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


/**
 *
 * @author Palurdo
 */
public class Alumno extends Persona {
    String asignatura;


    public Alumno(String asignatura, String Nombre, String DNI, String Apellido, String Edad) {
        super(Nombre, DNI, Apellido, Edad);
        this.asignatura = asignatura;
    }
    

    public String getAsignatura() {
        return asignatura;
    }

    public void setAsignatura(String asignatura) {
        this.asignatura = asignatura;
    }

    @Override
    public String toString(){
       return Nombre+" "+Apellido+" "+DNI+" "+Edad+" asignatura:"+asignatura;
               
    }

    
}
