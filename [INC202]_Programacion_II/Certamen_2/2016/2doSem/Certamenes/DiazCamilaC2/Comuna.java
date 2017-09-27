

public class Comuna {
    private String IdComuna;
    private String NombreComuna;
    private String IdProvincia;
    
    public void setIdComuna(String IdComuna){
        this.IdComuna=IdComuna;
    }
    public String getIdComuna(){
        return IdComuna;
    }
    public void setNombreComuna(String Nombre){
        this.NombreComuna=Nombre;
    }
    public String getNombreComuna(){
    return NombreComuna;
    }
    public void setIdProvincia(String Codigo){
        this.IdProvincia=Codigo;
    }
    public String getIdProvincia(){
        return IdProvincia;
    }
    @Override
    public String toString(){
        return String.format("%s %s %s \n",IdComuna,NombreComuna,IdProvincia);
    }
}
