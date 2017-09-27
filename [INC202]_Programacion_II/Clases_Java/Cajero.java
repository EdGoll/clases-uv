public class Cajero {
	private int[] billetes = {20000, 10000, 5000, 2000, 1000};
	private int[] cantidadBilletes;
	public int monto, montoAux;
	
	public Cajero() {
		 cantidadBilletes = new int[billetes.length];	
	}
	
	public String entregarBilletes(){
		String resultado = "";
		montoAux = monto;
		if (montoAux > 1000) {
			for(int i = 0; i < billetes.length ; i++){
				doCantidades(i);
			}
			for(int i = 0; i < cantidadBilletes.length ; i++){
				if (cantidadBilletes[i] > 0) {
					resultado += "Se entregan " + cantidadBilletes[i] + " de " + billetes[i] + "\n";
				}
			}
		} else {
			resultado = "No es un valor valido";
		}
		return resultado;
	}
	
	private void doCantidades(int i) {
		cantidadBilletes[i] = montoAux / billetes[i];
		montoAux %=  billetes[i];
	}
	
	public static void main(String[] args) {
		Cajero cajero = new Cajero();
		cajero.monto = 1155000;
		System.out.println(cajero.entregarBilletes());
	}
}