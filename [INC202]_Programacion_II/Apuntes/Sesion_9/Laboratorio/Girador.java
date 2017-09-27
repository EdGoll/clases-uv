public class Girador extends Thread {
    private int monto;
    private int montoAcumulado;
    private Cuenta cuenta;
    
    public Girador(String nombre, int monto, Cuenta cuenta){
        super(nombre);
        this.monto = monto;
        this.cuenta = cuenta;
    }
    
    public void run(){
        System.out.println(getName() + " : iniciando ...");
        for (int i = 0; i < 100; i++){
            synchronized(cuenta){
                montoAcumulado += cuenta.giro(monto);
            }
        }
        System.out.println(getName() + " : finalizando, con monto acum :" + montoAcumulado);
    }
}
