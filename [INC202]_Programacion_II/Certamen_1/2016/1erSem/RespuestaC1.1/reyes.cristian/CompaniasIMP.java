import java.util.*;

public class CompaniasIMP {
	
	List<String> lineas;
	List<Companias> companie;
	 public CompaniasIMP(){
		cargarDatos();
	}
	public void cargarDatos(){
		FuenteDeDatos fd = new FuenteDeDatos();
		companie = new ArrayList<Companias>();
		lineas = new ArrayList<String>();
		lineas = fd.leerArchivo("dataSetCompanias.csv");
		lineas.remove(0);
		StringTokenizer tk ;
		for (String Linea: lineas ){
			tk = new StringTokenizer(Linea, ";");
			if(tk.hasMoreElements()){
				Companias com = new Companias();
				com.setEmpresa(tk.nextToken());
				com.setComuna(tk.nextToken());
				com.setRegion(Integer.parseInt(tk.nextToken()));
				com.setTipoDoc(tk.nextToken());
				com.setNumDoc(Integer.parseInt(tk.nextToken()));
				com.setFechaDoc(tk.nextToken());
				com.setIDemp(Integer.parseInt(tk.nextToken()));
				com.setnumTrans(Integer.parseInt(tk.nextToken()));
				companie.add(com);
			}
		}
	}
	//busca en la lista por el Id de la empresa
	public void buscar(){
		Scanner scn= new Scanner(System.in);
		int idemp;
		try{
				System.out.println("Ingrese un ID:");
				
				idemp= scn.nextInt();
				
					for(Companias com :companie){
						if (com.getIDemp()== idemp){
							System.out.println(com.toString());
						}
					}	
					
		}catch(Exception e){
			System.out.println(e);
		}		
	}
	//muesta la lista completa
	public void mostrarTodo(){
		try{
			for(Companias com :companie){
					System.out.println(com.toString());
			}	
		}catch(Exception e){
			System.out.println(e);
		}
	}
	
	//ordena la lista por region de menor a mayor.
	public void ordenRegion(){
		Collections.sort(companie);
		for(Companias cp:companie){
			System.out.println(cp.toString());
		}
	}
	//metodo que busca las emprecesas de CLARO CHILE S.A. en la region 13.
	public void busCom(int region){
		for(Companias com: companie){
			if(com.getEmpresa().equals ("CLARO CHILE S.A.") && com.getRegion()==region){
				System.out.println(com.toString());
			}
		}
	}
	//metodo que muestra el numero de transaccion en el cual el año es mayor a 2000
	
	public void anio(){
		int fch ;
		for(Companias cm : companie){
			fch=Integer.parseInt(cm.getFechaDoc().substring(6,cm.getFechaDoc().length()));
			if(fch>=2000){
				System.out.println(cm.getnumTrans());
			}
		}
		
	}
	
	
	
}
