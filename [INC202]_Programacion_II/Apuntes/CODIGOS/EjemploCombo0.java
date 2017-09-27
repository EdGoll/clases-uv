import javax.swing.*; // JFrame JPanel
import java.awt.*; //FlowLayout y Container
import java.awt.event.*;
import javax.swing.event.*;

class Combo extends JFrame implements ActionListener, ItemListener { 
	public Combo() { 
		setTitle("Combo");
		setSize(300,150);
 
		//ven.addActionListener(this); 
		Container contenido = getContentPane();
		contenido.setLayout(new FlowLayout());
		combo=new JComboBox(colores);
		combo.setEditable(true);
		contenido.add(combo);
		combo.addActionListener(this); 
		combo.addItemListener(this);
		}
