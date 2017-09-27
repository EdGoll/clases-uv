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
		combo.addActionListener(this); 
		
	}
	public void actionPerformed(ActionEvent ev) {
		System.out.println("accion combo - ");
		Object valor = combo.getSelectedItem();
		int rango = combo.getSelectedIndex();
		if (rango==-1){
		System.out.println("ingreso de un nuevo valor " + valor);
		combo.addItem(valor);}
		else {
		System.out.println("selecciona un valor existente " + valor + "de rango " + rango);}
	}
							   
		private String [] colores= {"rojo","verde","azul","negro","blanco"};
		private JComboBox combo;}
			
	public class EjemploComboDin{
		public static void main (String args[]){
		Combo ven= new Combo();
		ven.setVisible(true);}}