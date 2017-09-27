

public class Provincia {
    private String IdProvincia;
    private String NombreProvincia;
    private String IdRegion;
    private String NumeroDeComunas; //cantidad de comunas que tiene la provincia
    
    public void setIdProvincia(String IdProvincia){
        this.IdProvincia=IdProvincia;
    }    
    public String getIdProvincia(){
        return IdProvincia;
    }
    public void setNombreProvincia(String Nombre){
        this.NombreProvincia=Nombre;
    }    
    public String getNombre(){
        return NombreProvincia;
    }
    public void setIdRegion(String Codigo){
        this.IdRegion=Codigo;
    }
    public String getIdRegion(){
        return IdRegion;
    }
    public void setNumeroDeComunas(String NumeroDeComunas){
        this.NumeroDeComunas=NumeroDeComunas;
    }
    public String getNumeroDeComunas(){
        return NumeroDeComunas;
    }
    @Override
    public String toString(){
        return String.format("%s %s %s %s \n",IdProvincia,NombreProvincia,IdRegion,NumeroDeComunas);
    }
}
