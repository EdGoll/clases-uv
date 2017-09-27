import java.util.List;
import java.util.ArrayList;

public class WorldCupImp {

	private List<String> lineas;
	private List<Juego> juegos;

	public WorldCupImp() {
		lineas = FuenteDatos.leer("WorldCupBrazil2014_dataset.txt");
	}

	public void leer() {
		Juego g;
		juegos = new ArrayList<Juego>();
		if (lineas != null && !lineas.isEmpty()){
			for(String linea : lineas){
				g = new Juego(
					linea.substring(0, 5),
					linea.substring(5, 22),
					linea.substring(22, 55),
					linea.substring(55, linea.length() - 1)
					);
				juegos.add(g);
			}
		}
	}
	
	public void mostrar() {
		if (juegos != null && !juegos.isEmpty()){
			for(Juego juego : juegos){
				System.out.println(juego.toString());
			}
		}
	}
	
	public void partidosJugados() {
		System.out.println("Se jugaron " + juegos.size() + " partidos.");
	}
	
	public void partidosJugadosChile() {
		int count = 0;
		if (juegos != null && !juegos.isEmpty()){
			for(Juego juego : juegos){
				if (juego.getResultado().contains("Chile")) {
					count++;
				}
			}
		}
		System.out.println("Chile jugo " + count + " partidos.");
	}
	
	public void resultadosChile() {
		System.out.println("Los resultados de Chile fueron:");
		if (juegos != null && !juegos.isEmpty()){
			for(Juego juego : juegos){
				if (juego.getResultado().contains("Chile")) {
					System.out.println(juego.getResultado());
				}
			}
		}
	}
}