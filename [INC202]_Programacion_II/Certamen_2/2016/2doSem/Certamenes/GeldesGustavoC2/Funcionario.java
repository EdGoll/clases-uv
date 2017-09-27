/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Palurdo
 */
public class Funcionario extends Persona {
   String HorarioLaboral;
    public Funcionario(String HorarioLaboral, String Nombre, String DNI, String Apellido, String Edad) {
        super(Nombre, DNI, Apellido, Edad);
        this.HorarioLaboral = HorarioLaboral;
    }

    
   

    public String getHorarioLaboral() {
        return HorarioLaboral;
    }

    public void setHorarioLaboral(String HorarioLaboral) {
        this.HorarioLaboral = HorarioLaboral;
    }
@Override
    public String toString(){
       return Nombre+" "+Apellido+" "+DNI+" "+Edad+" HorarioLaboral"+HorarioLaboral;
               
    }
 
    
}
