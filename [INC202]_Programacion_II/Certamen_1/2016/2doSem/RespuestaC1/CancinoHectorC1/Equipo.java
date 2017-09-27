import java.util.Random;


public class Equipo{
	private Jugador[] listaJugador = new Jugador[11];
	private int nEquipo;
	private int jc;
	public void llenarEquipo(){
		//Generar Arquero
		int i=0;
		Random jg = new Random();
		listaJugador[i] = new Jugador();
		listaJugador[i].setNumero(jg.nextInt(10000));
		jg = new Random();
		listaJugador[i].setBr(jg.nextInt(100)+1);
		jg = new Random();
		listaJugador[i].setBg(jg.nextInt(100)+1);
		listaJugador[i].setArquero(true);
		listaJugador[i].setGc(0);	
		listaJugador[i].setJi(((listaJugador[i].getBr()*20)+(listaJugador[i].getBg()*35)+(listaJugador[i].getCg()*45))/100);
		listaJugador[i].setTp(0);
		//Generar Defensas
		
		for(i=1; i<4; i++){
			jg = new Random();
			listaJugador[i].setNumero(jg.nextInt(10000));
			jg = new Random();
			listaJugador[i].setBr(jg.nextInt(100)+1);
			jg = new Random();
			listaJugador[i].setBg(jg.nextInt(100)+1);
			listaJugador[i].setArquero(false);
			jg = new Random();
			listaJugador[i].setGc(jg.nextInt(100)+1);	
			listaJugador[i].setJi(((listaJugador[i].getBr()*20)+(listaJugador[i].getBg()*35)+(listaJugador[i].getCg()*45))/100);
			listaJugador[i].setTp(1);
		}

		//Generar Laterales

		for(i=4; i<6; i++){
			jg = new Random();
			listaJugador[i].setNumero(jg.nextInt(10000));
			jg = new Random();
			listaJugador[i].setBr(jg.nextInt(100)+1);
			jg = new Random();
			listaJugador[i].setBg(jg.nextInt(100)+1);
			listaJugador[i].setArquero(false);
			jg = new Random();
			listaJugador[i].setGc(jg.nextInt(100)+1);	
			listaJugador[i].setJi(((listaJugador[i].getBr()*20)+(listaJugador[i].getBg()*35)+(listaJugador[i].getCg()*45))/100);
			listaJugador[i].setTp(2);
		}

		//Generar Centro Campistas

		for(i=6; i<8; i++){
			jg = new Random();
			listaJugador[i].setNumero(jg.nextInt(10000));
			jg = new Random();
			listaJugador[i].setBr(jg.nextInt(100)+1);
			jg = new Random();
			listaJugador[i].setBg(jg.nextInt(100)+1);
			listaJugador[i].setArquero(false);
			jg = new Random();
			listaJugador[i].setGc(jg.nextInt(100)+1);	
			listaJugador[i].setJi(((listaJugador[i].getBr()*20)+(listaJugador[i].getBg()*35)+(listaJugador[i].getCg()*45))/100);
			listaJugador[i].setTp(3);
		}

		//Generar Delanteros
		
		for(i=8; i<11; i++){
			jg = new Random();
			listaJugador[i].setNumero(jg.nextInt(10000));
			jg = new Random();
			listaJugador[i].setBr(jg.nextInt(100)+1);
			jg = new Random();
			listaJugador[i].setBg(jg.nextInt(100)+1);
			listaJugador[i].setArquero(false);
			jg = new Random();
			listaJugador[i].setGc(jg.nextInt(100)+1);	
			listaJugador[i].setJi(((listaJugador[i].getBr()*20)+(listaJugador[i].getBg()*35)+(listaJugador[i].getCg()*45))/100);
			listaJugador[i].setTp(4);
		}



	}

	public void setNEquipo(int nE){
		this.nEquipo = nE;
	}

	public int getNEquipo(){
		return nEquipo;
	}

	public int getJc(){
		int tem = 0;
		for(int i=0; i<11; i++){
			tem = listaJugador[i].getJi() + tem;
			jc = tem; 
		}
		return jc;
	} 

}