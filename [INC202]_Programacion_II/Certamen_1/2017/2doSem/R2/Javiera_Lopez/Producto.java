/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


/**
 *
 * @author Acer
 */
public class Producto { // clase Producto
    
    private Integer codigo; //Atributos de la clase
    private String nombre;
    private Integer stock;
    private float precio;
    int getStock;
    
    //Constructor recibe parametros 
    public Producto(Integer codigo,String nombre,float precio,Integer stock){
        this.codigo=codigo; 
        this.nombre=nombre;
        this.stock=stock;
        this.precio=precio;
    }
    
    //get and setter de los atributos 
    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    public float getPrecio() {
        return precio;
    }

    public void setPrecio(float precio) {
        this.precio = precio;
    }
    
    
}
