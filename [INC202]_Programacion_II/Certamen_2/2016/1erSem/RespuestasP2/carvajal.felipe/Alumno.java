
package certamen2;

import java.util.ArrayList;

public class Alumno {
   private String app;
   private String apm;
   private String nombres;
   private int[]Array notas1;
   private int[] Array notas2;
   private float prom;

    public String getapp() {
        return app;
    }

    public String getApm() {
        return apm;
    }

    public String getNombres() {
        return nombres;
    }

    public ArrayList<int[]> getNotas1() {
        return notas1;
    }

    public ArrayList<int[]> getNotas2() {
        return notas2;
    }

    public void setapp(String app) {
        this.app = app;
    }

    public void setApm(String apm) {
        this.apm = apm;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public void setNotas1(ArrayList<int[]> notas1) {
        this.notas1 = notas1;
    }

    public void setNotas2(ArrayList<int[]> notas2) {
        this.notas2 = notas2;
    }

 
    }
   
   
