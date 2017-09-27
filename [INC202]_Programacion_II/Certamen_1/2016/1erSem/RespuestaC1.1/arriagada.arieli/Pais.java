
public class Pais {

    private String nombre;
    private String codigo;
    private String capital;
    private String provincia;
    private int area;
    private int poblacion;

    public String getNombre() 
    {
     return nombre; 
    }
    
    public void setNombre(String nombre)
    {
     this.nombre = nombre; 
    }
    
    public String getCodigo() 
    { 
        return codigo; 
    }
    
    public void setCodigo(String codigo) 
    {  
        this.codigo = codigo; 
    }

    public String getCapital() 
    { 
        return capital; 
    }
    
    public void setCapital(String capital) 
    { 
        this.capital = capital; 
    }
    
    public String getProvincia() 
    { 
        return provincia; 
    }

    public void setProvincia(String provincia) 
    { 
        this.provincia = provincia; 
    }

    public int getArea() 
    { 
        return area; 
    }

    public void setArea(int area) 
    {  
        this.area = area; 
    }

    public int getPoblacion() 
    { 
        return poblacion;  
    }

    public void setPoblacion(int poblacion) 
    { 
        this.poblacion = poblacion;  
    }
    
}
