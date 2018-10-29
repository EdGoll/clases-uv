public class ThreadGuerrero extends Thread{
    
    protected Guerrero warrior;
    protected Mago mago;
    
    public ThreadGuerrero(Guerrero warrior, Mago mago){
        this.warrior = warrior;
        this.mago = mago;
    }
    
    @Override
    public void run() {
        while(true) {
            try {
                ThreadGuerrero.sleep(4000);
                if(mago.getEnergia() > 0 && warrior.getEnergia()>0) {
                    warrior.combatir((int) ((Math.random() * 3) + 1) , mago , warrior);
                }
                else{
                    break;
                }
            } catch (InterruptedException ex) {
                ex.printStackTrace();
            }
        }
    }
}