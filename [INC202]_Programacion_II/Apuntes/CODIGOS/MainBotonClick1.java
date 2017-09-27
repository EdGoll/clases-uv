import javax.swing.*; // JFrame
import java.awt.event.*; //MouseEvent y MouseListener
import java.awt.*; //FlowLayout y Container
class VeBotonClick1 extends JFrame implements ActionListener {
	public VeBotonClick1 (){
		setTitle("Mi primer boton");
		setBounds(150,360,300,200);
		//setSize(300,200);
		setBackground(Color.red);
		miBoton = new JButton("prueba");
		getContentPane().setLayout(new FlowLayout());
		getContentPane().add(miBoton);
		miBoton.addActionListener(this);
		setDefaultCloseOperation(EXIT_ON_CLOSE);	
}
	public void actionPerformed(ActionEvent ev){
		System.out.println("Accion sobre el boton Prueba");}
		
	private JButton miBoton;}
public class MainBotonClick1{
public static void main (String arg[]){
VeBotonClick1 venBC=new VeBotonClick1 ();
venBC.setVisible(true);}}
