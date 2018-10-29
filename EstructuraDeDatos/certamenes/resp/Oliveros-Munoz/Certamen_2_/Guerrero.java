public class Guerrero{
    String nombre, tipo_ataque;
    int energia = 150;
    String arma;
    int dano_g, dano_m, ataque_g;
    public synchronized void combatir(int option, Mago m1, Guerrero w1){
        switch(option){
            case 1: 
                System.out.println(nombre + " ha usado Golpe Directo contra " + m1.getNombre());
                m1.setEnergia(m1.getEnergia()-20);
                System.out.println("A " + m1.getNombre() + " le quedan " + m1.getEnergia() + " puntos de energia");
                //GUERRERO ATACA X 20
                tipo_ataque = "Golpe directo";
                ataque_g = 20;
                //MAGO RECIBE DAÑO X 20
                dano_m = 20;
                break;
            case 2:
                System.out.println(nombre + " ha usado Giro Letal contra " + m1.getNombre());
                m1.setEnergia(m1.getEnergia() - 30);
                System.out.println("A " + m1.getNombre() + " le quedan " + m1.getEnergia() + " puntos de energia");
                //GUERRERO ATACA X 30
                tipo_ataque = "Giro letal";
                ataque_g = 30;
                //MAGO RECIBE DAÑO X 30
                dano_m = 30;
                break;
            case 3:
                System.out.println(nombre + " ha usado Super Arma contra " + m1.getNombre());
                m1.setEnergia(m1.getEnergia() - 70);
                ataque_g = 70;
                w1.setEnergia(w1.getEnergia()- 21);
                System.out.println("A " + m1.getNombre() + " le quedan " + m1.getEnergia() + " puntos de energia");
                System.out.println("Con este ataque " + nombre + " se ha quitado energia a si mismo");
                System.out.println("A " + nombre + "le quedan " + energia + " puntos de energia");
                //GUERRERO ATACA X 70
                tipo_ataque = "Super arma";
                ataque_g = 70;
                //MAGO RECIBE DAÑO X 70
                dano_m = 70;
                //GUERRERO RECIBE DAÑO X 21
                dano_g = 21;
                break;
            case 4:
                System.out.println(nombre + " ha perdido su turno");
                break;
        }
        
        ReadWrite.writeFile("ataque.csv", "\n" + nombre + ";" + tipo_ataque + ";" + ataque_g, true);
        ReadWrite.writeFile("danio.csv","\n"+ nombre + ";" + dano_m + ";" + dano_g, true);
        notifyAll();
    }
    
    public Guerrero(String nombre){
        this.nombre = nombre;
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