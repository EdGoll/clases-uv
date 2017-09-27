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
public class Certamen2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        AlumnosImp al = new AlumnosImp();
        al.llenarAlumno();
        al.llenarA1();
        al.llenarA2();
        al.mostrar();
    }
    
}
