import javax.swing.*; // JFrame JPanel
import javax.swing.event.*;
import java.awt.*; //FlowLayout y Container
import java.awt.event.*;


class MiVentanas extends JFrame implements DocumentListener {
	public MiVentanas (){//constructor
		setTitle("Espejo");
		setSize(300,150);
		Container contenido = getContentPane();
		contenido.setLayout(new FlowLayout());
		entrada = new JTextField(20);
		contenido.add(entrada);
		
		entrada.getDocument().addDocumentListener(this);
		copia = new JTextField(20);
		copia.setEditable(true);
		contenido.add(copia);}
		
