public class Comuna
{
    private String idComuna,nombreComuna,idProvincia;
    
    public Comuna(String idComuna, String nombreComuna, String idProvincia)
    {
        this.idComuna = idComuna;
        this.nombreComuna = nombreComuna;
        this.idProvincia = idProvincia;
    }
    
    public void setIdComuna(String idComuna)
    {
        this.idComuna = idComuna;
    }
    public void setNombreProvincia(String nombreProvincia)
    {
        this.nombreComuna = nombreComuna;
    }
    public void setIdProvincia(String idProvincia)
    {
        this.idProvincia = idProvincia;
    }
    
    public String getIdComuna()
    {
        return idComuna;
    }
    public String getNombreComuna()
    {
        return nombreComuna;
    }
    public String getIdProvincia()
    {
        return idProvincia;
    }
    
    @Override
    public String toString()
    {
        return ")Comuna de " +nombreComuna;
    }
    
}
