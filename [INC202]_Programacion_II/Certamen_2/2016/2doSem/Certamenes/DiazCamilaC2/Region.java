

public class Region {
    private String IdRegion;
    private String NombreRegion;
    private String NumeroRomano;
    private String OrdenGeograficoRegion;
    
    public void setIdRegion(String IdRegion){
        this.IdRegion=IdRegion;
    }
    public String getIdRegion(){
        return IdRegion;
    }
    public void setNombreRegion(String Nombre){
        this.NombreRegion=Nombre;
    }        
    public String getNombre(){
        return NombreRegion;
    }
    public void setNumeroRomano(String NumeroRomano){
        this.NumeroRomano=NumeroRomano;
    }
    public String getNumeroRomano(){
        return NumeroRomano;
    }
    public void setOrdenGeograficoRegion(String Orden){
        this.OrdenGeograficoRegion=Orden;
    }
    public String getOrdenGeograficoRegion(){
        return OrdenGeograficoRegion;
    }
    
    @Override
    public String toString(){
        return String.format("%s %s %s %s \n ",IdRegion,NombreRegion,NumeroRomano,OrdenGeograficoRegion);
    }
}
