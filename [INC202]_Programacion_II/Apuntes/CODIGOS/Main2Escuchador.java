import javax.swing.*; // JFrame
import java.awt.event.*; //MouseEvent, MouseListener y ActionEvent
import java.awt.*; //FlowLayout y Container
class VentBotons extends JFrame {
	public VentBotons (){
		setTitle("Dos botones");
		setBounds(150,360,300,200);
		setBackground(Color.red);
		miBoton1 = new JButton("Boton 1");
		miBoton2 = new JButton("Boton 2");
		getContentPane().setLayout(new FlowLayout());
		getContentPane().add(miBoton1);
		getContentPane().add(miBoton2);
		EscuchadorBoton1 escu1= new EscuchadorBoton1();
		EscuchadorBoton2 escu2= new EscuchadorBoton2();
		miBoton1.addActionListener(escu1);
		miBoton2.addActionListener(escu2);
		setDefaultCloseOperation(EXIT_ON_CLOSE);}
		private JButton miBoton1, miBoton2;}
