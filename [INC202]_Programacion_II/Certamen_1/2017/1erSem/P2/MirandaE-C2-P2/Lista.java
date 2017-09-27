import java.util.ArrayList;
import java.util.Random;

public class Lista{
	private ArrayList<Alumno> lista=new ArrayList<>();
	private int[] identificador;
	private int[] indice;
	private ArrayList<Alumno> grupoA=new ArrayList<>();
	private ArrayList<Alumno> grupoB=new ArrayList<>();
	private int longitud;

	public Lista(){
		Random r=new Random();
		longitud=(r.nextInt(75-40)+41);
		identificador=new int[longitud];
		indice=new int[longitud];
		generarIdentificador();
		generarIndice();
	}
	public void llenarLista(){
			for(int x=0;x<longitud;x++){
				Alumno a=new Alumno();
				a.setId(identificador[x]);			
				lista.add(x, a);
		}
	}
	private void generarIdentificador(){//Sin repetición.
		Random r=new Random();
		int x=0;
		identificador[x]=(r.nextInt(100)+1);
		for(x=1;x<longitud;x++){
			identificador[x]=(r.nextInt(100)+1);
			for(int y=0;y<x;y++){
				if(identificador[x]==identificador[y]){
					x--;
				}
			}
		}
	}
	private void generarIndice(){//Sin repetición.
		Random r=new Random();
		int x=0;
		indice[x]=(r.nextInt(longitud));
		for(x=1;x<longitud;x++){
			indice[x]=(r.nextInt(longitud));
			for(int y=0;y<x;y++){
				if(indice[x]==indice[y]){
					x--;
				}
			}
		}
	}
	public void mostrarGrupos(){
		System.out.println("Grupo A");
		int y=1;
		for(int x=0;x<grupoA.size();x++){
			System.out.println("Alumno número "+y+" del grupo A, identificado como: "+grupoA.get(x).getId());
			y++;
		}
		System.out.println("Grupo B");
		y=1;
		for(int x=0;x<grupoB.size();x++){
			System.out.println("Alumno número "+y+" del grupo B, identificado como: "+grupoB.get(x).getId());
			y++;
		}	
	}
	public void separarLista(){
		int x, y;
		if(longitud%2==0){
			int separar=longitud/2;
			for(x=0;x<separar;x++){
				grupoA.add(x, lista.get(indice[x]));
			}
			y=0;
			for(x=separar;x<longitud;x++){
				grupoB.add(y, lista.get(indice[x]));
				y++;
			}
		}
		else{
			int separar=(longitud-1)/2;			
				for(x=0;x<separar;x++){
					grupoA.add(x, lista.get(indice[x]));
				}
				y=0;
				for(x=separar;x<longitud;x++){
					grupoB.add(y, lista.get(indice[x]));
					y++;
				}	
		}
	}
}
	
