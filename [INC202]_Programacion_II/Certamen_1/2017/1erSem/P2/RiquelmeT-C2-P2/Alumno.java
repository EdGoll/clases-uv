public class Alumno {
    
    //Identificador
    private int ident; 
    
    //Recoger y retornar el identificador
    public int getIdent(){ 
        return ident;
    }
    // Modificar el identificador
    public void setIdent(int ident){ 
        this.ident = ident;
    }
    @Override
    public String toString(){
        return String.format("Identificador alumno: %d", ident);
    }
    
}
