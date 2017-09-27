import javax.swing.*; // JFrame JPanel
import java.awt.*; //FlowLayout y Container
import java.awt.event.*;
class MiVentana extends JFrame implements ActionListener {
	public MiVentana (){//constructor
		setTitle("Dibujando en el panel");
		setSize(300,150);
		Container contenido = getContentPane();
		//creo el panel para el dibujo
		panel = new Panel();
		panel.setBackground(Color.cyan);
		contenido.add(panel);
		//crear el boton "rectangulo"
		rectangulo = new JButton("Rectangulo");
		contenido.add(rectangulo, "West");
		rectangulo.addActionListener(this);
		//crear el boton "ovalo"
		ovalo = new JButton("Ovalo");
		contenido.add(ovalo, "East");
		ovalo.addActionListener(this);}
