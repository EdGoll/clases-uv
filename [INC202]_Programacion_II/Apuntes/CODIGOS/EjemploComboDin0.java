import javax.swing.*; // JFrame JPanel
import java.awt.*; //FlowLayout y Container
import java.awt.event.*;
import javax.swing.event.*;

class Combo extends JFrame implements ActionListener { 
	public Combo() { 
		setTitle("Combo dinamico");
		setSize(300,150);
		
		//ven.addActionListener(this); 
		Container contenido = getContentPane();
		contenido.setLayout(new FlowLayout());
		combo=new JComboBox(colores);
		combo.setEditable(true);
		combo.setMaximumRowCount(8);
		contenido.add(combo);
		combo.addActionListener(this); }
