import java.util.Random;
import java.util.ArrayList;

public class Liga{
	//ArrayList de 16 equipos.
	public ArrayList<Equipo> equipos=new ArrayList<>();
	public ArrayList<Equipo> octavos=new ArrayList<>();
	public ArrayList<Equipo> cuartos=new ArrayList<>();
	public ArrayList<Equipo> semis=new ArrayList<>();

	public void crearEquipos(){
		Random random=new Random();
		int temp=0;
		int n;
		for(int x=0;x<16;x++){
			Equipo e=new Equipo();
			//Para agregar nombre randómico(número entre 1 y 16) distintos entre si.
			n=random.nextInt(16)+1;
			while(temp==n){
				n=random.nextInt(16)+1;
			}
			temp=n;
			e.setNombre(n);
			e.agregarJugadores();
			e.setNivelColectivo(e.calcularNivelColectivo());
			equipos.add(e);					
		}
	}
	public void hacerOctavos(){
		Equipo equipo=new Equipo();
		Random random=new Random();
		Encuentro n=new Encuentro();
		for(int x=0;x<8;x++){
			equipo=n.hacerEncuentro(equipos.remove(random.nextInt(equipos.size())), equipos.remove(random.nextInt(equipos.size())));
			octavos.add(equipo);
		}
	}
	public void hacerCuartos(){
		Equipo equipo=new Equipo();
		Random random=new Random();
		Encuentro n=new Encuentro();
		for(int x=0;x<4;x++){
			equipo=n.hacerEncuentro(octavos.remove(random.nextInt(octavos.size())), octavos.remove(random.nextInt(octavos.size())));
			cuartos.add(equipo);
		}
	}
	public void hacerSemis(){
		Equipo equipo=new Equipo();
		Random random=new Random();
		Encuentro n=new Encuentro();
		for(int x=0;x<2;x++){
			equipo=n.hacerEncuentro(cuartos.remove(random.nextInt(cuartos.size())), cuartos.remove(random.nextInt(cuartos.size())));
			semis.add(equipo);
		}
	}
	public void hacerFinalFinal(){
		Equipo equipo=new Equipo();
		Random random=new Random();
		Encuentro n=new Encuentro();
		n.hacerEncuentro(semis.remove(random.nextInt(semis.size())), semis.remove(random.nextInt(semis.size())));
	}
}	
