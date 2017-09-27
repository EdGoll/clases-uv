import javax.swing.*; // JFrame
import java.awt.event.*; //MouseEvent y MouseListener

class VeBot extends JFrame {
	public VeBot (){
		setTitle("Mi primer boton");
		setSize(30,20);
		miBoton = new JButton("prueba");
		getContentPane().add(miBoton);
		setDefaultCloseOperation(EXIT_ON_CLOSE);	
}
	private JButton miBoton;
}
public class VentBoton{
public static void main (String arg[]){
VeBot venB=new VeBot();
venB.setVisible(true);
}}
