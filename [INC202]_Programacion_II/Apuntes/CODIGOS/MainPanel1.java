import javax.swing.*; // JFrame JPanel
import java.awt.*; //FlowLayout y Container
class MiVentana extends JFrame {
	public MiVentana (){//constructor
		setTitle("Dibujando una linea");
		setSize(300,150);
		panel = new Panel();
		panel.setBackground(Color.red);
		getContentPane().add(panel);}
 private JPanel panel;}
class Panel extends JPanel{
	public void paintComponent(Graphics g){
		super.paintComponent(g);
		g.drawLine(15,10,200,300);}}
public class MainPanel1{
	public static void main (String args[]){
		MiVentana ven= new MiVentana();
		ven.setVisible(true);}}