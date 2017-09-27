/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package certamen2;

/**
 *
 * @author lab
 */
public class ClaseAlumno {
       private int identificador;
       private String nombres,apellidoPaterno,apellidoMaterno;

    public void setIdentificador(int identificador) {
        this.identificador = identificador;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public void setApellidoPaterno(String apellidoPaterno) {
        this.apellidoPaterno = apellidoPaterno;
    }

    public void setApellidoMaterno(String apellidoMaterno) {
        this.apellidoMaterno = apellidoMaterno;
    }

    public int getIdentificador() {
        return identificador;
    }

    public String getNombres() {
        return nombres;
    }

    public String getApellidoPaterno() {
        return apellidoPaterno;
    }

    public String getApellidoMaterno() {
        return apellidoMaterno;
    }
        




 @Override
    public String toString(){
        return "Identificador: "+ identificador+ "Apellido paterno"+ apellidoPaterno+ "Apellido materno: "+ apellidoMaterno+ "Nombres: "+ nombres;
}
    
    
}