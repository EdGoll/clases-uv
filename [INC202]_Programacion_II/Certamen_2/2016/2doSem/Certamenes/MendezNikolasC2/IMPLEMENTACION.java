

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.StringTokenizer;

public class IMPLEMENTACION {
	private Scanner sc = null;
	private List<DATOS> datos = null;
	private List<TIPO> tipos = null;
	private List<REGION> r = null;
	private List<PROVINCIA> p = null;
	private List<COMUNA> c = null;
	private List<String> lineas = null;
	private StringTokenizer st = null;
	private REGION region = null;
	private PROVINCIA provincia = null;
	private COMUNA comuna = null;
	
	public IMPLEMENTACION(){
		datos = new ArrayList<DATOS>();
		tipos = new ArrayList<TIPO>();
		r = new ArrayList<REGION>();
		p = new ArrayList<PROVINCIA>();
		c = new ArrayList<COMUNA>();
		sc = new Scanner(System.in);
	}
	
	public void cargarRegion(){
		
		lineas = new ArrayList<String>();
		lineas = FUENTEDEDATOS.leerArchivo("Region.csv"); 
			for (String linea : lineas) { 
				st = new StringTokenizer(linea, ";"); 
					if (st.hasMoreElements()) { 
						region = new REGION();
						region.setIdRegion(st.nextToken());
						//System.out.println("ID: "+st.nextToken());
						region.setNombreRegion(st.nextToken());
						//System.out.println("NOMBRE: "+st.nextToken());
						region.setNumeroRomano(st.nextToken());
						//System.out.println("NUM: "+st.nextToken());
						region.setOrdenGeograficoRegion(st.nextToken());
						//System.out.println("ORDEN: "+st.nextToken());
						r.add(region);
					}
			}
		
		
	}
	
	public void cargarProvincia(){
		
		lineas = new ArrayList<String>();
		lineas = FUENTEDEDATOS.leerArchivo("Provincia.csv"); 
			for (String linea : lineas) { 
				st = new StringTokenizer(linea, ";"); 
					if (st.hasMoreElements()) { 
						provincia = new PROVINCIA();
						provincia.setIdProvincia(st.nextToken());
						provincia.setNombreProvincia(st.nextToken());
						provincia.setIdRegion(st.nextToken());
						p.add(provincia);
					}
			}
	}
	
	public void cargarComuna(){
		lineas = new ArrayList<String>();
		lineas = FUENTEDEDATOS.leerArchivo("Comuna.csv"); 
			for (String linea : lineas) { 
				st = new StringTokenizer(linea, ";"); 
					if (st.hasMoreElements()) { 
						comuna = new COMUNA();
						comuna.setIdComuna(st.nextToken());
						comuna.setNombreComuna(st.nextToken());
						comuna.setIdProvincia(st.nextToken());
						c.add(comuna);
					}
			}
		
	}
	
	public void menuRegion(){
		int orden = 0;
		int aux = 1;
		System.out.println("REGIONES:");
			do{
				for(REGION rg : r){
					orden = Integer.parseInt(rg.getOrdenGeograficoRegion());
					if(aux==orden){
						System.out.print(rg.getIdRegion()+" ");
						System.out.print(rg.getNombreRegion()+" ");
						System.out.print(rg.getNumeroRomano()+"\n");
						aux+=1;
					}
				}
			}while(aux!=16);
	}
	
	public void menuProvincia(int region){
		int orden = 0;
		System.out.println("PROVINCIAS:");
			
				for(PROVINCIA pv : p){
					orden = Integer.parseInt(pv.getIdRegion());
					if(region==orden){
						System.out.print(pv.getIdProvincia()+" ");
						System.out.print(pv.getNombreProvincia()+"\n");
					}
				}
			
	}
		
	public void menuComuna(int provincia){
		int orden = 0;
		System.out.println("COMUNAS:");
			for(COMUNA cm : c){
				orden = Integer.parseInt(cm.getIdProvincia());
				if(provincia==orden){
					System.out.print(cm.getIdComuna()+" ");
					System.out.print(cm.getNombreComuna()+"\n");
				}
			}
		
	}
	
	public void cargarDatos(){
		DATOS dt = new DATOS();
		DIRECCION dirlab = new DIRECCION();
		DIRECCION dirper = new DIRECCION();
		String aux = "";
		int aux1 = 0;
		int ids = 0;
		//sc = new Scanner(System.in);
		System.out.println("RUT:\t");
		aux=sc.nextLine();
		dt.setRut(aux);
		System.out.println("NOMBRE:\t");
		aux=sc.nextLine();
		dt.setNombre(aux);
		System.out.println("APELLIDO:\t");
		aux=sc.nextLine();
		dt.setApellido(aux);
		System.out.println("EDAD:\t");
		aux=sc.nextLine();
		dt.setEdad(aux);
		do{
			System.out.println("DIRECCION LABORAL (1)\nDIRECCION PERSONAL (2)\nSALIR (0)");
			aux1=sc.nextInt();
			
			dirlab.setCalle("");
			dirlab.setComuna("");
			dirlab.setNumero("");
			dirper.setCalle("");
			dirper.setComuna("");
			dirper.setNumero("");
			dt.setDirlab(dirlab);
			dt.setDirper(dirlab);
		
			switch(aux1){
			case 1: System.out.println("CALLE:\t");
				sc = new Scanner(System.in);
					aux=sc.nextLine();
					dirlab.setCalle(aux);
					System.out.println("NUMERO:\t");
				sc = new Scanner(System.in);
					aux=sc.nextLine();
					dirlab.setNumero(aux);
					menuRegion();
					ids=sc.nextInt();
					menuProvincia(ids);
					ids=sc.nextInt();
					menuComuna(ids);
					ids=sc.nextInt();
					for(COMUNA cm : c){
						if(Integer.parseInt(cm.getIdComuna())==ids){
							aux=cm.getNombreComuna();
						}
					}
					dirlab.setComuna(aux);
					dt.setDirlab(dirlab);
					break;
			case 2: System.out.println("CALLE:\t");
				sc = new Scanner(System.in);
					aux=sc.nextLine();
					dirper.setCalle(aux);
					System.out.println("NUMERO:\t");
				sc = new Scanner(System.in);
					aux=sc.nextLine();
					dirper.setNumero(aux);
					menuRegion();
					ids=sc.nextInt();
					menuProvincia(ids);
					ids=sc.nextInt();
					menuComuna(ids);
					ids=sc.nextInt();
					for(COMUNA cm : c){
						if(Integer.parseInt(cm.getIdComuna())==ids){
							aux=cm.getNombreComuna();
						}
					}
					dirper.setComuna(aux);
					dt.setDirper(dirper);
					break;
				
			}
		}while(aux1!=0);
		
		datos.add(dt);
	}
	
	public void cargarTipo(){
		TIPO tp = new TIPO();
		String aux = "";
		int aux1 = 0;
		sc = new Scanner(System.in);
		System.out.println("TIPO DE PERSONA:\nACADEMICO (1)\nALUMNO (2)\nFUNCIONARIO(3)\n");
		aux1=sc.nextInt();
		
		switch(aux1){
			case 1: System.out.println("HORARIO DE ATENCION:\n");
				sc = new Scanner(System.in);
				aux = sc.nextLine();
				tp.setAcademico(aux);
					break;
			case 2: System.out.println("ASIGNATURAS (separadas por coma ,) :\n");
				sc = new Scanner(System.in);
					aux = sc.nextLine();
					tp.setAlumno(aux);
					break;
			case 3: System.out.println("HORARIO LABORAL: ");
				sc = new Scanner(System.in);
					aux = sc.nextLine();
					tp.setFuncionario(aux);
					break;				
		}
		tipos.add(tp);
	}
	
	public void guardarPersona(){
		
		lineas = new ArrayList<String>();
		
		lineas.add(datos.toString());
		lineas.add(tipos.toString());
		
		FUENTEDEDATOS.escribirArchivo("registroPersona.txt", lineas);
	}
	
}
