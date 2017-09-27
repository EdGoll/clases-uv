package hebras;
public class Compartido {
    private String valor;
    
    {
        // esto es un bloque de inicializacion (se carga antes de cualquier constructor)
        valor = "primer Valor";
    }
    
    public void setValor(String valor){
        System.out.println("colocando el valor : " + valor);
        dormir();
        this.valor = valor;
    }
    
    public String getValor(){
        System.out.println("Obteniendo Valor " + valor);
        dormir();
        return valor;
    }
    
    private void dormir(){
        try {
            Thread.sleep(500);
        } catch (InterruptedException ex) {
            ex.printStackTrace();
        }
    }
}
