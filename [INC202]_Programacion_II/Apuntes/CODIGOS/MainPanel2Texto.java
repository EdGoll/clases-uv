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
		
	public void insertUpdate(DocumentEvent Document){
		String texto = entrada.getText();
		copia.setText(texto);
		}
	public void removeUpdate(DocumentEvent Document){
		String texto = entrada.getText();
		copia.setText(texto);
	}
	public void changedUpdate(DocumentEvent Document){}
	private JTextField entrada, copia;
	}

public class MainPanel2Texto{
	public static void main (String args[]){
		MiVentanas ven= new MiVentanas();
		ven.setVisible(true);}}