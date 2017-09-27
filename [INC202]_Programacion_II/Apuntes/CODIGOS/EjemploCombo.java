import javax.swing.*; // JFrame JPanel
import java.awt.*; //FlowLayout y Container
import java.awt.event.*;
import javax.swing.event.*;

class Combo extends JFrame implements  ActionListener, ItemListener { 
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
public void actionPerformed(ActionEvent ev) {
	System.out.println("accion combo");
Object valor = combo.getSelectedItem();
	System.out.println((String) valor);}
	
	public void itemStateChanged(ItemEvent ev) {
	 if (ev.getStateChange() == ItemEvent.SELECTED){
		System.out.println("item combo");
		Object valor = combo.getSelectedItem();
		System.out.println((String) valor);}}
		private String [] colores= {"rojo","verde","azul","negro","blanco"};
		private JComboBox combo;}
	
	public class EjemploCombo{
	public static void main (String args[]){
		Combo ven= new Combo();
		ven.setVisible(true);}}