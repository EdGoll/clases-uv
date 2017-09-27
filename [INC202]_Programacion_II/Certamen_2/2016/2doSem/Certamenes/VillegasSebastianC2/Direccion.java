public class Direccion 
{
    private String calle,numero,comuna;
    public Direccion(String calle,String numero,String comuna)
    {
        this.calle = calle;
        this.numero = numero;
        this.comuna = comuna;
    }
    public Direccion(){}
    
    public void setCalle(String calle)
    {
        this.calle = calle;
    }
    public void setNumero(String numero)
    {
        this.numero = numero;
    }
    public void setComuna(String comuna)
    {
        this.comuna = comuna;
    }
    
    public String getCalle()
    {
        return calle;
    }
    public String getNumero()
    {
        return numero;
    }
    public String getComuna()
    {
        return comuna;
    }
    @Override
    public String toString()
    {
        return "\nDirección de hogar: " + comuna +", "+calle+" "+numero;
    }
    
    public String labor()//Se usa en la segunda instancia
    {
        return "\nDirección de trabajo: " + comuna +" "+calle+" "+numero;
    }
}
