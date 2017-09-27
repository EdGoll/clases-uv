

public class Direccion {
    private String Calle;
    private String Numero;
    private String Comuna;
    
    public void setCalle(String Calle){
        this.Calle=Calle;
    }
    public String getCalle(){
        return Calle;
    }
    public void setNumero(String Numero){
        this.Numero=Numero;
    }
    public String getNumero(){
        return Numero;
    }
    public void setComuna(String Comuna){
        this.Comuna=Comuna;
    }
    public String getComuna(){
        return Comuna;
    }  
    @Override
    public String toString(){
        return String.format("%s %s %s \n",Calle,Numero,Comuna);
    }
}
