package ciudadesmasvisitadas;

public class Ranking {
    private String posicion;
    private String ciudad;
    private String pais;
    private String continente;
    private String visitas;
  
    public String getPosicion() {
        return posicion; 
    }

    public void setPosicion(String posicion){
        this.posicion = posicion;
    }
    
    public String getCiudad(){
        return ciudad;
    }
    
    public void setCiudad(String ciudad){
        this.ciudad = ciudad;
    }
    
    public String getPais(){
        return pais;        
    }
    
    public void setPais(String pais){
        this.pais = pais;        
    }
    
    public String getContinente(){
        return continente;
    }
    
    public void setContinente(String continente){
        this.continente = continente;
    }
    
    public String getVisitas(){
        return visitas;
    }
    
    public void setVisitas(String visitas){
        this.visitas = visitas;
    }
    
    
}
