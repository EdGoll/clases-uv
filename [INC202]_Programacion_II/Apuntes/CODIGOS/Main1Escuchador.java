import javax.swing.*; // JFrame
import java.awt.event.*; //MouseEvent, MouseListener y ActionEvent
import java.awt.*; //FlowLayout y Container
class VentBotons1 extends JFrame {
	public VentBotons1 (){
		setTitle("Dos botones");
		setBounds(150,360,300,200);
		setBackground(Color.red);
		miBoton1 = new JButton("Boton 1");
		miBoton2 = new JButton("Boton 2");
		getContentPane().setLayout(new FlowLayout());
		getContentPane().add(miBoton1);
		getContentPane().add(miBoton2);
		EscuchadorBoton escu1= new EscuchadorBoton();
		EscuchadorBoton escu2= new EscuchadorBoton();
		miBoton1.addActionListener(escu1);
		miBoton2.addActionListener(escu2);
		setDefaultCloseOperation(EXIT_ON_CLOSE);}
		private JButton miBoton1, miBoton2;}
class EscuchadorBoton implements ActionListener {
	public void actionPerformed(ActionEvent ev){
		String nombre=ev.getActionCommand();
		System.out.println("Accion sobre el " + nombre);}}
public class Main1Escuchador{
	public static void main (String arg[]){
		VentBotons1 venB=new VentBotons1 ();
		venB.setVisible(true);}}
