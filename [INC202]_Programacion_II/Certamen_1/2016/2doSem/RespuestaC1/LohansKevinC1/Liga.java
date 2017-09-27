import java.util.Random;
import java.util.ArrayList;

public class Liga{

	private ArrayList <equipos> equipo = new ArrayList <>();
	private ArrayList <equipos> ln = new ArrayList <>();
	public void partidoOctavos(){
		Random r = new Random();
		Equipo po;
		Encuentro partido = new Encuentro();
		for (int i=0; i<9; i++)
			po=partido.encuentros(equipo.remove(r.nextInt(equipo.size())),equipo.remove(r.nextInt(equipo.size())));
			ln.add(po);
	}

	public void partidoCuartos(){
		Random r = new Random();
		Equipo pc;
		Encuentro partido = new Encuentro();
		for (int i=0; i<5; i++)
			je=partido.encuentros(equipo.remove(r.nextInt(equipo.size())),equipo.remove(r.nextInt(equipo.size())));
			ln.add(pc);
	}

	public void partidoSemifinal(){
		Random r = new Random();
		Equipo ps;
		Encuentro partido = new Encuentro();
		for (int i=0; i<3; i++)
			ps=partido.encuentros(equipo.remove(r.nextInt(equipo.size())),equipo.remove(r.nextInt(equipo.size())));
			ln.add(ps);
	}

	public void partidoFinal(){
		Random r = new Random();
		Encuentro partido = new Encuentro();
		partido.encuentros(equipo.remove(r.nextInt(equipo.size())),equipo.remove(r.nextInt(equipo.size())))

	}
}