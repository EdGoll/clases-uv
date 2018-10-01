public class InicioCombateImpl{

    public static void main(String[] args) {
    	Personaje mago = new Mago(50);
    	Personaje guerrero = new Guerrero(50);
        Combate combate = new Combate();
    	
        ThreadMago te = new ThreadMago(mago,guerrero,combate);
        ThreadGuerrero ts = new ThreadGuerrero(guerrero,mago,combate);
        ts.start();
        te.start();     
    }
}