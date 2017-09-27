
import java.util.Random;


public class Autobus extends Thread {
     private final int MAXIMO=45;
    private final int MINIMO=0;
    private final int MAXIMOALEATORIO=10;
    private final int MINIMOALEATORIO=1;
    private int Pasajeros;
    private int Bus;       
    private Random rd;

    public Autobus() {
        System.out.println("Inicia recorrido Autobus");
        this.Bus = 0;
    }

    public synchronized void SubirPasajeros() {
        if(Bus<MAXIMO){

            System.out.println("subiendo pasajeros");
                if((Bus+MAXIMOALEATORIO)>MAXIMO){ /* limita la cantidad a subir de pasajeros si no es posible que suban todos*/
                    Pasajeros=Random(MAXIMO-Bus);
                }
                else{
                    Pasajeros=Random();          
                }
                Bus=Bus+Pasajeros;
                Mostrar();
        }

    }
    public  synchronized void BajarPasajeros(){
        if(Bus>0){
            System.out.println("bajando pasajeros");
                if((Bus-MAXIMOALEATORIO)<MINIMO){
                    Pasajeros=Random(Bus); /*solo podran bajar como maximo el total  de personas que hay en el bus*/
                }
                else{
                    Pasajeros=Random();
                }
                Bus=Bus-Pasajeros;
                Mostrar();
        }
    }    
    
    public int getBus(){
        return Bus;
    }
    
    public int getPasajeros(){
        return Pasajeros;
    }
    
    
    public int Random(int maximo){ 
        /*recibe el valor maximo que de personas que puede subir o bajar
        dependiendo de cuantas personas se encuentren en el bus*/
        int pasajeros;
        rd=new Random();
        pasajeros=rd.nextInt(maximo)+1;
    return pasajeros;
    }
    
    private int Random(){ 
        /*si no recibe valor maximo se toma el valor maximo aleatorio*/
        int pasajeros;
        rd=new Random();
        pasajeros=rd.nextInt(10)+1;
    return pasajeros;
    }
    
    public void Mostrar(){
        System.out.println("pasajeros : "+Pasajeros);
        System.out.println("Hay en el Bus  : "+Bus);
    }
}

