import javax.swing.*; // JFrame JPanel
import java.awt.*; //FlowLayout y Container
class MiVentana extends JFrame {
	public MiVentana (){//constructor
		setTitle("Ventana = panel rojo");
		setSize(300,150);
		panel = new JPanel();
		panel.setBackground(Color.red);
		getContentPane().add(panel);}
 private JPanel panel;}
public class MainPanel0{
	public static void main (String args[]){
		MiVentana ven= new MiVentana();
		ven.setVisible(true);
	}}