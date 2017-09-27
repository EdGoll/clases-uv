
import java.util.ArrayList;
import java.util.Random;


public class Encuentro {
	
	public ArrayList<Equipo> seleccionados = new ArrayList<Equipo>();
	
	public Random rd;
	public int tamano = 16;
	private int[] jugo = new int[tamano];
	Equipo e;
	public void mostrar(){
		for (int i = 0; i < 15; i++) {
			System.out.println((seleccionados.get(i)).getId());
		}
	}
	
	
	public void llenado(){//lleno la lista de los equipos seleccionados y valido q los equipos sean diferentes (id)
		
		boolean estado;
		e = new Equipo();
		for (int i = 0; i < tamano; i++) {
			
						
			//System.out.println("estoy en el ciclo for 1");
		
		estado=false;
		do{
				for(Equipo equi : seleccionados){
					if(equi.getId()==e.getId()){
						estado=true;
						e = new Equipo();
						
						//System.out.println("estoy en el ciclo for 2");
					}else estado=false;
					
					
					
				}
				
				//System.out.println("estoy en el while");
			}while(estado);
			seleccionados.add(e);
			
		}
		
	}
	public int partido(){
		int i=0,j=0;
		rd = new Random();
		i = rd.nextInt(seleccionados.size());
		jugo[i]=i;
		j = rd.nextInt(seleccionados.size());
		jugo[j]=j;
		
	  if(jugo[i]!=jugo[j] && !jugo.equals(i) && !jugo.equals(j)){
			
		
		
		if((seleccionados.get(i)).getNivel_e() > (seleccionados.get(j)).getNivel_e()){
			System.out.println((seleccionados.get(i)).toString()+" v/s "+(seleccionados.get(j)).toString()+", Resultado: Ganador Equipo "+(seleccionados.get(i)).getId());
			return i;
		}else if((seleccionados.get(i)).getNivel_e() < (seleccionados.get(j)).getNivel_e()) {
			System.out.println((seleccionados.get(i)).toString()+" v/s "+(seleccionados.get(j)).toString()+", Resultado: Ganador Equipo "+(seleccionados.get(j)).getId());
			return j;
		}else if((seleccionados.get(i)).getNivel_e() == (seleccionados.get(j)).getNivel_e()){
			if(rd.nextBoolean()){
				System.out.println((seleccionados.get(i)).toString()+" v/s "+(seleccionados.get(j)).toString()+", Resultado: Empate Ganador por sorteo Equipo "+(seleccionados.get(i)).getId());
			return i;	
			}else{
				System.out.println((seleccionados.get(i)).toString()+" v/s "+(seleccionados.get(j)).toString()+", Resultado: Empate Ganador por sorteo Equipo "+(seleccionados.get(j)).getId());
			return j;
			}
		}
		
	  }else partido();
		return 0;//nunca llegara a este caso
	}
}
