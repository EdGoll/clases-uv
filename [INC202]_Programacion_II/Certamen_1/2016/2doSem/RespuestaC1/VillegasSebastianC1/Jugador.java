public class Jugador 
{
    private int ID, BR, BG, GC,PWLVL;
    private String Tipo;
    
    public Jugador(int ID, int BR, int BG, int GC, String Tipo)
    {
        this.ID = ID;
        this.BR = BR;
        this.BG = BG;
        this.GC = GC;
        this.Tipo = Tipo;
        if(this.BR == 0){this.BR += 1;}   //Si los randómicos me dieron un valor 0 sumo un número para mantenerme en el rango 1 a 100
        if(this.BG == 0){this.BG += 1;}
        if(this.GC == 0 && this.Tipo != "Portero"){this.GC += 1;}
        PWLVL = (int)Math.round(this.BR*0.2 + this.BG*0.35 + this.GC*0.45);
    }
    
    public int getPWLVL()
    {
        return PWLVL; //retorno dat powerlevel
    }
    
    @Override
    public String toString()//Método inutilizado, para verificar si los equipos se generan correctamente
    {
        return BR + " " + BG +" "+ GC+ " " + ID+ " " + PWLVL+ " " + Tipo; 
    }
    
}
