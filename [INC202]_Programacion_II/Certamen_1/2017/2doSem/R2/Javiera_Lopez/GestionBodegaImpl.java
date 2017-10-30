/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author Acer
 */
public class GestionBodegaImpl {
   
    public static void main(String[] args)throws IOException{
       
        System.out.println(" A L M A C E N    J A V I B I "+'\n');
        
            GestionBodega todoslosProductos = new GestionBodega();
            
            todoslosProductos.crearProducto();        
            todoslosProductos.listarStock();     
            todoslosProductos.venderProductos();
       
    }
}
