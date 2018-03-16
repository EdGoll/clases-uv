public abstract class Personaje {
    public String nombre;
    public int energia;
    
    public Personaje(String nombre, int energia){
        this.nombre=nombre;
        this.energia=energia;
    }
    
    public String getNombre(){
        return nombre;
    }
    
    public int getEnergia(){
        return energia;
    }
    
    public void alimentarse(int nuevaEnergia){
        energia = energia + nuevaEnergia;
    }
    
    public void consumirEnergia(int gastoEnergia){
        //consume por ataque recibido
    }
    
    @Override
    public String toString(){
        return "Personaje" + nombre + "energia" + energia;
    }
    
}