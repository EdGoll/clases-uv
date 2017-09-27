/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package investigacionsocial;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;


public class InvestigacionSocial {
    
    FuenteDeDato fd = new FuenteDeDato();
    List <String> lineas=null;
    List <Datos> informacion = new ArrayList<Datos>();
    List <Datos> info = new ArrayList<Datos>();
    List <Datos> aux; 
    StringTokenizer st;
    Datos D,DA;
    
    public void rellenar(){
        lineas = fd.leerArchivo("datasetSocial.csv");
        for (String l: lineas){
            st = new StringTokenizer(l,",");
            D = new Datos();
            
            if (st.hasMoreElements()){
                D.setNombrePais(st.nextToken());
                D.setNutricionCuidadosMedicos(Float.parseFloat(st.nextToken()));
                D.setSanidadDelAgua(Float.parseFloat(st.nextToken()));
                D.setAlbergues(Float.parseFloat(st.nextToken()));
                D.setSeguridadPersonal(Float.parseFloat(st.nextToken()));
                D.setAccesoConocimientosBasicos(Float.parseFloat(st.nextToken()));
                D.setAccesoComunicacionInformacion(Float.parseFloat(st.nextToken()));
                D.setSaludYBienestar(Float.parseFloat(st.nextToken()));
                D.setSostenibilidadEcosistema(Float.parseFloat(st.nextToken()));
                D.setDerechosPersonales(Float.parseFloat(st.nextToken()));
                D.setLibertarYPropiaElecion(Float.parseFloat(st.nextToken()));
                D.setToleranciaInclusion(Float.parseFloat(st.nextToken()));
                D.setAccesoEducacionSuperior(Float.parseFloat(st.nextToken()));
                informacion.add(D);
                info.add(D);
            }
        }
    }
    public void mayorMenor(){
        D = new Datos();
        DA = new Datos();
        for (Datos Da: informacion){
            for (Datos da: informacion){
                if (Da.getAccesoConocimientosBasicos() > da.getAccesoConocimientosBasicos()){
                    D.setNombrePais(da.getNombrePais());
                    D.setAccesoConocimientosBasicos(da.getAccesoConocimientosBasicos());
                    
                    if (Da.getAccesoConocimientosBasicos() < da.getAccesoConocimientosBasicos()){
                        DA.setNombrePais(Da.getNombrePais());
                        DA.setAccesoConocimientosBasicos(da.getAccesoConocimientosBasicos());
                    }
                }
            }
        }
        System.out.println("El Pais con Mayor Acceso a Conocimientos es basicos es"+DA.getNombrePais()+" Con un: "+DA.getAccesoConocimientosBasicos()+"%");
        System.out.println("El Pais con Menor Acceso a Conocimientos es basicos es"+D.getNombrePais()+" Con un: "+D.getAccesoConocimientosBasicos()+"%");
    }
    public void derechosPersonales(){
        aux = new ArrayList<Datos>();
        D = new Datos();
        int cont=0;
            for (Datos Da: info){
                for (Datos da: info){
                    if (Da.getDerechosPersonales() < da.getDerechosPersonales()){
                        D.setNombrePais(da.getNombrePais());
                        D.setDerechosPersonales(da.getDerechosPersonales());
                    }
                }
             if (cont < 10){
             aux.add(D);
             info.remove(D);
             cont++;
             }
            }
         for (Datos datos: aux){
             System.out.println("Los 10 paises con mayor Derechos Personales son : "+datos.toString());
         
         }
    }
    public void promedioAgua(){
        float promedio=0;
        int cont=0;
        for (Datos d: informacion){
            promedio += d.getSanidadDelAgua();
            cont++;
        }
        promedio = promedio/cont;
        System.out.println("El promedio de Sanidad del Agua a nivel mundial es :"+promedio+"%");
    }
    public void eduSuperiorChile(){
        for (Datos d : informacion){
            if (d.getNombrePais() == "Chile"){
                System.out.println("El acceso a educacion superior de Chile es: "+d.getAccesoEducacionSuperior());
            }
        }
    }
    public void tolerancia(){
        float menor=0;
        String menor1=null;
        Float menor2=0.0f;
        aux = new ArrayList<Datos>();
        for (Datos d: informacion){
            D = new Datos();
             if (d.getNombrePais()== "Chile"){
                D.setNombrePais(d.getNombrePais());
                D.setToleranciaInclusion(d.getToleranciaInclusion());
                aux.add(D);
            }
            if (d.getNombrePais()== "Argentina"){
                D.setNombrePais(d.getNombrePais());
                D.setToleranciaInclusion(d.getToleranciaInclusion());
                aux.add(D);
            }
            if (d.getNombrePais()== "Peru"){
                D.setNombrePais(d.getNombrePais());
                D.setToleranciaInclusion(d.getToleranciaInclusion());
                aux.add(D);
            }
            if (d.getNombrePais()== "Bolivia"){
                D.setNombrePais(d.getNombrePais());
                D.setToleranciaInclusion(d.getToleranciaInclusion());
                aux.add(D);
            }
        }
        for (Datos d: aux){
            
            for (Datos da: aux){
                DA = new Datos();
                if (d.getToleranciaInclusion() >  da.getToleranciaInclusion()){
                    menor1 = da.getNombrePais();
                    menor2 = da.getToleranciaInclusion();
                    
                }
            }
        }
      System.out.println("El pais con mejor tolerancia entre Chile Peru Bolivia y Argentina es :"+menor1+"con un "+menor2+"%");
    } 
}
