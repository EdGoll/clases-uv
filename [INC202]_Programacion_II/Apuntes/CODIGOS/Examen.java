import javax.swing.*; 
import java.awt.*; 
import java.awt.event.*;
import javax.swing.event.*;

class Test extends JFrame implements ActionListener { 
	public Test() { 
		setTitle("Examen");
		setSize(300,150);
 		Container contenido = getContentPane();
		contenido.setLayout(new FlowLayout());
		
		botonA = new JButton("Accion 1"); 
		botonB = new JButton("Accion 2"); 
		botonA.addActionListener(this); 
		botonB.addActionListener(this); 
		contenido.add(botonA);
		contenido.add(botonB);		
		label = new JLabel("0", JLabel.CENTER); 
		contenido.add(label);}
public void actionPerformed(ActionEvent event) {
	if(event.getSource() == botonA) 
		{coun+=2;} 
	else {coun-=2;} 
	label.setText(Integer.toString(coun));}

	private int coun = 0; 
	private JLabel label; 
	private JButton botonA; 
	private JButton botonB;}
public class Examen{
	public static void main (String args[]){
		Test ven= new Test();
		ven.setVisible(true);}}