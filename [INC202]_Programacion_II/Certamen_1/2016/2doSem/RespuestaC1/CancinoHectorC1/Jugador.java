import java.util.Random;
public class Jugador{

	private int numero;
	private int br;
	private int bg;
	private int gc;
	public boolean arquero;
	private int ji;
	private int tp;
    
	public void setNumero(int num){
		this.numero = num;
	}

	public int getNumero(){
		return numero;
	}

	public void setBr(int b1){
		this.br = b1;
	}

	public int getBr(){
		return br;
	}

    public void setBg(int b2){
        this.bg = b2;
    }
    
	public int getBg(){
		return bg;
	}
    public void setArquero(boolean arq){
        this.arquero = arq;    
    }

    public boolean isArquero(){
        return arquero;
    }
	    
    public void setGc(int g){
    	this.gc = g;
    }
      

    public int getGc(){
    	return gc;
    }
	public void setJi(int j){
		this.ji = j;
	}

	public int getJi(){
		return ji;
	}

    public void setTp(int t){
    	this.tp = t;
    }
      

    public int getTp(){
    	return tp;
    }
}