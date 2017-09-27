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
	
public void actionPerformed(ActionEvent ev) {
	nClick ++;
	contar.setText("Numero de click sobre el boton: "+nClick);}
	
	private JButton boton;
	private JLabel contar;
	private int nClick;}
	
	public class BotonClick{
	public static void main (String args[]){
		Ventana ven= new Ventana();
		ven.setVisible(true);}}