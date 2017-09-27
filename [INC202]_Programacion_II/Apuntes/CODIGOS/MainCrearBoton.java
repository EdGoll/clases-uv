import javax.swing.*; // JFrame
import java.awt.event.*; //MouseEvent, MouseListener y ActionEvent
import java.awt.*; //FlowLayout y Container
class VentBotonDin extends JFrame {
	public VentBotonDin (){
		setTitle("Botones Dinamicos");
		setBounds(150,360,300,200);
		setBackground(Color.red);
		Container contenido = getContentPane();
		contenido.setLayout(new FlowLayout());
		miBoton = new JButton("Crear Botones");
		contenido.add(miBoton);
		EscuchadorBoton escu= new EscuchadorBoton(contenido);
		miBoton.addActionListener(escu);
		setDefaultCloseOperation(EXIT_ON_CLOSE);}
		private JButton miBoton;}
class EscuchadorBoton implements ActionListener {
	public EscuchadorBoton (Container contenido){
		this.contenido=contenido;}
	public void actionPerformed(ActionEvent ev){
		JButton nuevoBoton = new JButton("Boton");
		contenido.add(nuevoBoton);
		contenido.validate(); //para recalcular
	} private Container contenido;}
public class MainCrearBoton{
	public static void main (String arg[]){
		VentBotonDin venBD=new VentBotonDin ();
		venBD.setVisible(true);}}
