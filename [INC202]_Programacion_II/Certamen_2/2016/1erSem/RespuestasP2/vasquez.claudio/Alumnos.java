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
public class Alumnos {
    private String id;
    private String ap;
    private String am;
    private String nombre;
    
    public void setid(String id){
        this.id = id;
    }
    public void setap(String ap){
        this.ap = ap;
    }
    public void setam(String am){
        this.am = am;
    }
    public void setnombre(String nombre){
        this.nombre = nombre;
    }
    
    public String getid(){
        return id;
    }
    public String getap(){
        return ap;
    }
    public String getam(){
        return am;
    }
    public String getnombre(){
        return nombre;
    }
}
