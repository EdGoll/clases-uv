public class ThreadMago extends Thread{
    
    protected Mago mago;
    protected Guerrero warrior;
    
    public ThreadMago(Mago mago, Guerrero warrior){
        this.mago = mago;
        this.warrior = warrior;  
    }
    
    @Override
    public void run() {
        while(true){   
            try {   
                ThreadMago.sleep(4000);
                if(mago.getEnergia() > 0 && warrior.getEnergia()>0) {
                    mago.encantar((int) ((Math.random() * 3) + 1),warrior, mago);
                }
                else{
                    break;
                }
            }catch (InterruptedException ex) {
                ex.printStackTrace();
            }
        } 
    }
}