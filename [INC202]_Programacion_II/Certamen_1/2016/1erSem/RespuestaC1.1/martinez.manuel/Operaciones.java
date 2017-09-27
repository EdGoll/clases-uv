import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.StringTokenizer;

/**
 *
 * @author manuelmartinez
 */
public class Operaciones {
    public List<Pasajero> ordenar(List<String> dataset) {

		List<Pasajero> dataset_lista = new ArrayList<Pasajero>();

		for(String l : dataset){

			StringTokenizer st = new StringTokenizer(l,",");
			while(st.hasMoreElements()){
				Pasajero pasajero = new Pasajero();
				
				
				try{
				pasajero.setPasajeros(st.nextToken());
			
				pasajero.setEstado(st.nextToken());
			
                pasajero.setClase(st.nextToken());
               
                pasajero.setNombre(st.nextToken() + st.nextToken());
               
                pasajero.setSexo(st.nextToken());
               
                pasajero.setEdad(st.nextToken());
               
                pasajero.setTamFamilia(st.nextToken());
               
                pasajero.setTicket(st.nextToken());
               
                pasajero.setTarifaPasaje(st.nextToken());
                
                st.nextToken(); //cabinaaaaa no se ocupa!
                
                pasajero.setEmbarcadoEn(st.nextToken());
                


                dataset_lista.add(pasajero);
            } catch(Exception e){}


			}

		}

		return dataset_lista;
	}


	public void imprimirMenu(){
		System.out.println("Bienvenido al programa que analiza la catastrofe marina del Titanic!");
		System.out.println("Elija una opcion");
		System.out.println("1)Buscar pasajero por nombre y comprobar si sobrevivió al incidente del titanic");
		System.out.println("2)Cual fue la cantidad de pasajeros que sobrevivieron y que no lo hicieron?");
		System.out.println("3)Cual fue la clase social en el barco con mas muertos?");
		System.out.println("4)Cuantos pasajeros tenian familiares abordo?");
		System.out.println("5)Donde se embarcaron la mayor cantidad de pasajeros?");
		System.out.println("6)Salir");
	}

	public void buscarNombre(List<Pasajero> dataset){
		Scanner leer = new Scanner(System.in);
		String nombre;

		System.out.println("Ingrese el nombre del pasajero que desea buscar");
		nombre = leer.nextLine();

		for(Pasajero l : dataset){
			String nombrePas = l.getNombre();

			if(nombre == nombrePas){
				System.out.println("El estado del pasajero en el incidente es:  "+l.getEstado());

			}
		}
	}
	public void totalIncidentes(List<Pasajero> dataset){
		int sobrevivio=0, fallecio=0;

		for(Pasajero l : dataset){
			String estado = l.getEstado();
			if(estado == "Survived"){
				sobrevivio++;
			} else {
				fallecio++;

			}
		}
		System.out.println("La cantidad de pasajeros sobrevientes fue de "+sobrevivio+" pasajeros");
		System.out.println("El numero de los que no lo lograron fue "+fallecio);
	}
	public void clasista(List<Pasajero> dataset){
		int claseA=0,claseM=0,claseB=0;
                
		for(Pasajero l : dataset){
                    
			String estado = l.getEstado();
                        String clase = l.getClase();
                        
			if(estado == "Survived"){

				if(clase == "3"){ //clase alta
					claseA++;

				} else if( clase == "2"){ // clase media
					claseM++;

				} else {// clase baja
					claseB++;

				}
			}
		}

		if( (claseA > claseM) && (claseM > claseB) ){
			System.out.println("La clase social que sufrio menos fallecidos fue.. la clase alta");
		} else if( (claseM > claseA) && (claseA > claseB) ) {
			System.out.println("La clase social que sufrio menos fallecidos fue.. la clase media!");
		} else {
			System.out.println("La clase social que sufrio menos fallecidos fue.. la clase baja!!!");
		}
	}
	public void familiares(List<Pasajero> dataset){
		int pasajerosConFamilia=0;
		for(Pasajero l : dataset){
			int tamFam = Integer.parseInt(l.getTamFamilia());
			if(tamFam>0){
				pasajerosConFamilia++;
			}
		}
		System.out.println("La cantidad de pasajeros con familiares abordo era de "+pasajerosConFamilia);
	}
	public void embarcaronEn(List<Pasajero> dataset){
		int q=0,c=0,s=0;
		String embarcadoEn;

		for(Pasajero l : dataset){
			embarcadoEn = l.getEmbarcadoEn();
			if(embarcadoEn=="Q"){
				q++;
			} else if(embarcadoEn=="C"){
				c++;
			} else {
				s++;
			}

			if(q>c && c>s){
				System.out.println("El lugar donde mas se embarcaron fue en Queenstown");
			} else if( c > q && q > s){
				System.out.println("El lugar donde mas se embarcaron fue en Cherbourg");
			} else {
				System.out.println("El lugar donde mas se embarcaron fue en Southampton");
			}
		}
	}
}
