
package babyboom;

public class ListaBebe {
    private String horaNacido;
    private String sexoNinio;
    private String peso;
    private String minDespues12;
    
    public void SethoraNacido(String horaNacido){
        this.horaNacido = horaNacido;
    }
    
    public String gethoranacido(){
            return horaNacido;
    }
    public void SetsexoNinio(String sexoNinio){
        this.sexoNinio = sexoNinio;
    }
    
    public String getsexoNinio(){
            return sexoNinio;
    }
    public void Setpeso(String peso){
        this.peso = peso;
    }
    
    public String getpeso(){
            return peso;
    }
    public void SetminDespues12(String minDespues12){
        this.minDespues12 = minDespues12;
    }
    
    public String getminDespues12(){
            return minDespues12;
    }   
    
    @Override
    public String toString() {
        return String.format("%s %s %s %s ",horaNacido,sexoNinio,peso,minDespues12);
    }
}
