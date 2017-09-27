/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


public class Direccion {
    private String Calle,Numero,Comuna,deTrabajo,deCivil;
    

    public String getCalle() {
        return Calle;
    }

    public void setCalle(String Calle) {
        this.Calle = Calle;
    }

    public String getDeTrabajo() {
        return deTrabajo;
    }

    public void setDeTrabajo(String deTrabajo) {
        this.deTrabajo = deTrabajo;
    }

    public String getDeCivil() {
        return deCivil;
    }

    public void setDeCivil(String deCivil) {
        this.deCivil = deCivil;
    }

    public String getNumero() {
        return Numero;
    }

    public void setNumero(String Numero) {
        this.Numero = Numero;
    }

    public String getComuna() {
        return Comuna;
    }

    public void setComuna(String Comuna) {
        this.Comuna = Comuna;
    }

    public Direccion(String Calle, String Numero, String Comuna) {
        this.Calle = Calle;
        this.Numero = Numero;
        this.Comuna = Comuna;
    }
    
    
    
}
