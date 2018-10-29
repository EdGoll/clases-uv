public class Guerrero implements Personaje{
    
    private String nombre;
    private int energia;
    private String arma;
    
    public Guerrero(String nombre, int energia){
        this.nombre = nombre;
        this.energia = energia;
    }
    
    public String combatir(int ran){        
        if(ran == 0){
            //System.out.println("Golpe Directo");
            arma = "Golpe Directo";
            return arma;
        }else{
            if(ran == 1){
                //System.out.println("Giro Letal");
                arma = "Giro Letal";
                return arma;
            }else{
                if(ran == 2){
                    //System.out.println("Super Arma");
                    arma = "Super Arma";
                    return arma;
                }else{
                    //System.out.println("Pierde Turno");
                    arma = "Pierde Turno";
                    return arma;
                }
            }
        }
    }

	@Override
	public int Alimentarse(int nuevaEnergia) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int consumirEnergia(int gastoEnergia) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public String getNombre() {
		return nombre;
	}

	@Override
	public int getEnergia() {
		return energia;
	}
	
	public void setEnergia(int energia1) {
		this.energia = energia1;
	}
	
	
	
}
