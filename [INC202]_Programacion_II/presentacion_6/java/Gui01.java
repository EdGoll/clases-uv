import java.awt.Container;

import javax.swing.JButton;
import javax.swing.JFrame;


public class Gui01 extends JFrame{
	
	private Container panel;
	private JButton miboton;
	
	public Gui01(){
		super("Ejemplo con btn");
		miboton = new JButton("Aceptar");
		panel = getContentPane();
		panel.add(miboton);

		this.setSize(800,600);
		this.setVisible(true);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	
	public static void main(String args[]){
		Gui01 app = new Gui01();
	}

}
