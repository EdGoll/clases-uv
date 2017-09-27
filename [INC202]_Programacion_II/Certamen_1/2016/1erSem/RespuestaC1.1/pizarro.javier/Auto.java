/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package certamen1.pkg1;

import java.util.List;


public class Auto {
  private String corredor;
  private String auto;
  private String tiempo;
  private String categoria;
  private List<Auto> listaAutos;
  
  public String getCorredor(){
    return corredor;
  }
  public void setCorredor(String corredor){
  this.corredor=corredor;
  }
  public String getAuto(String auto){
  return auto;
  }
  public void setAuto(String auto){
  this.auto=auto;
  }
   public String getTiempo(){
    return tiempo;
  }
  public void setTiempo(String tiempo){
  this.tiempo=tiempo;
  }
    public String getCategoria(){
    return categoria;
  }
  public void setCategoria(String categoria){
  this.categoria=categoria;
  }
  
  
 
        
}