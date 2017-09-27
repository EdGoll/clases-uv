import javax.swing.*; // JFrame
import java.awt.event.*; //MouseEvent, MouseListener y ActionEvent
import java.awt.*; //FlowLayout y Container

class Ve2Boton2Click extends JFrame implements ActionListener {
	public Ve2Boton2Click (){
		setTitle("Dos botones");
		setBounds(150,360,300,200);
		//setSize(300,200);
		setBackground(Color.red);
		miBoton1 = new JButton("boton 1");
		miBoton2 = new JButton("boton 2");
		getContentPane().setLayout(new FlowLayout());
		getContentPane().add(miBoton1);
		getContentPane().add(miBoton2);
		miBoton1.addActionListener(this);
		miBoton2.addActionListener(this);
		setDefaultCloseOperation(EXIT_ON_CLOSE);}
