package vista;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JComboBox;
import javax.swing.JTextField;

import modelo.Persona;

//id;EDAD;NIVEL EDUCACIONAL;ACTIVIDAD;RENTA FIJA;LIMITE MAXIMO CREDITO;DEUDA ACTUAL;PORCENTAJE DE USO DEL CREDITO;NUMERO DE COMPRAS EN MES ACTUAL (T);NUMERO DE COMPRAS EN MES T-1;NUMERO DE COMPRAS EN MES T-2;NUMERO DE COMPRAS EN MES T-3;ESTADO ACTUAL;CANTIDAD HISTORICA DE ATRASOS EN PAGO DE CUENTAS;COMPRA
public class PersonaForm {
	
	private JTextField idTf = new JTextField();
	private JTextField edadTf= new JTextField();
	private JTextField nivelEducTf= new JTextField();
	private JTextField actividadTf= new JTextField();
	private JTextField rentaFijaTf= new JTextField();
	private JTextField limMaxCreditoTf= new JTextField();
	private JTextField deudaActualTf= new JTextField();
	private JTextField porcentUsoCreditoTf= new JTextField();
	private JTextField numCompraMesActualTf= new JTextField();
	private JTextField numCompraMesActual_1Tf= new JTextField();
	private JTextField numCompraMesActual_2Tf= new JTextField();
	private JTextField numCompraMesActual_3Tf= new JTextField();
	private JTextField estadoActualTf= new JTextField();
	private JTextField cantHistAtrasosPagoTf= new JTextField();
	private JTextField compraTf= new JTextField();
	
	private JComboBox comboBoxNivelEduc = new JComboBox(new DefaultComboBoxModel(new String[] { "Seleccionar...","EDUC. TECNICA", "EDUC. UNIVERSITARIA", "ESTUDIANTE UNIVERSITARIO","EDUC. MEDIA" }));
	private JComboBox comboBoxActividad = new JComboBox(new DefaultComboBoxModel(new String[] {  "Seleccionar...","DEPENDIENTE", "INDEPENDIENTE","UNIVERSITARIO","EMPRESARIO" }));
	private JComboBox comboBoxEstActual = new JComboBox(new DefaultComboBoxModel(new String[] {  "Seleccionar...","SIN DEUDA", "DEUDA DE 1 MES", "DEUDA DE 2 MESES" }));
	private JComboBox comboBoxCompra = new JComboBox(new DefaultComboBoxModel(new String[] {  "Seleccionar...","SI", "NO"}));
	private JComboBox comboBoxPorcetUsoCred = null;
	
	public PersonaForm(){
		String[] porcent = new String[101];
		for (int i = 0; i <= 100; i++) {
			porcent[i]=String.valueOf(i);
		}
		comboBoxPorcetUsoCred= new JComboBox(new DefaultComboBoxModel(porcent));
	}

	public void limpiarForm() {
		this.getEdadTf().setText("");
		this.getComboBoxNivelEduc().setSelectedItem("Seleccionar...");
		this.getComboBoxActividad().setSelectedItem("Seleccionar...");
		this.getComboBoxCompra().setSelectedItem("Seleccionar...");
		this.getComboBoxEstActual().setSelectedItem("Seleccionar...");
		this.getComboBoxPorcetUsoCred().setSelectedItem("0");
		this.getRentaFijaTf().setText("");
		this.getLimMaxCreditoTf().setText("");
		this.getDeudaActualTf().setText("");
		this.getNumCompraMesActualTf().setText("");
		this.getNumCompraMesActual_1Tf().setText("");
		this.getNumCompraMesActual_2Tf().setText("");
		this.getNumCompraMesActual_3Tf().setText("");
		this.getCantHistAtrasosPagoTf().setText("");
	}
	
	public void setPersonaForm(Persona per) {
		this.getEdadTf().setText(String.valueOf(per.getEdad()));
		this.getComboBoxNivelEduc().setSelectedItem(per.getNivelEduc());
		this.getComboBoxActividad().setSelectedItem(per.getActividad());
		this.getComboBoxCompra().setSelectedItem(per.getCompra());
		this.getComboBoxEstActual().setSelectedItem(per.getEstadoActual());
		this.getComboBoxPorcetUsoCred().setSelectedItem(String.valueOf(Double.valueOf(per.getPorcentUsoCredito()).intValue()));
		this.getRentaFijaTf().setText(String.valueOf(per.getRentaFija()));
		this.getLimMaxCreditoTf().setText(String.valueOf(per.getLimMaxCredito()));
		this.getDeudaActualTf().setText(String.valueOf(per.getDeudaActual()));
		this.getNumCompraMesActualTf().setText(String.valueOf(per.getNumCompraMesActual()));
		this.getNumCompraMesActual_1Tf().setText(String.valueOf(per.getNumCompraMesActual_1()));
		this.getNumCompraMesActual_2Tf().setText(String.valueOf(per.getNumCompraMesActual_2()));
		this.getNumCompraMesActual_3Tf().setText(String.valueOf(per.getNumCompraMesActual_3()));
		this.getCantHistAtrasosPagoTf().setText(String.valueOf(per.getCantHistAtrasosPago()));
	}
	
	public Persona getPersonaForm() {
		Persona per = new Persona();
		per.setEdad(Integer.parseInt(this.getEdadTf().getText()));			
		per.setNivelEduc(this.getComboBoxNivelEduc().getSelectedItem().toString());
		per.setActividad(this.getComboBoxActividad().getSelectedItem().toString());
		per.setRentaFija(Integer.parseInt(this.getRentaFijaTf().getText()));
		per.setLimMaxCredito(Integer.parseInt(this.getLimMaxCreditoTf().getText()));
		per.setDeudaActual(Integer.parseInt(this.getLimMaxCreditoTf().getText()));
		per.setPorcentUsoCredito(Double.parseDouble(this.getComboBoxPorcetUsoCred().getSelectedItem().toString()));
		per.setNumCompraMesActual(Integer.parseInt(this.getNumCompraMesActualTf().getText()));
		per.setNumCompraMesActual_1(Integer.parseInt(this.getNumCompraMesActual_1Tf().getText()));
		per.setNumCompraMesActual_2(Integer.parseInt(this.getNumCompraMesActual_2Tf().getText()));
		per.setNumCompraMesActual_3(Integer.parseInt(this.getNumCompraMesActual_3Tf().getText()));			
		per.setEstadoActual(this.getComboBoxEstActual().getSelectedItem().toString());
		per.setCantHistAtrasosPago(Integer.parseInt(this.getCantHistAtrasosPagoTf().getText()));
		per.setCompra(this.getComboBoxCompra().getSelectedItem().toString());	
		return per;
	}
	
	public JTextField getIdTf() {
		return idTf;
	}
	public void setIdTf(JTextField idTf) {
		this.idTf = idTf;
	}
	public JTextField getEdadTf() {
		return edadTf;
	}
	public void setEdadTf(JTextField edadTf) {
		this.edadTf = edadTf;
	}
	public JTextField getNivelEducTf() {
		return nivelEducTf;
	}
	public void setNivelEducTf(JTextField nivelEducTf) {
		this.nivelEducTf = nivelEducTf;
	}
	public JTextField getActividadTf() {
		return actividadTf;
	}
	public void setActividadTf(JTextField actividadTf) {
		this.actividadTf = actividadTf;
	}
	public JTextField getRentaFijaTf() {
		return rentaFijaTf;
	}
	public void setRentaFijaTf(JTextField rentaFijaTf) {
		this.rentaFijaTf = rentaFijaTf;
	}
	public JTextField getLimMaxCreditoTf() {
		return limMaxCreditoTf;
	}
	public void setLimMaxCreditoTf(JTextField limMaxCreditoTf) {
		this.limMaxCreditoTf = limMaxCreditoTf;
	}
	public JTextField getDeudaActualTf() {
		return deudaActualTf;
	}
	public void setDeudaActualTf(JTextField deudaActualTf) {
		this.deudaActualTf = deudaActualTf;
	}
	public JTextField getPorcentUsoCreditoTf() {
		return porcentUsoCreditoTf;
	}
	public void setPorcentUsoCreditoTf(JTextField porcentUsoCreditoTf) {
		this.porcentUsoCreditoTf = porcentUsoCreditoTf;
	}
	public JTextField getNumCompraMesActualTf() {
		return numCompraMesActualTf;
	}
	public void setNumCompraMesActualTf(JTextField numCompraMesActualTf) {
		this.numCompraMesActualTf = numCompraMesActualTf;
	}
	public JTextField getNumCompraMesActual_1Tf() {
		return numCompraMesActual_1Tf;
	}
	public void setNumCompraMesActual_1Tf(JTextField numCompraMesActual_1Tf) {
		this.numCompraMesActual_1Tf = numCompraMesActual_1Tf;
	}
	public JTextField getNumCompraMesActual_2Tf() {
		return numCompraMesActual_2Tf;
	}
	public void setNumCompraMesActual_2Tf(JTextField numCompraMesActual_2Tf) {
		this.numCompraMesActual_2Tf = numCompraMesActual_2Tf;
	}
	public JTextField getNumCompraMesActual_3Tf() {
		return numCompraMesActual_3Tf;
	}
	public void setNumCompraMesActual_3Tf(JTextField numCompraMesActual_3Tf) {
		this.numCompraMesActual_3Tf = numCompraMesActual_3Tf;
	}
	public JTextField getEstadoActualTf() {
		return estadoActualTf;
	}
	public void setEstadoActualTf(JTextField estadoActualTf) {
		this.estadoActualTf = estadoActualTf;
	}
	public JTextField getCantHistAtrasosPagoTf() {
		return cantHistAtrasosPagoTf;
	}
	public void setCantHistAtrasosPagoTf(JTextField cantHistAtrasosPagoTf) {
		this.cantHistAtrasosPagoTf = cantHistAtrasosPagoTf;
	}
	public JTextField getCompraTf() {
		return compraTf;
	}
	public void setCompraTf(JTextField compraTf) {
		this.compraTf = compraTf;
	}
	
	
	public JComboBox getComboBoxNivelEduc() {
		return comboBoxNivelEduc;
	}
	public void setComboBoxNivelEduc(JComboBox comboBoxNivelEduc) {
		this.comboBoxNivelEduc = comboBoxNivelEduc;
	}
	public JComboBox getComboBoxActividad() {
		return comboBoxActividad;
	}
	public void setComboBoxActividad(JComboBox comboBoxActividad) {
		this.comboBoxActividad = comboBoxActividad;
	}
	public JComboBox getComboBoxEstActual() {
		return comboBoxEstActual;
	}
	public void setComboBoxEstActual(JComboBox comboBoxEstActual) {
		this.comboBoxEstActual = comboBoxEstActual;
	}
	public JComboBox getComboBoxCompra() {
		return comboBoxCompra;
	}
	public void setComboBoxCompra(JComboBox comboBoxCompra) {
		this.comboBoxCompra = comboBoxCompra;
	}
	public JComboBox getComboBoxPorcetUsoCred() {
		return comboBoxPorcetUsoCred;
	}
	public void setComboBoxPorcetUsoCred(JComboBox comboBoxPorcetUsoCred) {
		this.comboBoxPorcetUsoCred = comboBoxPorcetUsoCred;
	}
	
	
}
