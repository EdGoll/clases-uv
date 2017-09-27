/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class Registro {
    ArrayList<Farmacia> grupo = new ArrayList<>();
    FuenteDeDatos ft = new FuenteDeDatos();
    
    private void Fill(){
        List lista = ft.leerArchivo("C:\\Users\\Pepi\\Desktop\\Productos_farmaceuticos_vigentes_venta_directa.csv");
        StringTokenizer st;
        Farmacia fm;
        for(Object ob : lista){
            st= new StringTokenizer((String)ob,";");
            fm= new Farmacia();
            fm.setRegistro(st.nextToken());
            fm.setNom_producto(st.nextToken());
            fm.setRazon_titular(st.nextToken());
            fm.setCondicion_venta(st.nextToken());
            grupo.add(fm);
        }
    }
    
    public Registro(){
        Fill();
    }
    
    public void Preguntas(){
        
        String str2= "PARACETAMOL COMPRIMIDOS";
        String str3= "COMPRIMIDOS";   
        int i=0,h=0,j=0;
        ArrayList<String> resul = new ArrayList<>();
        ArrayList<String> nom = new ArrayList<>();
        
        for(Farmacia fm : grupo){
            
            if(fm.getRazon_titular().equals("OPKO CHILE S.A.")){
                h++;
            }
            
             if(fm.getNom_producto().regionMatches(0, str2, 0, 23)==true){
                i++;    
            }
            
            if (fm.getRazon_titular().equals("MASTER CARE S.A.")){
                resul.add(fm.getRegistro());
            }
              
            if (fm.getRazon_titular().equals("MASTER CARE S.A.")){
                if(fm.getRegistro().startsWith("F", 0)==true){
                        nom.add(fm.getNom_producto()); 
                    
                }
                           
            }              
        }
            
        System.out.println( grupo.size() + " es la cantidad de productos vigentes para compra directa");
        System.out.println( i + " productos son paracetamol comprimidos");
        System.out.print("Los números de registro de los productos de Master Care S.A. son: \n" );
        for (int c=0;c<resul.size();c++){
            System.out.println(resul.get(c));
        }
        System.out.println( h + " productos son del laboratorio OPKO CHILE S.A.");
        System.out.print("Los productos con prefijo F en su registro, que son comprimidos y del laboratorio MASTER CARE S.A. son: \n" );
        for(int v=0;v<nom.size();v++){
            System.out.println(nom.get(v));
        }   
    }
}
