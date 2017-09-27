/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

public class Academico extends Persona {
    String dia,hora;

    public Academico(String Nombre,String DNI,String Apellido,String Edad, String dia,String hora) {
        super(Nombre, DNI, Apellido, Edad);
        this.dia = dia;
        this.hora = hora;
    }
    
    

    public String getDia() {
        return dia;
    }

    public void setDia(String dia) {
        this.dia = dia;
    }

    public String getHora() {
        return hora;
    }

    public void setHora(String hora) {
        this.hora = hora;
    }
    @Override
    public String toString(){
        return Nombre+" "+Apellido+" "+DNI+" "+Edad+" horario: "+dia+" a las:"+hora;
    }
  
}
