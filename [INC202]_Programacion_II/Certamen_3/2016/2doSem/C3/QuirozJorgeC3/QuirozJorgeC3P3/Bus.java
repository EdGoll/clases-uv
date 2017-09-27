import java.util.Random;

public class Bus{
	private int asientostotales;
	private int asientosdisponibles;
	private int asientosocupados;
	private Random r;

	public Bus(int asientostotales){
		asientosdisponibles=asientostotales;
		this.asientostotales=asientostotales;
		asientosocupados=0;
		r = new Random();
	}

	public synchronized void subir(int pasajeros){
		asientosocupados=asientostotales - asientosdisponibles;
		try{
			while (asientosdisponibles==0){
				System.out.println("---------SUBIDA NO DISPONIBLE--------");
				System.out.println("El bus va lleno");
				System.out.println("Cantidad de asientos disponibles: "+asientosdisponibles);
				System.out.println("-----------------------------");
				wait();
			}
			while (pasajeros>asientosdisponibles){
				System.out.println("---------SUBIDA DE PASAJEROS--------");
				System.out.println("Intentando subir "+pasajeros+" pasajero(s).");
				System.out.println("No hay suficientes asientos");
				System.out.println("Cantidad de asientos disponibles: "+asientosdisponibles);
				System.out.println("-----------------------------");
				wait();
			}
				asientosdisponibles=asientosdisponibles-pasajeros;
				asientosocupados=asientostotales - asientosdisponibles;
				System.out.println("---------SUBIDA DE PASAJEROS--------");
				System.out.println("Intentando subir "+pasajeros+" pasajero(s).");
				System.out.println("Exito!");
				System.out.println("Nueva cantidad de asientos disponibles: "+asientosdisponibles);
				System.out.println("-----------------------------");
			notifyAll();
		}
		catch (InterruptedException ex){
			System.out.println(ex.getMessage());
		}
	}

	public synchronized void bajar(int pasajeros){
		asientosocupados=asientostotales - asientosdisponibles;
		try{
			while (asientosdisponibles==asientostotales){
				System.out.println("---------BAJADA NO DISPONIBLE--------");
				System.out.println("El bus va vacio");
				System.out.println("Cantidad de asientos disponibles: "+asientosdisponibles);
				System.out.println("-----------------------------");
				wait();
			}
			while (pasajeros>asientosocupados){
				System.out.println("---------BAJADA DE PASAJEROS--------");
				System.out.println("Intentando bajar "+pasajeros+" pasajero(s).");
				System.out.println("No hay suficientes pasajeros para bajar");
				System.out.println("Cantidad de asientos ocupados: "+asientosocupados);
				System.out.println("-----------------------------");
				wait();
			}
				asientosdisponibles=asientosdisponibles+pasajeros;
				asientosocupados=asientostotales - asientosdisponibles;
				System.out.println("---------BAJADA DE PASAJEROS--------");
				System.out.println("Intentando bajar "+pasajeros+" pasajero(s).");
				System.out.println("Exito!");
				System.out.println("Nueva cantidad de asientos ocupados: "+asientosocupados);
				System.out.println("-----------------------------");
			notifyAll();
		}
		catch (InterruptedException ex){
			System.out.println(ex.getMessage());
		}

}
}