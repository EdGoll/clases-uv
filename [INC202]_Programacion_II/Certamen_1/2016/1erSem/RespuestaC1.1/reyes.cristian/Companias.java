public class Companias implements Comparable<Companias>{
	private String empresa,comuna,tipoDoc, fechaDoc;
	private int idemp, numTrans, numDoc, region;
	
	public String getEmpresa(){
		return empresa;
	}
	public void  setEmpresa(String empresa){
		this.empresa=empresa;
	}
	
	public String getComuna(){
		return comuna;
	}
	public void setComuna(String comuna){
		this.comuna=comuna;
	}
	
	public int getRegion(){
		return region;
	}
	public void setRegion(int region){
		this.region=region;
	}

	public String getTipoDoc(){
		return tipoDoc;
	}
	public void setTipoDoc(String tipoDoc){
		this.tipoDoc=tipoDoc;
	}
	
	public String getFechaDoc(){
		return fechaDoc;
	}
	public void setFechaDoc(String fechaDoc){
		this.fechaDoc=fechaDoc;
	}
	
	public int getNumDoc(){
		return numDoc;
	}
	public void setNumDoc(int numDoc ){
		this.numDoc=numDoc;
	}
	
	public int getIDemp(){
		return idemp;
	}
	public void  setIDemp(int idemp){
		this.idemp=idemp;
	}
	
	public int getnumTrans(){
		return numTrans;
	}
	public void  setnumTrans(int numTrans){
		this.numTrans=numTrans;
	}
	
	@Override
	public String toString() {
		return empresa+ " " + comuna + " " + region+" " + numDoc + " " + fechaDoc + " " + tipoDoc + " " + fechaDoc  + " "+ idemp + " " + numTrans;
	}
	
	@Override
	public int compareTo(Companias x){
		if(region<x.getRegion()){
			return -1;
		}
		if(region>x.getRegion()){
			return 1;
		}
		return 0;
	}	
}
