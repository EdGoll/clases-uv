package duoc;

import intefaces.*;

public abstract class Alumno implements InfoAlumno{
    private String nombre;
    protected double nota1;
    protected double nota2;
    
    public void setNombre(String nuevoNombre){
        nombre = nuevoNombre.toUpperCase();
    }
    
    public String getNombre(){
        return nombre;
    }
    public void setNota1(double nota){
        nota1 = nota;
    }
    public final void setNota2(double nota){
        nota2 = nota;
    }
    public double getNota1(){ return nota1; }
    public double getNota2(){ return nota2; }
    
    
    //Metodo absctracto, debe ser implementado por la primera clase concreta
    public abstract double calcularPromedio();
    
}
