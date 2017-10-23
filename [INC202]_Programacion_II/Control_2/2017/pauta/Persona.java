//id;EDAD;NIVEL EDUCACIONAL;ACTIVIDAD;RENTA FIJA;LIMITE MAXIMO CREDITO;DEUDA ACTUAL;PORCENTAJE DE USO DEL CREDITO;NUMERO DE COMPRAS EN MES ACTUAL (T);NUMERO DE COMPRAS EN MES T-1;NUMERO DE COMPRAS EN MES T-2;NUMERO DE COMPRAS EN MES T-3;ESTADO ACTUAL;CANTIDAD HISTORICA DE ATRASOS EN PAGO DE CUENTAS;COMPRA
public class Persona {
	
	private int id;
	private int edad;
	private String nivelEduc;
	private String actividad;
	private int rentaFija;
	private int limMaxCredito;
	private int deudaActual;
	private double porcentUsoCredito;
	private int numCompraMesActual;
	private int numCompraMesActual_1;
	private int numCompraMesActual_2;
	private int numCompraMesActual_3;
	private String estadoActual;
	private int cantHistAtrasosPago;
	private String compra;
	
	
	
	public Persona(int id, int edad, String nivelEduc, String actividad, int rentaFija, int limMaxCredito,
			int deudaActual, double porcentUsoCredito, int numCompraMesActual, int numCompraMesActual_1,
			int numCompraMesActual_2, int numCompraMesActual_3, String estadoActual, int cantHistAtrasosPago,
			String compra) {
		super();
		this.id = id;
		this.edad = edad;
		this.nivelEduc = nivelEduc;
		this.actividad = actividad;
		this.rentaFija = rentaFija;
		this.limMaxCredito = limMaxCredito;
		this.deudaActual = deudaActual;
		this.porcentUsoCredito = porcentUsoCredito;
		this.numCompraMesActual = numCompraMesActual;
		this.numCompraMesActual_1 = numCompraMesActual_1;
		this.numCompraMesActual_2 = numCompraMesActual_2;
		this.numCompraMesActual_3 = numCompraMesActual_3;
		this.estadoActual = estadoActual;
		this.cantHistAtrasosPago = cantHistAtrasosPago;
		this.compra = compra;
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getEdad() {
		return edad;
	}
	public void setEdad(int edad) {
		this.edad = edad;
	}
	public String getNivelEduc() {
		return nivelEduc;
	}
	public void setNivelEduc(String nivelEduc) {
		this.nivelEduc = nivelEduc;
	}
	public String getActividad() {
		return actividad;
	}
	public void setActividad(String actividad) {
		this.actividad = actividad;
	}
	public int getRentaFija() {
		return rentaFija;
	}
	public void setRentaFija(int rentaFija) {
		this.rentaFija = rentaFija;
	}
	public int getLimMaxCredito() {
		return limMaxCredito;
	}
	public void setLimMaxCredito(int limMaxCredito) {
		this.limMaxCredito = limMaxCredito;
	}
	public int getDeudaActual() {
		return deudaActual;
	}
	public void setDeudaActual(int deudaActual) {
		this.deudaActual = deudaActual;
	}
	public double getPorcentUsoCredito() {
		return porcentUsoCredito;
	}
	public void setPorcentUsoCredito(double porcentUsoCredito) {
		this.porcentUsoCredito = porcentUsoCredito;
	}
	public int getNumCompraMesActual() {
		return numCompraMesActual;
	}
	public void setNumCompraMesActual(int numCompraMesActual) {
		this.numCompraMesActual = numCompraMesActual;
	}
	public int getNumCompraMesActual_1() {
		return numCompraMesActual_1;
	}
	public void setNumCompraMesActual_1(int numCompraMesActual_1) {
		this.numCompraMesActual_1 = numCompraMesActual_1;
	}
	public int getNumCompraMesActual_2() {
		return numCompraMesActual_2;
	}
	public void setNumCompraMesActual_2(int numCompraMesActual_2) {
		this.numCompraMesActual_2 = numCompraMesActual_2;
	}
	public int getNumCompraMesActual_3() {
		return numCompraMesActual_3;
	}
	public void setNumCompraMesActual_3(int numCompraMesActual_3) {
		this.numCompraMesActual_3 = numCompraMesActual_3;
	}
	public String getEstadoActual() {
		return estadoActual;
	}
	public void setEstadoActual(String estadoActual) {
		this.estadoActual = estadoActual;
	}
	public int getCantHistAtrasosPago() {
		return cantHistAtrasosPago;
	}
	public void setCantHistAtrasosPago(int cantHistAtrasosPago) {
		this.cantHistAtrasosPago = cantHistAtrasosPago;
	}
	public String getCompra() {
		return compra;
	}
	public void setCompra(String compra) {
		this.compra = compra;
	}
	@Override
	public String toString() {
		return  id + ";" + edad + ";" + nivelEduc + ";" + actividad
				+ ";" + rentaFija + ";" + limMaxCredito + ";" + deudaActual
				+ ";" + porcentUsoCredito + ";" + numCompraMesActual
				+ ";" + numCompraMesActual_1 + ";=" + numCompraMesActual_2
				+ ";" + numCompraMesActual_3 + ";" + estadoActual
				+ ";" + cantHistAtrasosPago + ";" + compra;
	}
	

	
}
