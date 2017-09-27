package productorconsumidor;

public class Girador extends Thread {
    private int monto;
    private int montoGirado;
    private Cuenta cuenta;
    
    public Girador (String nombre, int monto, Cuenta cuenta){
        super(nombre);
        this.monto = monto;
        this.cuenta = cuenta;
    }
    
    public void run(){
        System.out.println(getName() + " : iniciando ...");
        for (int i = 0; i < 100; i++){
            montoGirado += cuenta.girar(monto);
            System.out.println(getName() + " : girado...");
        }
        System.out.println(getName() + " : finalizando, total monto girado : " + montoGirado);
    }
}
