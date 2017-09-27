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