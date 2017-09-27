/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.util.Random;

public class jugador {
    Random rd = new Random();
    private int numero;
    private int BR;
    private int BG;
    private int CG;
    private String tipo;
    private int nivel;
    public jugador(int i){
        this.numero = i;
        setBR();
        setBG();
        setCG(i);
        setTipo(i);
    }
    /*public void setjugador(int i){
       this.numero = i;
    }*/
    public int getJugador(){
        return numero;
    }
    private void setBR(){
        this.BR= rd.nextInt(99)+1;
    }
    public int getBR(){
        return BR;
    }
     private void setBG(){
        this.BG= rd.nextInt(99)+1;
    }
    public int getBG(){
        return BG;
    }
    private void setCG(int i){
        if (i==0){
            CG=0;
        }else{
            this.CG = rd.nextInt(99)+1;
        }
    }
    public int getCG(){
        return CG;
    }
    private void setTipo(int i){
        switch (i){
            case 0:  this.tipo = "arquero";
                    break;
            case 1:  this.tipo = "defensa";
                    break;
            case 2:  this.tipo = "defensa";
                    break;
            case 3:  this.tipo = "defensa";
                    break;
            case 4:  this.tipo = "lateral";
                    break;
            case 5: this.tipo = "lateral";
                    break;
            case 6: this.tipo = "centro";
                    break;
            case 7: this.tipo = "centro";
                    break;        
            case 8: this.tipo = "delantero";
                    break;        
            case 9: this.tipo = "delantero";
                    break;        
            case 10: this.tipo = "delantero";
                    break;                
        }
        
    }
    
    public String getTipo(){
        return tipo;
    }
    public int puntosJ(){
       return (int) (BR*0.2+BG*0.35+ CG*0.45);
    }
    
}
