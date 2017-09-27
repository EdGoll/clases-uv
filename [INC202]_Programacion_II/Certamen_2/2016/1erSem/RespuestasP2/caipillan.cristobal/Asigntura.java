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
public class Asignatura {
    int identificador,notaQ1,notaQ2,notaQ3,notaTarea1,notaTarea2,notaCertamen1,notaCertamen2,notaCertamen3;

    public void setIdentificador(int identificador) {
        this.identificador = identificador;
    }

    public void setNotaQ1(int notaQ1) {
        this.notaQ1 = notaQ1;
    }

    public void setNotaQ2(int notaQ2) {
        this.notaQ2 = notaQ2;
    }

    public void setNotaQ3(int notaQ3) {
        this.notaQ3 = notaQ3;
    }

    public void setNotaTarea1(int notaTarea1) {
        this.notaTarea1 = notaTarea1;
    }

    public void setNotaTarea2(int notaTarea2) {
        this.notaTarea2 = notaTarea2;
    }

    public void setNotaCertamen1(int notaCertamen1) {
        this.notaCertamen1 = notaCertamen1;
    }

    public void setNotaCertamen2(int notaCertamen2) {
        this.notaCertamen2 = notaCertamen2;
    }

    public void setNotaCertamen3(int notaCertamen3) {
        this.notaCertamen3 = notaCertamen3;
    }

    public int getIdentificador() {
        return identificador;
    }

    public int getNotaQ1() {
        return notaQ1;
    }

    public int getNotaQ2() {
        return notaQ2;
    }

    public int getNotaQ3() {
        return notaQ3;
    }

    public int getNotaTarea1() {
        return notaTarea1;
    }

    public int getNotaTarea2() {
        return notaTarea2;
    }

    public int getNotaCertamen1() {
        return notaCertamen1;
    }

    public int getNotaCertamen2() {
        return notaCertamen2;
    }

    public int getNotaCertamen3() {
        return notaCertamen3;
    }
    @Override
    public String toString(){
        return "identificador del alumno: "+ identificador+" notaQ1: "+ notaQ1+ "Nota quiz 2: "+ notaQ2+"NOta quiz 3 : "+ notaQ3+"Nota tarea 1: "+ notaTarea1+"Nota tarea 2: "+ notaTarea2+"Nota tarea 3: "+ "Nota certamen 1 : "+ notaCertamen1+"Nota certamen2 "+  notaCertamen2+ "Noa certamen 3 :"+ notaCertamen3;
    }
    
}
