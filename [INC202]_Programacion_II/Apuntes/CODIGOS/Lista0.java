import javax.swing.*; // JFrame JPanel
import java.awt.*; //FlowLayout y Container
import java.awt.event.*;
import javax.swing.event.*;

class MiVentana extends JFrame implements ListSelectionListener {
	public MiVentana (){//constructor
		setTitle("Campo de texto");
		setSize(300,150);
		Container contenido = getContentPane();
		contenido.setLayout(new FlowLayout());
		lista = new JList(colores);
		contenido.add(lista);
		lista.addListSelectionListener(this);}
	