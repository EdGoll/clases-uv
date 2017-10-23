import java.awt.Container;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;


public class Gui02 extends JFrame{
	
	private Container panel;
	private JButton miboton;
	
	public Gui02(){
		super("Ejemplo Layout");		
		setLayout(new FlowLayout(FlowLayout.LEFT,10,20));
		for(int i=0;i<10;i++){
			add(new JButton("Componente "+i));
		}		
		this.setSize(800,600);
		this.setVisible(true);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	
	public static void main(String args[]){
		Gui02 app = new Gui02();
	}

}
