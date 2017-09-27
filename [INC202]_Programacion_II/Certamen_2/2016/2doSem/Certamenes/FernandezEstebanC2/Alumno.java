public class Alumno extends Persona {
   
    private String ramos;

    public Alumno(String ramos) {
        this.ramos = ramos;
    }
    
    public Alumno(){
        
    }

    public String getRamos() {
        return ramos;
    }

    public void setRamos(String ramos) {
        this.ramos = ramos;
    }
    
}
