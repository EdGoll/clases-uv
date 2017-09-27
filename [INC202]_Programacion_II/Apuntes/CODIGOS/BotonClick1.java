public void actionPerformed(ActionEvent ev) {
nClick ++;
contar.setText("Numero de click sobre el boton: "+nClick);}

private JButton boton;
private JLabel contar;
private int nClick;}

public class BotonClick{
	public static void main (String args[]){
		Ventana ven= new Ventana();
		ven.setVisible(true);}}