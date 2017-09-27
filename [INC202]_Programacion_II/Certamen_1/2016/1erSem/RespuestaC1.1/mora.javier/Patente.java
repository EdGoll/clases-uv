public class Patente implements Comparable<Patente>{
	private String rutPropietario, rolPat, aClara, patTipo, provisoria, ingProvisorio, vencimiento, estadoLic, estadoPago;
	private int montoPat;
	
	public String getRutPropietario() {
		return rutPropietario;
	}
	public void setRutPropietario(String rutPropietario) {
		this.rutPropietario = rutPropietario;
	}
	public void setRolPat(String rolPat, String dv){
		this.rolPat = rolPat + "-" + dv;
	}
	public String getRolPat(){
		return rolPat;
	}
	public void setAclara(String aClara){
		this.aClara = aClara;
	}
	public String getAclara(){
		return aClara;
	}
	public void setPatTipo(String patTipo){
		this.patTipo = patTipo;
	}
	public String getPatTipo(){
		return patTipo;
	}
	public void setProvisoria(String provisoria){
		this.provisoria = provisoria;
	}
	public String getProvisoria(){
		return provisoria;
	}
	public String getaClara() {
		return aClara;
	}
	public void setaClara(String aClara) {
		this.aClara = aClara;
	}
	public String getIngProvisorio() {
		return ingProvisorio;
	}
	public void setIngProvisorio(String ingProvisorio) {
		this.ingProvisorio = ingProvisorio;
	}
	public String getVencimiento() {
		return vencimiento;
	}
	public void setVencimiento(String vencimiento) {
		this.vencimiento = vencimiento;
	}
	public String getEstadoLic() {
		return estadoLic;
	}
	public void setEstadoLic(String estadoLic) {
		this.estadoLic = estadoLic;
	}
	public String getEstadoPago() {
		return estadoPago;
	}
	public void setEstadoPago(String estadoPago) {
		this.estadoPago = estadoPago;
	}
	public int getMontoPat() {
		return montoPat;
	}
	public void setMontoPat(int montoPat) {
		this.montoPat = montoPat;
	}
	@Override
	public String toString() {
		return "Rol Patente: " + rolPat + ", a Clara: " + aClara + ", tipo patente: " + patTipo + ", provisoria: "
				+ provisoria + ", Provisorio: " + ingProvisorio + ", vencimiento: " + vencimiento + ", estado licencia: "
				+ estadoLic + ", estado Pago: " + estadoPago + ", monto Patente: " + montoPat;
	}
	
	@Override
    public int compareTo(Patente o) {
		if (montoPat < o.montoPat) {
			return 1;
        }else if (montoPat > o.montoPat) {
            return -1;
        }
        return 0;
	}


}
