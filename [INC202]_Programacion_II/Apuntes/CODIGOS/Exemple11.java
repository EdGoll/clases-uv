import javax.swing.*; // JFrame JPanel
import java.awt.*; //FlowLayout y Container
import java.awt.event.*;
import javax.swing.event.*;

class Ejemplo extends JFrame implements ActionListener { 
	public Ejemplo() { 
		setTitle("Botones+acciones");
		setSize(300,150);
 
		//ven.addActionListener(this); 
		Container contenido = getContentPane();
		contenido.setLayout(new FlowLayout());
		
		botonMas = new JButton("mas"); 
		botonMenos = new JButton("menos"); 
		botonMenos.addActionListener(this); 
		botonMas.addActionListener(this); 
		contenido.add(botonMenos);
		contenido.add(botonMas);		
		label = new JLabel("0", JLabel.CENTER); 
		contenido.add(label);
	}
public void actionPerformed(ActionEvent event) {
	if(event.getSource() == botonMas) 
		{count++;} 
	else {count--;} 
	label.setText(Integer.toString(count));}

	private int count = 0; 
	private JLabel label; 
	private JButton botonMenos; 
	private JButton botonMas;}
public class Exemple11{
	public static void main (String args[]){
		Ejemplo ven= new Ejemplo();
		ven.setVisible(true);}}