import javax.swing.*; // JFrame
import java.awt.event.*; //MouseEvent y MouseListener
import java.awt.*; //FlowLayout y Container
class Ve2BotonClick extends JFrame implements ActionListener {
	public Ve2BotonClick (){
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
	
	public void actionPerformed(ActionEvent ev){
		System.out.println("Accion sobre uno de los botones");}
		
	private JButton miBoton1, miBoton2;}
public class Main2BotonClick{
public static void main (String arg[]){
Ve2BotonClick venBC=new Ve2BotonClick ();
venBC.setVisible(true);}}
