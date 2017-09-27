import javax.swing.*; // JFrame JPanel
import java.awt.*; //FlowLayout y Container
import java.awt.event.*;

class MiVentana extends JFrame implements ActionListener {
	public MiVentana (){//constructor
		setTitle("Campo de texto");
		setSize(300,150);
		Container contenido = getContentPane();
		contenido.setLayout(new FlowLayout());
		entrada = new JTextField(20);
		contenido.add(entrada);
		entrada.addActionListener(this);
		boton = new JButton("Copiar");
		contenido.add(boton);
		boton.addActionListener(this);		
		copia = new JTextField(20);
		copia.setEditable(false);
		contenido.add(copia);}
		
	