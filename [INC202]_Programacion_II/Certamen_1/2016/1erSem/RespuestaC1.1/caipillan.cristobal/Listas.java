


import java.util.*;

public class Listas {
		List<ObtenerSetearDatos> Planta;
		
		
	public void obtenerDatos(){
		List<String> lineas;
		StringTokenizer stTok=null;
		FuenteDeDatos fuente =new FuenteDeDatos();
		ObtenerSetearDatos planta2;
		lineas=new ArrayList<String>();
		Planta=new ArrayList<ObtenerSetearDatos>();
		lineas= fuente.leerArchivo("empleoPlantasDeProceso2006.csv");
		lineas.remove(0);
		
		for(String linea:lineas){
				stTok=new StringTokenizer(linea,";");
				if(stTok.hasMoreElements()){
					 planta2=new ObtenerSetearDatos();
					 planta2.setAnio(stTok.nextToken());
					 planta2.setNui(Integer.parseInt(stTok.nextToken()));
					 planta2.setRegion(Integer.parseInt(stTok.nextToken()));
					 planta2.setTrimestre(Integer.parseInt(stTok.nextToken()));
					 planta2.setMes(Integer.parseInt(stTok.nextToken()));
					 planta2.setCategoria(stTok.nextToken());
					 planta2.setFuncion(stTok.nextToken());
					 planta2.setGenero(stTok.nextToken());
					 planta2.setOcupados(Integer.parseInt(stTok.nextToken()));
					 Planta.add(planta2);
				}
		}
		
	}	
	public void mostrarDatos(){
		for(ObtenerSetearDatos datos : Planta){
			System.out.println(datos.toString());
		}
	}
	public void NPlantasDecimaRegion(){
		int contador=0;
		for(ObtenerSetearDatos pb :Planta){
			if(pb.getRegion()==10){
				contador++;
			}
			System.out.println("La cantidad de plantas que estan en la decima region es: "+contador);
		}
	}
	public void NPlantasClaseAnimal(){
		int contador=0;
		for(ObtenerSetearDatos pb : Planta){
			if(pb.getCategoria()=="ANIMAL"){
				contador++;
			}
		}	
		System.out.println("La cantidad de plantas que son de tipo animal son: "+contador);
		
	}
	public void ordenarPorFecha(){
		Collections.sort(Planta);
		for(ObtenerSetearDatos ff: Planta){
			System.out.println(ff.toString());
		}
	}
	public void buscar(){
		Scanner sc = new Scanner(System.in);
		String categoria;
		try{
			System.out.println("Ingrese categoria: CONTRATO   SUBCONTRATO");
			categoria = sc.nextLine();
			for(ObtenerSetearDatos pb : Planta){
				if(pb.getCategoria().equals(categoria)){
					System.out.println(pb.toString());
				}
			}
			}catch(Exception ex){
				buscar();
		}
		
	}
	
	
	
	
	
	
}


