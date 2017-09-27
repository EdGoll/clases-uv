import java.util.Random;
import java.util.ArrayList;

public class Encuentro{
	private Equipo [] listaDeEquipo = new Equipo[16];
	private Partido [] listaDePartido = new Partido[15];

	public Encuentro(){
        hacerEquipos();
        generarPartido8();
        generarPartido4();
        generarPartido2();
        generarPartido1();
    }

	public void hacerEquipos(){
		for(int i=0; i<16; i++){
			listaDeEquipo[i] = new Equipo();
			listaDeEquipo[i].llenarEquipo();
			listaDeEquipo[i].getJc();
			listaDeEquipo[i].setNEquipo(i);
		}
	}

	public void generarPartido8(){
		listaDePartido[i] = new Partido();
		hacerEquipos();
		System.out.println("Octavos de Final")
		for(int i=0; i<8; i++){
			listaDePartido[i].jugador1 = listaDeEquipo[i].getJc();
			listaDePartido[i].jugador2 = listaDeEquipo[i+2].getJc();
			if(listaDePartido[i].jugador1>listaDePartido[i].jugador2){

			}

		}
	}
}