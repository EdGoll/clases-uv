import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.event.*;

class MimicGUI extends JPanel {
	private JLabel label = new JLabel(" Echo appears here");
	private JTextField quote = new JTextField(20);
	private MimicListener listener = new MimicListener( this);
	private JFrame frame;
	public MimicGUI(JFrame f) {
		frame=f;
		// add quote and label to window
		add(quote);
		add(label);
		// register listener with quote object
		quote.addActionListener(listener);
	}
	public void updateLabel() {
		label.setText(quote.getText());
		frame.setTitle(quote.getText());
	}
}
public class Mimic extends JFrame {
	
	MimicGUI gui = new MimicGUI(this);
	
	public Mimic(){
		setTitle("Mimic");
		setSize( 250, 100);
		getContentPane().add(gui);}
		
	public static void main( String[] args) {
		Mimic mimic = new Mimic();
		mimic.setVisible(true);}
}
class MimicListener implements ActionListener {
	private MimicGUI gui;
	public MimicListener( MimicGUI guiref) {
		gui = guiref;
	}
	// method required by action listener interface
	public void actionPerformed( ActionEvent e) {
		gui.updateLabel();
	}}