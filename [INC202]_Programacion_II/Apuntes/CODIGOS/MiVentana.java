import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.event.*;

class MiPanel extends JPanel {
	public MiPanel(JFrame f) {
		frame=f;
		add(texto);
		add(label);
		texto.addActionListener(listener);}
	
	public void updateLabel() {
		label.setText(texto.getText());
		frame.setTitle(texto.getText());}
	private JLabel label = new JLabel("Aparece aqui");
	private JTextField texto = new JTextField(20);
	private MiListener listener = new MiListener(this);
	private JFrame frame;}

class MiListener implements ActionListener {	
	public MiListener(MiPanel panref) {
		pan = panref;}
	
	public void actionPerformed( ActionEvent e) {
		pan.updateLabel();
	}private MiPanel pan;}

public class MiVentana extends JFrame {
	MiPanel pan = new MiPanel(this);
	public MiVentana(){
		setTitle("Mimica");
		setSize( 250, 100);
		getContentPane().add(pan);}
	
	public static void main( String[] args) {
		MiVentana ven = new MiVentana();
		ven.setVisible(true);}}