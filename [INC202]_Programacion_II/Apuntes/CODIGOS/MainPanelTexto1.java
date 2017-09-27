public void actionPerformed(ActionEvent ev){
if (ev.getSource()==boton){
String texto = entrada.getText();
copia.setText(texto);
}}
private JTextField entrada, copia;
private JButton boton;}

public class MainPanelTexto{
	public static void main (String args[]){
		MiVentana ven= new MiVentana();
		ven.setVisible(true);}}