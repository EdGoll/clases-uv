import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;


public class Gui03 extends JFrame{
	
	private Container panel;
	private JButton miboton;
	
	public Gui03(){
		super("Ejemplo Layout");
		
		
		setLayout(new BorderLayout(5,10));
		add(new JButton("1"), BorderLayout.NORTH);
		add(new JButton("2"), BorderLayout.WEST);
		add(new JButton("3"), BorderLayout.CENTER);
		add(new JButton("4"), BorderLayout.EAST);
		add(new JButton("5"), BorderLayout.SOUTH);					
				
		this.setSize(800,600);
		this.setVisible(true);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	
	public static void main(String args[]){
		Gui03 app = new Gui03();
	}

}
