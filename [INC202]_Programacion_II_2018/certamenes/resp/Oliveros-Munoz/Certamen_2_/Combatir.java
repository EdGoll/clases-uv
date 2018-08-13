public class Combatir {
    public static void main(String[] args) throws InterruptedException{
        Mago mage = new Mago("Jaina");
        Guerrero warrior = new Guerrero("Garrosh");
        
        ThreadGuerrero g1 = new ThreadGuerrero(warrior, mage);
        ThreadMago m1 = new ThreadMago(mage, warrior);
        
        g1.start();
        //ThreadGuerrero.sleep(3000);
        m1.start();
        
        try {
            g1.join();
            m1.join();
        } catch (InterruptedException ex) {
            ex.printStackTrace();
        }
        if(mage.getEnergia()<=0 && warrior.getEnergia()<=0){
            System.out.println("EMPATE: Ambos han quedado sin energia");
        }else{
            if(mage.getEnergia()<=0){
                System.out.println(warrior.getNombre() + " HA GANADO!");
            }else{
                if(warrior.getEnergia()<=0){
                    System.out.println(mage.getNombre() + " HA GANADO!");
                }
            }
        }
    }
}