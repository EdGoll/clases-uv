import javax.swing.*; // JFrame
import java.awt.event.*; //MouseEvent, MouseListener y ActionEvent
import java.awt.*; //FlowLayout y Container
class Ve2Boton2Click2 extends JFrame implements ActionListener {
	public Ve2Boton2Click2 (){
		setTitle("Dos botones");
		setBounds(150,360,300,200);
		setBackground(Color.red);
		miBoton1 = new JButton("Boton 1");
		miBoton2 = new JButton("Boton 2");
		miBoton1.setActionCommand("primero");
		getContentPane().setLayout(new FlowLayout());
		getContentPane().add(miBoton1);
		getContentPane().add(miBoton2);
		miBoton1.addActionListener(this);
		miBoton2.addActionListener(this);
		setDefaultCloseOperation(EXIT_ON_CLOSE);}
	public void actionPerformed(ActionEvent ev){
		String nombre = ev.getActionCommand();
		System.out.println("Accion sobre el " + nombre);}
	private JButton miBoton1, miBoton2;}
public class Main2Boton2Click2{
	public static void main (String arg[]){
		Ve2Boton2Click2 venBC=new Ve2Boton2Click2 ();
		venBC.setVisible(true);}}
