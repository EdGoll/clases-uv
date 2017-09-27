public void insertUpdate(DocumentEvent Document){
String texto = entrada.getText();
copia.setText(texto);
}
public void removeUpdate(DocumentEvent Document){
String texto = entrada.getText();
copia.setText(texto);
}
public void changedUpdate(DocumentEvent Document){}
private JTextField entrada, copia;}

public class MainPanel2Texto{
	public static void main (String args[]){
		MiVentanas ven= new MiVentanas();
		ven.setVisible(true);}}