import javax.swing.*; // JFrame
import java.awt.event.*; //MouseEvent, MouseListener y ActionEvent
import java.awt.*; //FlowLayout y Container
import java.util.Scanner;
class VentBotonDin1 extends JFrame implements ActionListener{
	public VentBotonDin1 (int nbotones){
		setTitle("Activar/Desactivar Botones");
		setBounds(150,360,300,200);
		setBackground(Color.red);
		Container contenido = getContentPane();
		contenido.setLayout(new FlowLayout());
		tabBoton=new JButton[nbotones];
		for (int i=0;i<nbotones;i++){
			tabBoton[i]=new JButton ("Boton"+i);
			contenido.add(tabBoton[i]);
			tabBoton[i].addActionListener(this);}
		setDefaultCloseOperation(EXIT_ON_CLOSE);}	
	public void actionPerformed(ActionEvent ev){
		System.out.print("Estado de los botones : ");
		for (int i=0;i<tabBoton.length;i++)
			System.out.print(tabBoton[i].isEnabled() + "  ");
		System.out.println();
		JButton fuente = (JButton) ev.getSource();
		System.out.println("Ahora desactivamos el boton " + fuente.getActionCommand());
		fuente.setEnabled(false);	}
	private JButton tabBoton[];}
public class Main1CrearBoton2{
	public static void main (String arg[]){
		Scanner kyd=new Scanner(System.in);
		System.out.println("Ingrese la cantidad de botones");
		int nbotones=kyd.nextInt();
		VentBotonDin1 venBD=new VentBotonDin1(nbotones);
		venBD.setVisible(true);}}
