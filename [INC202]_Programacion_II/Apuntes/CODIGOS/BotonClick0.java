import javax.swing.*; // JFrame JPanel
import java.awt.*; //FlowLayout y Container
import java.awt.event.*;
import javax.swing.event.*;

class Ventana extends JFrame implements ActionListener { 
	public Ventana() { 
		setTitle("Combo");
		setSize(300,150);
 
		//ven.addActionListener(this); 
		Container contenido = getContentPane();
		contenido.setLayout(new FlowLayout());
		boton=new JButton("Contar");
		boton.addActionListener(this);
		contenido.add(boton);
		nClick=0;
		contar = new JLabel("Numero de click sobre el boton: "+nClick);
		contenido.add(contar);}
	
