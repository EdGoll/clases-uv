public class Mago implements Personaje{
    private String nombre;
    private int energia;
    private String poder;
    
    @Override
    public String getNombre(){
        return nombre;
    }
    @Override
    public int getEnergia(){
        return energia;
    }
    
    public Mago(String nombre, int energia){
        this.nombre = nombre;
        this.energia = energia;
    }
    
    public String encantar(int ran){
        if(ran == 0){
            //System.out.println("Llamarada");
            poder = "Llamarada";
            return poder;
        }else{
            if(ran == 1){
                //System.out.println("Incendio");
                poder = "Incendio";
                return poder;
            }else{
                if(ran == 2){
                    //System.out.println("Explosion");
                    poder = "Explosion";
                    return poder;
                }else{
                    //System.out.println("Pierde Turno");
                    poder = "Pierde Turno";
                    return poder;
                }
            }
        }
    }
    
	@Override
	public int Alimentarse(int nuevaEnergia) {
		return 0;
	}
	@Override
	public int consumirEnergia(int gastoEnergia) {
		return 0;
	}
	
	public void setEnergia(int energia1) {
		this.energia = energia1;
	}
}
