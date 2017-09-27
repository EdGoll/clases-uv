



public class ObtenerSetearDatos implements Comparable<ObtenerSetearDatos> {
		private int nui,region,trimestre,ocupados,mes;
		private String anio,categoria,funcion,genero,claseIndustria;
		public void setAnio(String anio){
			this.anio=anio;
		}
		public String getAnio(){
			return anio;
		}
		public void setNui(int nui ){
			this.nui=nui;
		}
		public int  getNui(){
			return nui;
		}
		public void setRegion(int region){
			this. region=region;
		}
		public int  getRegion(){
			return region;
		}
		public void setTrimestre(int trimestre ){
			this. trimestre=trimestre;
		}
		public int  getTrimestre(){
			return trimestre;
		}
		public void setOcupados(int ocupados ){
			this.ocupados=ocupados;
		}
		public  int getOcupados(){
			return ocupados;
		}
		
		public void setMes(int mes ){
			this.mes= mes;
		}
		public int  getMes(){
			return mes;
		}
		public void setCategoria(String categoria){
			this.categoria= categoria;
		}
		public String  getCategoria(){
			return categoria;
		}
		public void setFuncion(String funcion){
			this.funcion=funcion ;
		}
		public String getFuncion(){
			return funcion;
		}
		public void setGenero(String genero){
			this.genero=genero ;
		}
		public String getGenero(){
			return genero;
		}
		public void setClaseIndustria(String claseIndustria){
			this.claseIndustria=claseIndustria ;
		}
		public String getClaseIndustria(){
			return claseIndustria;
		}
		
		
		@Override 
		public String toString(){
			return "Anio: "+anio+"  NUI: "+nui+"   region: "+region+"   trimestre: "+trimestre+"  mes: "+mes+"   categoria: "+categoria+"   funcion: "+funcion+"   Genero: "+genero+"   ocupados: "+ocupados+"   clase de industria: "+claseIndustria;
		}
	
		@Override
		public int compareTo(ObtenerSetearDatos a){
			if(mes<a.getMes()){
				return -1;
				
			}
			if(mes>a.getMes()){
				return 1;
			}
			return 0;
		}
		
}
