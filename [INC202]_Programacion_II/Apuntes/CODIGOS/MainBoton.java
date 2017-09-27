import javax.swing.*; // JFrame
import java.awt.event.*; //MouseEvent y MouseListener
import java.awt.*; //FlowLayout y Container
class VeBoton extends JFrame {
	public VeBoton (){
		setTitle("Mi primer boton");
		setBounds(150,360,300,200);
		//setSize(300,200);
		setBackground(Color.red);
		miBoton = new JButton("prueba");
		getContentPane().setLayout(new FlowLayout());
		getContentPane().add(miBoton);
		setDefaultCloseOperation(EXIT_ON_CLOSE);	
}
	private JButton miBoton;}
public class MainBoton{
public static void main (String arg[]){
VeBoton venB=new VeBoton();
venB.setVisible(true);}}
