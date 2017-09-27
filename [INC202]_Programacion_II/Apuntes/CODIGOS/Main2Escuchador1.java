class EscuchadorBoton1 implements ActionListener {
	public void actionPerformed(ActionEvent ev){
		System.out.println("Accion sobre el boton 1");}}

class EscuchadorBoton2 implements ActionListener {
	public void actionPerformed(ActionEvent ev){
		System.out.println("Accion sobre el boton 2");}}

public class Main2Escuchador{
	public static void main (String arg[]){
		VentBotons venB=new VentBotons ();
		venB.setVisible(true);}}
