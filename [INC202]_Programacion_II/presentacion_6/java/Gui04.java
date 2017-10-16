import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;


public class Gui04 extends JFrame{
	
	private Container panel;
	private JButton miboton;
	
	public Gui04(){
		super("Ejemplo Layout");
		
		
		setLayout(new GridLayout(4,3,5,5));
		for(int i=0;i<10;i++){
			add(new JButton(""+i));
		}
		
		this.setSize(400,400);
		this.setVisible(true);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	
	public static void main(String args[]){
		Gui04 app = new Gui04();
	}

}
