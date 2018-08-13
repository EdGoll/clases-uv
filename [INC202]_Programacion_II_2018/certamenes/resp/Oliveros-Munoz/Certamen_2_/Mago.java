public class Mago{
    String nombre, tipo_ataque;
    int energia = 100;
    ReadWrite rw = new ReadWrite();
    int dano_m, dano_g, ataque_m;
    
    public Mago(String nombre){
        this.nombre = nombre;
    }
    
    public synchronized void encantar(int option, Guerrero w1, Mago m1){
        switch(option){
            case 1: 
                System.out.println(nombre + " ha usado Llamarada contra " + w1.getNombre());
                w1.setEnergia(w1.getEnergia()-20);
                System.out.println("A " + w1.getNombre() + " le quedan " + w1.getEnergia() + " puntos de energia");
                //MAGO ATACA X 20
                tipo_ataque = "llamarada";
                ataque_m = 20;
                //GUERRERO RECIBE DAÑO X 20
                dano_g = 20;
                break;
            case 2:
                int bonus = (int) (Math.random() * 1);
                System.out.println(nombre + " ha usado Incendio contra " + w1.getNombre());
                w1.setEnergia(w1.getEnergia()-35);
                System.out.println("A " + w1.getNombre() + " le quedan " + w1.getEnergia() + " puntos de energia");
                if(bonus == 1){
                    System.out.println(nombre + " ha conseguido un bonus de danio, restandole otros 5 puntos de energia a " + w1.getNombre());
                    w1.setEnergia(w1.getEnergia()-5);
                    System.out.println("A " + w1.getNombre() + " le quedan " + w1.getEnergia() + " puntos de energia");
                    //MAGO ATACA X 40
                    tipo_ataque = "Incendio";
                    ataque_m = 40;
                    //GUERRERO RECIBE DAÑO X 40
                    dano_g = 40;
                }
                else{
                    System.out.println(nombre + " no ha conseguido el bonus de danio");
                    //MAGO ATACA X 40
                    tipo_ataque = "Incendio";
                    ataque_m = 35;
                    //GUERRERO RECIBE DAÑO X 35
                    dano_g = 35;
                }
                break;
            case 3:
                System.out.println(nombre + " ha usado Explosion contra " + w1.getNombre());
                w1.setEnergia(w1.getEnergia()-60);
                System.out.println("A " + w1.getNombre() + " le quedan " + w1.getEnergia() + " puntos de energia");
                //MAGO ATACA X 60
                tipo_ataque = "Explosion";
                ataque_m = 60;
                //GUERRERO RECIBE DAÑO X 60
                dano_g = 60;
                System.out.println("Ademas " + nombre + " ha conseguido recuperar 30 puntos de energia");
                m1.alimentarse(m1);
                System.out.println("A " + nombre + " le quedan " + m1.getEnergia() + " puntos de energia");
                break;
            case 4:
                System.out.println(nombre + " ha perdido su turno");
                break;
        }
        ReadWrite.writeFile("ataque.csv", "\n" + nombre +";"+ tipo_ataque + ";" + ataque_m, true);
        ReadWrite.writeFile("danio.csv", "\n" + nombre + ";" + dano_g, true);
        notifyAll();
    }
    
    public void alimentarse(Mago m1){
        m1.setEnergia(m1.getEnergia() + 30);
    }
    
    
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEnergia() {
        return energia;
    }

    public void setEnergia(int energia) {
        this.energia = energia;
    }
    
    
}