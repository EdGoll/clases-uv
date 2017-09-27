import java.util.Random;
import java.util.ArrayList;

public class Encuentro{
	
	public Equipo hacerEncuentro(Equipo eq1, Equipo eq2){
		Random random=new Random();
		Equipo ganador=new Equipo();
		int empate=2;
		if(eq1.getNivelColectivo()>eq2.getNivelColectivo())
			ganador=eq1;
		else
			ganador=eq2;
		if(eq1.getNivelColectivo()==eq2.getNivelColectivo())
			empate=random.nextInt(1);
		if(empate==0)
			ganador=eq1;
		if(empate==1)
			ganador=eq2;
		System.out.println("Equipo "+eq1.getNombre()+"(nivel de juego "+eq1.getNivelColectivo()+
		") v/s Equipo "+eq2.getNombre()+"(nivel de juego "+eq2.getNivelColectivo()+"), Resultado: Ganador Equipo "+ganador.getNombre());
		return ganador;
	}
}

