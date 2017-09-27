public class Subaru extends Auto {
    private static Subaru instancia;

    // notse constructor privado
    private Subaru (){
        System.out.println("Creado por la factory");
    }
    
    // estrategia de instancia unica (singleton)
    public static Subaru getInstancia(){
        if (instancia == null){
            instancia = new Subaru();
        }
        
        return instancia;
    }
}
