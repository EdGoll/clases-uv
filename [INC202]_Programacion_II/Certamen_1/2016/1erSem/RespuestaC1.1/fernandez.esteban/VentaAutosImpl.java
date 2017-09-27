package ventaautos;

import java.util.List;
import java.util.ArrayList;
import java.util.StringTokenizer;
import java.util.Scanner;


public class VentaAutosImpl {
    
    StringTokenizer st;
    private FuenteDeDatos fdd;
    List<String> lineas = null;
    List<Caracteristicas> listaAutos = new ArrayList<>();
    
    public VentaAutosImpl(){
    
        fdd = new FuenteDeDatos();
        lineas = fdd.leerArchivo("AutosMasVendidos2015_dataset.txt");
        loadCar();
    }
    
    private void loadCar(){
    
        for(String l: lineas){
            Caracteristicas auto;
            st = new StringTokenizer(l,"#");

            while(st.hasMoreElements()){
                
                auto = new Caracteristicas();
                
                auto.setPos2015(Integer.parseInt(st.nextToken()));
                auto.setPos2014(Integer.parseInt(st.nextToken()));
                auto.setMarca(st.nextToken());
                auto.setModelo(st.nextToken());
                auto.setVenta2015(Integer.parseInt(st.nextToken()));
                auto.setVenta2014(Integer.parseInt(st.nextToken()));
                auto.setVariacion(Float.parseFloat(st.nextToken()));

                listaAutos.add(auto);
            }
        }    
    }
    
    void dMayorMenor(){
    
        String marcame="", modelome="", marcama="", modeloma="";
        int mayor=0, menor=0, diferencia=0;
        
        for(Caracteristicas aux: listaAutos){
            
            if(aux.getPos2015()==1){
                mayor = aux.getVenta2015();
            }
            if(aux.getPos2015()==50){
                menor = aux.getVenta2015();
            }
        }    
        
        diferencia = mayor-menor;
        
        System.out.println("La diferencia entre el vehículo más y menos vendido del 2015 es: " + diferencia);
    }
    
    void ventasToyota(){
        int vToyota=0;
        for(Caracteristicas aux: listaAutos){
            if("Toyota".equals(aux.getMarca())){
                vToyota += aux.getVenta2015();
            }
        }
        System.out.println("Las ventas de la marca toyota dentro de sus modelos mas vendidos de 2015 fueron: " + vToyota);
    }
    
    void CaidaCrecida(){
        String modelo1="", modelo2="", marca1="", marca2="";
        float crecida=0, caida=0;
        for(Caracteristicas aux: listaAutos){
            if(aux.getVariacion()<caida){
                caida = aux.getVariacion();
                marca1 = aux.getMarca();
                modelo1 = aux.getModelo();
            }
            if(aux.getVariacion()>crecida){
                crecida = aux.getVariacion();
                marca2 = aux.getMarca();
                modelo2 = aux.getModelo();
            }
        }
        System.out.println("El vehículo que tuvo la mayor caída de ventas fue: " + marca1 +" "+ modelo1 + " Con un: %" + caida);
        System.out.println("El vehículo que tuvo la mayor crecida de ventas fue: " + marca2 +" "+ modelo2 + " Con un: %" + crecida);
    }
    
    void BuscarRanking(){
        int search=0;
        System.out.print("Ingrese un número entre 1 y 50 para conocer los detalles de esa posición del ranking:");
        Scanner sc = new Scanner(System.in);
        search = sc.nextInt();
        try{
            if(search<=50 && search>=1){
                for(Caracteristicas aux: listaAutos){
                    if(search==aux.getPos2015()){
                        System.out.println("El vehículo en la posición: "+search+ " del ranking es un: "+aux.getMarca()+" "+aux.getModelo()+ 
                                " alcanzó: " +aux.getVenta2015()+" ventas en el 2015 y: "+aux.getVenta2014()+
                                " ventas en el 2014, con una variación de: %"+aux.getVariacion());
                    }
                }
            }  
            else{System.out.println("El número ingresado está fuera de rango");}
        }
        catch(Exception e){
            System.out.println("Se ha producido un error al ingresar los datos");
            System.out.println(e);
        }
        finally{
        }
    }
    
    void BuscarMarca(){
        String search=" ";
        int control=0;
        System.out.print("Ingrese una marca para consultar: ");
        Scanner sc = new Scanner(System.in);
        search = sc.nextLine();
        for(Caracteristicas aux: listaAutos){
            int ventas=0;
            if(aux.getMarca().equals(search)){
                control=1;
                ventas = aux.getVenta2015() + aux.getVenta2014();
                System.out.println(search+" Modelo: "+aux.getModelo()+" total de ventas entre 2014 y 2015: "+ventas+
                        " variación entre estos dos años: %"+aux.getVariacion());
            }
        }
        if(control!=1){
            System.out.println("No se ha encontrado la marca ingresada.");
        }
    }
}